import { useReducer } from "react";

import Button from "react-bootstrap/Button";
import ButtonGroup from "react-bootstrap/ButtonGroup";

const reducer = (state, action) => {
  switch (action.type) {
    case "INCREMENT":
      return { count: state.count + 1 };

    case "DECREMENT":
      return { count: state.count - 1 };

    default:
      return state;
  }
};

function Counter() {
  const [state, dispatch] = useReducer(reducer, { count: 0 });
  return (
    <div>
      <h2>Counter App Using Reducer</h2>

      <p>Count: {state.count}</p>

      <ButtonGroup className="mb-2" aria-label="Basic example">
        <Button
          variant="secondary"
          onClick={() => dispatch({ type: "INCREMENT" })}
        >
          +
        </Button>
        <Button
          variant="secondary"
          onClick={() => dispatch({ type: "DECREMENT" })}
        >
          -
        </Button>
      </ButtonGroup>
    </div>
  );
}

export default Counter;
