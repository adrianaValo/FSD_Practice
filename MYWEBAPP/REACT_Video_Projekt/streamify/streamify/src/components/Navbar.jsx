import React from "react";
import Stack from "react-bootstrap/Stack";
import { Link } from "react-router-dom";
import Nav from "react-bootstrap/Nav";
import { logo } from "../utils/constants";
import SearchBar from "./SearchBar";

import Navbar from "react-bootstrap/Navbar";

// Stacks are vertical by default and stacked items are full-width by default. Use the gap prop to add space between items.

function Navigation() {
  return (
    <Navbar expand="lg" className="bg-body-tertiary">
      <Link
        className="nav-link"
        to="/"
        style={{ display: "flex", alignItems: "center" }}
      >
        <img src={logo} alt="logo" height={45} />
      </Link>

      <SearchBar />
    </Navbar>
  );
}

export default Navigation;
