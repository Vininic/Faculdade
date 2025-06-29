import React, { useState } from 'react';
import axios from 'axios';
import { Link, useNavigate } from 'react-router-dom';
import './AuthPage.css';

function LoginPage() {
  const [email, setEmail] = useState('');
  const [senha, setSenha] = useState('');
  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const res = await axios.post('http://localhost:5000/api/users/login', { email, senha });
      alert('Login realizado!');
      localStorage.setItem('token', res.data.token);
      localStorage.setItem('user', JSON.stringify(res.data.user));
      navigate('/');
    } catch (err) {
      alert('Erro ao logar');
    }
  };

  return (
    <div className="auth-container">
      <div className="auth-box">
        <h2>Faça login para continuar</h2>
        <form onSubmit={handleSubmit}>
          <label>Endereço de E-mail</label>
          <input
            type="email"
            placeholder="Placeholder"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            required
          />

          <label>Senha</label>
          <input
            type="password"
            placeholder="Placeholder"
            value={senha}
            onChange={(e) => setSenha(e.target.value)}
            required
          />
          <small>Deve conter uma combinação de pelo menos 8 letras, números ou símbolos.</small>

<div className="login-options">
  <label className="checkbox-group">
    <input type="checkbox" />
    Lembre-me
  </label>
  <a href="#" className="forgot-link">Esqueceu a senha?</a>
</div>


          <button type="submit">Login</button>
        </form>

        <div className="social-login">
          <p>Ou entre com:</p>
          <button><span>🔵</span> Google</button>
          <button><span>🍎</span> Apple</button>
        </div>

        <div className="footer-link">
          <p>Não possui conta? <Link to="/register">Cadastre-se</Link></p>
        </div>
      </div>
    </div>
  );
}

export default LoginPage;