import { useDispatch, useSelector } from "react-redux";
import { Button, Container, Row, Col } from "react-bootstrap";

function Counter() {
  const myCount = useSelector((state) => state.count);
  const dispatch = useDispatch();

  return (
    <Container classname="text-center bg-warning">
      <Row>
        <Col sm={6}>
          <h1 className="mb-2">count: {myCount}</h1>

          <Button
            variant="primary"
            onClick={() => dispatch({ type: "INCREMENT" })}
          >
            INCREMENT
          </Button>
          <Button
            variant="secondary"
            onClick={() => dispatch({ type: "DECREMENT" })}
          >
            DECREMENT
          </Button>
        </Col>
      </Row>
    </Container>
  );
}

export default Counter;
