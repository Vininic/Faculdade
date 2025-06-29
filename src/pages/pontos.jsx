import React from "react";
import Header from "../components/header";
import { Link } from "react-router-dom";
import "./Pontos.css"; // CSS opcional para estilizar os links

function Pontos() {
  return (
    <>
      <Header />
      <main className="pontos-container">
        <h2>Gerenciar Pontos Turísticos</h2>
        <ul className="pontos-links">
          <li>
            <Link to="/solicitar">Solicitar Ponto</Link>
          </li>
          <li>
            <Link to="/aceitar">Aceitar Ponto</Link>
          </li>
          <li>
            <Link to="/editar">Editar Ponto</Link>
          </li>
        </ul>
      </main>
    </>
  );
}

export default Pontos;