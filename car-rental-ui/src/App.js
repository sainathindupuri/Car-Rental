import logo from './logo.svg';
import './App.css';
import React, { Component } from 'react';
import { BrowserRouter, Routes, Route, } from "react-router-dom"
import LoginScreen from './login';
import AdminDashboard from './AdminDashboard';
import UserSearch from './UserSearch';

class App extends Component {
  constructor(props) {
    super(props);

  }

  render() {
    return (
      <div className="App">

        <BrowserRouter>
          <Routes>
            <Route index element={<LoginScreen {...this.props}/>} />
            <Route path="/"  element={<LoginScreen {...this.props}/>} />
            <Route path="/Admin" element={<AdminDashboard />} />
            <Route path="/User" element={<UserSearch />} />
          </Routes>
        </BrowserRouter>

      </div>
    )

  }

}

export default App;
