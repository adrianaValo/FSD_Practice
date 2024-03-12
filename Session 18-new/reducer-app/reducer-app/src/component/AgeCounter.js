import { useReducer } from "react";
import Button from "react-bootstrap/Button";
import ButtonGroup from "react-bootstrap/ButtonGroup";

function reducer(state, action) {
  if (action.type === "incremented_age") {
    return {
      age: state.age + 1,
    };
  }
  throw Error("Unknown Action");
}

function AgeCounter() {
  const [state, dispatch] = useReducer(reducer, { age: 50 });

  return (
    <div>
      <ButtonGroup aria-label="Basic example">
        <Button
          variant="secondary"
          onClick={() => {
            dispatch({ type: "incremented_age" });
          }}
        >
          Increment Age
        </Button>
        <p className="bg-primary text-warning">
          Hello...! You are {state.age} . Year Old
        </p>
      </ButtonGroup>
    </div>
  );
}

export default AgeCounter;
