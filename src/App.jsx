import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import HomePage from './pages/HomePage';
import LoginPage from './pages/LoginPage';
import RegisterPage from './pages/RegisterPage';
import ProfilePage from './pages/ProfilePage';
import Explorar from './pages/explorar';
import Descricao from './pages/descricao';
import Eventos from './pages/eventos';
import Solicitar from './pages/solicitar';
import Aceitar from './pages/aceitar';
import Editar from './pages/editar';
import Pontos from './pages/pontos';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/login" element={<LoginPage />} />
        <Route path="/register" element={<RegisterPage />} />
        <Route path="/profile" element={<ProfilePage />} />
        <Route path="/explorar" element={<Explorar />} />
        <Route path="/descricao" element={<Descricao />} />
        <Route path="/eventos" element={<Eventos />} />
        <Route path="/solicitar" element={<Solicitar />} />
        <Route path="/aceitar" element={<Aceitar />} />
        <Route path="/editar" element={<Editar />} />
        <Route path="/pontos" element={<Pontos />} />
      </Routes>
    </Router>
  );
}

export default App;