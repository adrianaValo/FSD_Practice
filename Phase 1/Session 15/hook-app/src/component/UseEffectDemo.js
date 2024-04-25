import React, { useEffect } from 'react';

function UseEffectDemo() {

    // the useEffect is always before the return

    useEffect(() => {
        console.log("Running in Background...!");

    })

    return(
        <div>
            <h2>I am at UseEffectpage</h2>
        </div>
    );

}

export default UseEffectDemo;