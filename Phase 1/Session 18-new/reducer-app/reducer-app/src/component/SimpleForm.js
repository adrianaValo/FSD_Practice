import React, { useReducer } from "react";

//With this JS an object with the entry data is saved, using useReducer

const UPDATE_FILED = "UPDATE_FILED";
const SUBMIT_FORM = "SUBMIT_FORM";

const formReducer = (state, action) => {
  switch (action.type) {
    case UPDATE_FILED:
      return { ...state, [action.field]: action.value }; //returns the previous state
    case SUBMIT_FORM:
      console.log("Form Submitted", state);
      return state;

    default:
      return state;
  }
};

function SimpleForm() {
  const initialFormState = { firstname: "", lastname: "", email: "" };

  const [formState, dispatch] = useReducer(formReducer, initialFormState);

  const handleFieldChange = (field, value) => {
    dispatch({
      type: UPDATE_FILED,
      field,
      value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    dispatch({ type: SUBMIT_FORM });
  };

  return (
    <div className="container mt-3">
      <h3>Simple Form Using useReducer</h3>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="firstName">FirstName:</label>
          <input
            type="text"
            className="form-control"
            id="firstName"
            value={formState.firstname}
            onChange={(e) => handleFieldChange("firstname", e.target.value)}
          />
        </div>
        <div className="form-group">
          <label htmlFor="lastName">LastName:</label>
          <input
            type="text"
            className="form-control"
            id="lastName"
            value={formState.lastname}
            onChange={(e) => handleFieldChange("lastname", e.target.value)}
          />
        </div>
        <div className="form-group">
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            className="form-control"
            id="email"
            value={formState.email}
            onChange={(e) => handleFieldChange("email", e.target.value)}
          />
        </div>
        <button type="submit" className="btn btn-primary">
          Submit
        </button>
      </form>
    </div>
  );
}

export default SimpleForm;
