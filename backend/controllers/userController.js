const bcrypt = require('bcrypt');
const jwt = require('jsonwebtoken');
const pool = require('../config/db');

exports.register = async (req, res) => {
  const { nome, email, senha, tipousuario } = req.body;
  try {
    const hashedPassword = await bcrypt.hash(senha, 10);
    await pool.query(
      'INSERT INTO usuario (nome, email, senha, tipousuario) VALUES ($1, $2, $3, $4)',
      [nome, email, hashedPassword, tipousuario]
    );
    res.status(201).json({ message: 'Usuário registrado com sucesso' });
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Erro no cadastro' });
  }
};

exports.login = async (req, res) => {
  const { email, senha } = req.body;

  try {
    const result = await pool.query('SELECT * FROM usuario WHERE email = $1', [email]);

    if (result.rows.length === 0) {
      return res.status(401).json({ error: 'Usuário não encontrado' });
    }

    const user = result.rows[0];
    const validPassword = await bcrypt.compare(senha, user.senha);

    if (!validPassword) {
      return res.status(401).json({ error: 'Senha incorreta' });
    }

    const token = jwt.sign(
      { id: user.id, tipo: user.tipousuario },
      process.env.JWT_SECRET,
      { expiresIn: '1d' }
    );

    res.json({ token, user });

  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Erro ao fazer login' });
  }
};

exports.updateUser = async (req, res) => {
  const { id } = req.params;
  const { nome, sobrenome, email, cpf, telefone } = req.body;

  try {
    // Buscar o tipo atual do usuário no banco
    const current = await pool.query('SELECT tipousuario FROM usuario WHERE id = $1', [id]);
    const tipousuario = current.rows[0]?.tipousuario || 'comum';

    await pool.query(
      'UPDATE usuario SET nome = $1, sobrenome = $2, email = $3, cpf = $4, telefone = $5, tipousuario = $6 WHERE id = $7',
      [nome, sobrenome, email, cpf, telefone, tipousuario, id]
    );

    res.json({ message: 'Usuário atualizado com sucesso' });
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Erro ao atualizar usuário' });
  }
};


exports.deleteUser = async (req, res) => {
  const { id } = req.params;
  try {
    await pool.query('DELETE FROM usuario WHERE id = $1', [id]);
    res.status(200).json({ message: 'Usuário deletado com sucesso' });
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: 'Erro ao deletar usuário' });
  }
};
