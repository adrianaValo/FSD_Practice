import logo from "./logo.svg";
import "./App.css";

import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.js";
import { ThemeProvider } from "./usecase-5-toggle-with-bs/ThemedContext";

import Header from "./usecase-5-toggle-with-bs/Header";

function App() {
  return (
    <div>
      <h1>useContext API</h1>
      <ThemeProvider>
        <Header />
      </ThemeProvider>
    </div>
  );
}

export default App;
