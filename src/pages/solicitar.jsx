// src/pages/Solicitar.jsx
import React from 'react';
import Header from '../components/Header';

function Solicitar() {
  return (
    <div>
      <Header />
      <main style={{ maxWidth: '500px', margin: '2rem auto', backgroundColor: 'white', borderRadius: '8px', padding: '2rem', boxShadow: '0 2px 8px rgb(0 0 0 / 0.1)' }}>
        <input type="text" placeholder="Nome do ponto" style={inputStyle} />
        <textarea placeholder="Descrição" style={{ ...inputStyle, height: '100px' }} />
        <input type="text" placeholder="Localização" style={inputStyle} />
        <input type="file" style={inputStyle} />
        <button style={buttonStyle}>Enviar solicitação</button>
      </main>
    </div>
  );
}

const inputStyle = {
  width: '100%',
  padding: '0.5rem',
  marginBottom: '1rem',
  borderRadius: '6px',
  border: '1px solid #d1d5db',
  fontSize: '1rem',
};

const buttonStyle = {
  width: '100%',
  padding: '0.75rem',
  backgroundColor: '#3b82f6',
  color: 'white',
  fontWeight: '600',
  border: 'none',
  borderRadius: '6px',
  cursor: 'pointer',
};

export default Solicitar;
