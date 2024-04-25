import React, { useState } from "react";

function UseStateColorExample() {
  const [color, setColor] = useState("red");

  return (
    <>
      <h1>My favourite color is {color}!</h1>
      <button type="button" onClick={() => setColor("blue")}>
        Blue
      </button>
    </>
  );
}

export default UseStateColorExample;
