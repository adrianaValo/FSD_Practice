import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.js";

import Counter from "./component/Counter";
import { Cart } from "./component/Cart";
import { UserData } from "./component/UserData";
import { Testdata } from "./component/TestData";

import store from "./store";

function App() {
  return (
    <div>
      <Counter />
      <Cart />
      <UserData />
      <Testdata />
    </div>
  );
}

export default App;
