import React from "react";

function Car(props) {
    const brand = props.message;

    return (
        <div className= "container bg-primary">
            <h1>Who lives in my garage?</h1>
            <h4> I am a {brand} car!</h4>
        </div>
    )


}

export default Car;

