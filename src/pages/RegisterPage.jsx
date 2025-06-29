import React, { useState } from 'react';
import axios from 'axios';
import { Link, useNavigate } from 'react-router-dom';
import './AuthPage.css';

function RegisterPage() {
  const [form, setForm] = useState({ nome: '', sobrenome: '', email: '', senha: '' });
  const navigate = useNavigate();

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post('http://localhost:5000/api/users/register', {
        ...form,
        tipousuario: 'comum'
      });
      alert('Cadastro realizado com sucesso!');
      navigate('/login');
    } catch (err) {
      alert('Erro ao cadastrar. Verifique os dados.');
    }
  };

  return (
    <div className="auth-container">
      <div className="auth-box">
        <h2>Cadastro</h2>
        <form onSubmit={handleSubmit}>
<div className="row">
  <div style={{ flex: 1 }}>
    <label>Nome</label>
    <input
      type="text"
      name="nome"
      placeholder="Placeholder"
      value={form.nome}
      onChange={handleChange}
      required
    />
  </div>
  <div style={{ flex: 1 }}>
    <label>Sobrenome</label>
    <input
      type="text"
      name="sobrenome"
      placeholder="Placeholder"
      value={form.sobrenome || ''}
      onChange={handleChange}
    />
  </div>
</div>

          <label>Email</label>
          <input
            name="email"
            type="email"
            placeholder="Placeholder"
            value={form.email}
            onChange={handleChange}
            required
          />

          <label>Senha</label>
          <input
            name="senha"
            type="password"
            placeholder="Placeholder"
            value={form.senha}
            onChange={handleChange}
            required
          />

<div className="terms">
  <label className="checkbox-group">
    <input type="checkbox" required />
    Concordo com os termos de uso (Obrigatório).
  </label>
</div>


          <button type="submit">Confirmar</button>
        </form>

        <div className="social-login">
          <p>Ou entre com:</p>
          <button><span>🔵</span> Google</button>
          <button><span>🍎</span> Apple</button>
        </div>

        <div className="footer-link">
          <p>Já possui conta? <Link to="/login">Entrar</Link></p>
        </div>
      </div>
    </div>
  );
}

export default RegisterPage;