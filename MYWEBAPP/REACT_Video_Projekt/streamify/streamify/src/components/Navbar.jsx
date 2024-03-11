import React from "react";
import Stack from "react-bootstrap/Stack";
import { Link } from "react-router-dom";
import { logo } from "../utils/constants";
import SearchBar from "./SearchBar";

// Stacks are vertical by default and stacked items are full-width by default. Use the gap prop to add space between items.

const Navbar = () => (
  <Stack
    direction="row"
    p={2}
    style={{
      position: "sticky",
      background: "#000",
      top: 0,
      justifyContent: "space-between",
    }}
  >
    <Link to="/" style={{ display: "flex", alignItems: "center" }}>
      <img src={logo} alt="logo" height={45} />
    </Link>

    <SearchBar />
  </Stack>
);

export default Navbar;
