// src/pages/Explorar.jsx
import React from 'react';
import { Link } from 'react-router-dom';
import Header from '../components/Header';
import cachoeira from "../components/cachoeira.png";
import xandao from "../components/xandao.jpg";

function Explorar() {
  return (
    <div>
      <Header />
      <main style={{ padding: '2rem', display: 'grid', gridTemplateColumns: 'repeat(auto-fit, minmax(280px, 1fr))', gap: '1.5rem' }}>

        <div style={{ backgroundColor: 'white', borderRadius: '8px', boxShadow: '0 2px 8px rgb(0 0 0 / 0.1)', padding: '1rem' }}>
          <img src={cachoeira} alt="Cachoeira" style={{ width: '100%', borderRadius: '8px', marginBottom: '1rem' }} />
          <h2 style={{ fontSize: '1.25rem', fontWeight: '600', marginBottom: '0.5rem' }}>Cachoeira Azul</h2>
          <p style={{ fontSize: '0.9rem', color: '#6b7280', marginBottom: '1rem' }}>
            Uma das mais belas quedas d’água da região, ideal para trilhas e banho.
          </p>
          <Link to="/descricao" style={{ 
            backgroundColor: '#3b82f6', color: 'white', padding: '0.5rem 1rem', borderRadius: '6px', textDecoration: 'none', display: 'inline-block'
          }}>
            Ver mais
          </Link>
        </div>

                <div style={{ backgroundColor: 'white', borderRadius: '8px', boxShadow: '0 2px 8px rgb(0 0 0 / 0.1)', padding: '1rem' }}>
          <img src={xandao} alt="Palácio" style={{ width: '100%', borderRadius: '8px', marginBottom: '1rem' }} />
          <h2 style={{ fontSize: '1.25rem', fontWeight: '600', marginBottom: '0.5rem' }}>Palácio do Planalto</h2>
          <p style={{ fontSize: '0.9rem', color: '#6b7280', marginBottom: '1rem' }}>
            Sede do Poder Executivo em Brasília.
          </p>
          <Link to="/descricao" style={{ 
            backgroundColor: '#3b82f6', color: 'white', padding: '0.5rem 1rem', borderRadius: '6px', textDecoration: 'none', display: 'inline-block'
          }}>
            Ver mais
          </Link>
        </div>

      </main>
    </div>
  );
}

export default Explorar;
