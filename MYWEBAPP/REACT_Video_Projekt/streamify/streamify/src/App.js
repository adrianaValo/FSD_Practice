import logo from "./logo.svg";
import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";

import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.js";

import Feed from "./components/Feed";
import VideoDetail from "./components/VideoDetail";
import SearchFeed from "./components/SearchFeed";
import Navigation from "./components/Navbar";

const App = () => (
  <BrowserRouter>
    <div
      className="d-flex align-items-center justify-content-center border p-3 rounded"
      style={{ backgroundColor: "#000" }}
    >
      <Navigation />
      <Routes>
        <Route exact path="/" element={<Feed />} />
        <Route path="/video/:id" element={<VideoDetail />} />

        <Route path="/search/:searchTerm" element={<SearchFeed />} />
      </Routes>
    </div>
  </BrowserRouter>
);

export default App;
