import React from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import Signup from './pages/Signup';
import Login from './pages/Login';

const App = () => {
  return (
    <Router>
      <div>
        <h1>Welcome to Authentication System</h1>
        
        {/* Links for navigation */}
        <nav>
          <Link to="/signup" style={{ marginRight: '20px' }}>Signup</Link>
          <Link to="/login">Login</Link>
        </nav>

        {/* Define Routes for Signup and Login */}
        <Routes>
          <Route path="/signup" element={<Signup />} />
          <Route path="/login" element={<Login />} />
        </Routes>
      </div>
    </Router>
  );
};

export default App;
