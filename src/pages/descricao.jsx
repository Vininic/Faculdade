import React from 'react';
import { Link } from 'react-router-dom';
import Header from '../components/Header';
import cachoeira from "../components/cachoeira.png";

function Descricao() {
  return (
    <div>
      <Header />
      <main style={{ maxWidth: '800px', margin: '2rem auto', backgroundColor: 'white', borderRadius: '8px', padding: '2rem', boxShadow: '0 2px 8px rgb(0 0 0 / 0.1)' }}>
        <img src={cachoeira} alt="Cachoeira" style={{ width: '100%', borderRadius: '8px', marginBottom: '1.5rem' }} />
        <h2 style={{ fontSize: '2rem', fontWeight: '700', marginBottom: '1rem' }}>Cachoeira Azul</h2>
        <p style={{ fontSize: '1.1rem', color: '#4b5563' }}>
          Esta cachoeira é um dos destinos mais procurados da região. Rodeada por natureza exuberante, oferece trilhas, áreas para piquenique e banho em águas cristalinas. Ideal para famílias e amantes do ecoturismo.
        </p>
        <Link to="/explorar" style={{ display: 'inline-block', marginTop: '1.5rem', color: '#3b82f6', textDecoration: 'underline' }}>
          Voltar
        </Link>
      </main>
    </div>
  );
}

export default Descricao;