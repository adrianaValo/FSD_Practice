import React, { useState } from 'react';

function ButtonOnOff() {

    const [isOn, setIsOn ] = useState(false);

    return (
        <div className= "container text-center">

            <button className= "btn btn-warning" onClick= {()=> setIsOn(!isOn) ? 'Turn OFF' : 'Turn ON'}></button>

            <p>The Button is {isOn ? 'on' : 'off'}</p>

            <button className= {`btn ${isOn ? 'btn-danger' : 'btn-success'}`}
            onClick= {()=> setIsOn(!isOn)}>
                {isOn ? 'Turn OFF' : 'Turn ON'}

            </button>

        </div>
    );
}

export default ButtonOnOff;