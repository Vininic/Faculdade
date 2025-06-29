import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import "./Header.css";

function Header() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  useEffect(() => {
    const token = localStorage.getItem("token");
    setIsLoggedIn(!!token);
  }, []);

  return (
    <header>
      <Link to="/" className="logo">
        Pontos Turísticos <span className="subtitle">Protótipo do Sistema</span>
      </Link>

      <nav>
        <Link to="/pontos">Pontos</Link>
        <Link to="/eventos">Eventos</Link>
        <Link to="/#">Mapa</Link>
      </nav>

      {isLoggedIn ? (
        <Link to="/profile" className="login-button">Perfil</Link>
      ) : (
        <Link to="/login" className="login-button">Login</Link>
      )}
    </header>
  );
}

export default Header;