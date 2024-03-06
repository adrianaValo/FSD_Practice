import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.js';
import PropsCase from './components/PropsCase';
import Car from './components/Car';

function App() {
  return (
    <div className= "container bg-danger text-center text-warning">
      <h1>Welcome to Hook Examples</h1>

      <PropsCase message= "Adriana"/>
      <Car message= "Ford"/>
      
    </div>
  );
}

export default App;
