-- Criar o banco de dados (execute fora do banco ou pule se já existir)
-- CREATE DATABASE pontosturisticos;

-- Conectar ao banco de dados (use no psql)
-- \c pontosturisticos;

DROP TABLE IF EXISTS solicitacao, evento, avaliacao, ponto_turistico, usuario CASCADE;

-- Tabela de usuários
CREATE TABLE usuario (
  id SERIAL PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  email TEXT NOT NULL UNIQUE,
  senha TEXT NOT NULL,
  tipousuario VARCHAR(20) NOT NULL
);

-- Tabela de pontos turísticos
CREATE TABLE ponto_turistico (
  id SERIAL PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  descricao TEXT NOT NULL,
  horariofuncionamento VARCHAR(100),
  localizacao VARCHAR(150) NOT NULL,
  banheiro_proximo VARCHAR(50),
  restaurante_proximo VARCHAR(50),
  loja_proxima VARCHAR(50)
);

-- Tabela de avaliações
CREATE TABLE avaliacao (
  id SERIAL PRIMARY KEY,
  usuario_id INT REFERENCES usuario(id) ON DELETE CASCADE,
  ponto_id INT REFERENCES ponto_turistico(id) ON DELETE CASCADE,
  dataavaliacao DATE NOT NULL DEFAULT CURRENT_DATE,
  nota NUMERIC(2,1) NOT NULL CHECK (nota >= 0 AND nota <= 10),
  comentario TEXT,
  foto TEXT
);

-- Tabela de eventos
CREATE TABLE evento (
  id SERIAL PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  inicioevento DATE NOT NULL,
  fimevento DATE NOT NULL,
  precomedio NUMERIC(10,2),
  descricao TEXT,
  horariofuncionamento VARCHAR(100),
  ponto_id INT REFERENCES ponto_turistico(id) ON DELETE CASCADE
);

-- Tabela de solicitações
CREATE TABLE solicitacao (
  id SERIAL PRIMARY KEY,
  datasolicitacao DATE NOT NULL DEFAULT CURRENT_DATE,
  descricao TEXT NOT NULL,
  status VARCHAR(20) NOT NULL DEFAULT 'pendente',
  usuario_id INT REFERENCES usuario(id) ON DELETE CASCADE
);

-- Dados de exemplo
INSERT INTO usuario (nome, email, senha, tipousuario) VALUES
('Maria Oliveira', 'maria@email.com', 'senha123', 'comum'),
('João Souza', 'joao@email.com', 'senha456', 'admin');

INSERT INTO ponto_turistico (nome, descricao, horariofuncionamento, localizacao, banheiro_proximo, restaurante_proximo, loja_proxima) VALUES
('Cristo Redentor', 'Monumento icônico no Rio de Janeiro.', '08:00 - 18:00', 'Rio de Janeiro - RJ', 'Sim', 'Sim', 'Sim'),
('Praia de Copacabana', 'Praia famosa com calçadão e quiosques.', '24 horas', 'Copacabana - RJ', 'Sim', 'Sim', 'Sim');

INSERT INTO avaliacao (usuario_id, ponto_id, nota, comentario) VALUES
(1, 1, 9.0, 'Visual incrível!'),
(2, 2, 8.5, 'Muito agradável, ótimo para caminhar.');

INSERT INTO evento (nome, inicioevento, fimevento, precomedio, descricao, horariofuncionamento, ponto_id) VALUES
('Festival de Verão', '2025-01-05', '2025-01-10', 50.00, 'Evento com música ao vivo e gastronomia.', '14:00 - 22:00', 2);

INSERT INTO solicitacao (descricao, usuario_id) VALUES
('Adicionar informações sobre o Parque Nacional da Tijuca.', 1);

ALTER TABLE usuario ADD COLUMN sobrenome VARCHAR(100);
ALTER TABLE usuario ADD COLUMN telefone VARCHAR(20);
ALTER TABLE usuario ADD COLUMN cpf VARCHAR(20);
