
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Login from './components/Login';
import AdminDashboard from './components/AdminDashboard';
import SignUp from './components/SignUp';
import Logout from './components/Logout';
import CustomerDashboard from './components/CustomerDashboard';


function App() {
  return (
    <div className="App">
      <BrowserRouter>
      
      <Routes>
        <Route path='/' element={<Login/>}></Route>
        <Route path='/signup' element={<SignUp/>}></Route>
        <Route path='/logout' element={<Logout/>}></Route>
        <Route path='/customer' element={<CustomerDashboard/>}></Route>
        <Route path='/admin' element={<AdminDashboard/>}></Route>
      </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;