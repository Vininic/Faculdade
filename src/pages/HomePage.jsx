import React, { useEffect, useState } from 'react';
import './HomePage.css';

function HomePage() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  useEffect(() => {
    const token = localStorage.getItem('token');
    setIsLoggedIn(!!token);
  }, []);

  return (
    <div>
      <header>
        <div className="logo">
          Pontos Turísticos <span className="subtitle">Protótipo do Sistema</span>
        </div>
        <nav>
          <a href="/pontos">Pontos</a>
          <a href="/eventos">Eventos</a>
          <a href="#">Mapa</a>
        </nav>
        {isLoggedIn ? (
          <a href="/profile" className="login-button">Perfil</a>
        ) : (
          <a href="/login" className="login-button">Login</a>
        )}
      </header>

      <section className="main">
        <div className="main-text">
          <h1>Pesquise e avalie pontos turísticos</h1>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
          <div className="buttons">
            <a href="/explorar" className="btn-primary">Descobrir</a>
            <a href="#" className="btn-outline">Histórico</a>
          </div>
        </div>
        <div className="illustration">
          <span>[Ilustração Aqui]</span>
        </div>
      </section>
    </div>
  );
}
export default HomePage;