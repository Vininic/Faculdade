import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './ProfilePage.css';
import { useNavigate } from 'react-router-dom';

function ProfilePage() {
  const [user, setUser] = useState(null);
  const [activeTab, setActiveTab] = useState('editar');
  const [fotoPreview, setFotoPreview] = useState(null);
  const navigate = useNavigate();
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  useEffect(() => {
    const token = localStorage.getItem('token');
    const userData = localStorage.getItem('user');

    setIsLoggedIn(!!token);

    if (!token || !userData) {
      navigate('/login');
    } else {
      setUser(JSON.parse(userData));
    }
  }, [navigate]);

  const handleLogout = () => {
    localStorage.removeItem('token');
    localStorage.removeItem('user');
    navigate('/');
  };

  const handleDelete = async () => {
    if (!user) return;
    const confirm = window.confirm('Tem certeza que deseja apagar sua conta? Essa ação não poderá ser desfeita.');
    if (confirm) {
      try {
        await axios.delete(`http://localhost:5000/api/users/${user.id}`);
        alert('Conta apagada com sucesso.');
        handleLogout();
      } catch (err) {
        console.error(err);
        alert('Erro ao apagar conta.');
      }
    }
  };

  const handleFotoChange = (e) => {
    const file = e.target.files[0];
    if (file) {
      const reader = new FileReader();
      reader.onloadend = () => {
        setFotoPreview(reader.result);
      };
      reader.readAsDataURL(file);
    }
  };

  const handleFotoRemover = () => {
    setFotoPreview(null);
  };

  if (!user) return <p>Carregando perfil...</p>;

  return (
    <div>
      <header>
        <div className="logo">
          <a href="/" className="logo-link">Pontos Turísticos</a> <span className="subtitle">Perfil</span>
        </div>

        <nav className="nav-center">
          <a href="/pontos">Pontos</a>
          <a href="/eventos">Eventos</a>
          <a href="#">Mapa</a>
        </nav>

        {isLoggedIn ? (
          <button onClick={handleLogout} className="logout-button">Sair</button>
        ) : (
          <a href="/login" className="login-button">Login</a>
        )}
      </header>

      <div className="profile-container">
        <div className="tabs">
          <button
            className={activeTab === 'editar' ? 'active' : ''}
            onClick={() => setActiveTab('editar')}
          >
            Editar Perfil
          </button>
          <button
            className={activeTab === 'notificacoes' ? 'active' : ''}
            onClick={() => setActiveTab('notificacoes')}
          >
            Notificações
          </button>
        </div>

        <div className="tab-content">
          {activeTab === 'editar' && (
            <div className="perfil-info">
              <div className="foto-caixa">
                <div className="foto-preview">
                  {fotoPreview ? (
                    <img src={fotoPreview} alt="Foto de perfil" />
                  ) : (
                    <div className="foto-placeholder">📷</div>
                  )}
                </div>
                <div className="foto-botoes">
                  <label className="upload-btn">
                    Enviar Foto
                    <input type="file" accept="image/*" onChange={handleFotoChange} hidden />
                  </label>
                  <button type="button" onClick={handleFotoRemover}>Remover</button>
                  <p className="requisitos">Requisitos de imagem: JPG ou PNG, até 2MB</p>
                </div>
              </div>

              <form
                onSubmit={async (e) => {
                  e.preventDefault();
                  try {
                    await axios.put(`http://localhost:5000/api/users/${user.id}`, {
                      nome: user.nome,
                      sobrenome: user.sobrenome,
                      email: user.email,
                      cpf: user.cpf || '',
                      telefone: user.telefone || '',
                      tipousuario: user.tipousuario || 'comum'
                    });
                    alert('Perfil atualizado com sucesso!');
                    localStorage.setItem('user', JSON.stringify({
                      ...user,
                      tipousuario: user.tipousuario || 'comum'
                    }));
                  } catch (err) {
                    console.error(err);
                    alert('Erro ao atualizar perfil.');
                  }
                }}
              >
                <div className="linha-dupla">
                  <div className="campo">
                    <label>Nome:</label>
                    <input
                      type="text"
                      value={user.nome}
                      onChange={(e) => setUser({ ...user, nome: e.target.value })}
                      required
                    />
                  </div>
                  <div className="campo">
                    <label>Sobrenome:</label>
                    <input
                      type="text"
                      value={user.sobrenome || ''}
                      onChange={(e) => setUser({ ...user, sobrenome: e.target.value })}
                    />
                  </div>
                </div>

                <label>Email:</label>
                <input
                  type="email"
                  value={user.email}
                  onChange={(e) => setUser({ ...user, email: e.target.value })}
                  required
                />

                <label>CPF:</label>
                <input
                  type="text"
                  value={user.cpf || ''}
                  onChange={(e) => setUser({ ...user, cpf: e.target.value })}
                />

                <label>Telefone:</label>
                <input
                  type="text"
                  value={user.telefone || ''}
                  onChange={(e) => setUser({ ...user, telefone: e.target.value })}
                />

                <button type="submit" className="save-button">Salvar Alterações</button>
              </form>

              <button className="delete-button" onClick={handleDelete}>Apagar Conta</button>
            </div>
          )}

          {activeTab === 'notificacoes' && (
            <div className="perfil-info">
              <p>Nenhuma notificação no momento.</p>
            </div>
          )}
        </div>
      </div>
    </div>
  );
}

export default ProfilePage;