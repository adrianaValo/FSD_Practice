
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.js';

import {BrowserRouter,Navigate,Routes,Route} from "react-router-dom";
import Navigation from './components/Navigation';
import AboutUs from './components/AboutUs';
import Home from './components/Home';
import Contact from './components/Contact';

import UniversityList from './components/UniversityList';
import UnList from './components/UnList';
import AxiosGetExample from './components/AxiosGetExample';



function App() {
  return (
    <BrowserRouter>
      <Navigation/>

      <Routes>
      <Route path='/' element={<Navigate to="/home" replace/>}></Route>
            <Route path='/home' element={<Home/>}></Route>
            <Route path='/about' element={<AboutUs/>}></Route>
            <Route path='/contact' element={<Contact/>}></Route>
            <Route path='/list' element={<UniversityList/>}></Route>
            <Route path= '/unlist' element= {<UnList/>}></Route>
            <Route path= '/example' element= {<AxiosGetExample/>}></Route>
      </Routes>

    
    </BrowserRouter>
  );
}

export default App;
