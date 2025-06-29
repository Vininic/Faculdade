// src/pages/Aceitar.jsx
import React from 'react';
import Header from '../components/Header';

function Aceitar() {
  return (
    <div>
      <Header />
      <main style={{ maxWidth: '700px', margin: '2rem auto', padding: '0 1rem' }}>
        <div style={{ backgroundColor: 'white', padding: '1.5rem', borderRadius: '8px', boxShadow: '0 2px 8px rgb(0 0 0 / 0.1)' }}>
          <h2 style={{ fontSize: '1.25rem', fontWeight: '600' }}>Nova Cachoeira</h2>
          <p style={{ color: '#6b7280' }}>Descrição breve do ponto turístico sugerido.</p>
          <div style={{ marginTop: '1rem' }}>
            <button style={acceptButton}>Aceitar</button>
            <button style={rejectButton}>Rejeitar</button>
          </div>
        </div>
      </main>
    </div>
  );
}

const acceptButton = {
  backgroundColor: '#16a34a',
  color: 'white',
  padding: '0.5rem 1rem',
  borderRadius: '6px',
  border: 'none',
  marginRight: '0.5rem',
  cursor: 'pointer',
};

const rejectButton = {
  backgroundColor: '#dc2626',
  color: 'white',
  padding: '0.5rem 1rem',
  borderRadius: '6px',
  border: 'none',
  cursor: 'pointer',
};

export default Aceitar;
