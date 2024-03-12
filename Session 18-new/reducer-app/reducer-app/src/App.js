import logo from "./logo.svg";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.js";

import Counter from "./component/Counter";
import AgeCounter from "./component/AgeCounter";
import SimpleForm from "./component/SimpleForm";

function App() {
  return (
    <div>
      <Counter />
      <AgeCounter />
      <SimpleForm />
    </div>
  );
}

export default App;
