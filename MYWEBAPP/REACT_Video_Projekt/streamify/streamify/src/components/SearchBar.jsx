import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import Button from "react-bootstrap/Button";
import Form from "react-bootstrap/Form";
import Col from "react-bootstrap/Col";

import Row from "react-bootstrap/Row";

const SearchBar = () => {
  const [searchTerm, setSearchTerm] = useState("");
  const navigate = useNavigate();

  const onhandleSubmit = (e) => {
    e.preventDefault();

    if (searchTerm) {
      navigate(`/search/${searchTerm}`);

      setSearchTerm("");
    }
  };

  return (
    <Form>
      <Col className="mb-3">
        <Form.Group as={Col} controlId="formGridSearch">
          <Form.Label>Search</Form.Label>
          <Form.Control type="email" placeholder="Search" />
        </Form.Group>

        <Button variant="primary" type="submit">
          Submit
        </Button>
      </Col>
    </Form>
  );
};

export default SearchBar;
