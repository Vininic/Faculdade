import React from 'react';
import Header from '../components/Header';
import { Link } from 'react-router-dom';

function Eventos() {
  return (
    <div>
      <Header />
      <main style={{ maxWidth: '700px', margin: '2rem auto', padding: '0 1rem' }}>
        <div style={{ backgroundColor: 'white', padding: '1rem 1.5rem', borderRadius: '8px', boxShadow: '0 2px 8px rgb(0 0 0 / 0.1)', marginBottom: '1rem' }}>
          <h2 style={{ fontSize: '1.25rem', fontWeight: '600' }}>Festival da Natureza</h2>
          <p style={{ fontSize: '0.85rem', color: '#6b7280' }}>10 a 15 de julho - Parque Municipal</p>
          <p style={{ marginTop: '0.5rem' }}>Um festival com música, oficinas, trilhas guiadas e gastronomia local.</p>
        </div>
        <div style={{ backgroundColor: 'white', padding: '1rem 1.5rem', borderRadius: '8px', boxShadow: '0 2px 8px rgb(0 0 0 / 0.1)' }}>
          <h2 style={{ fontSize: '1.25rem', fontWeight: '600' }}>Caminhada Ecológica</h2>
          <p style={{ fontSize: '0.85rem', color: '#6b7280' }}>22 de julho - Trilha da Serra</p>
          <p style={{ marginTop: '0.5rem' }}>Atividade para todas as idades, com guia ambiental.</p>
        </div>
      </main>
    </div>
  );
}

export default Eventos;
