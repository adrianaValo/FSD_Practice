import React, { useState, useEffect } from "react";

function SubmissionTimer({ initialTime = 60 }) {
  // Default time is 60 seconds
  const [remainingTime, setRemainingTime] = useState(initialTime);

  // Optional: Unmount cleanup function
  useEffect(() => {
    return () => clearInterval(timerId);
  }, []);

  let timerId = null; // Timer ID variable

  const startTimer = () => {
    timerId = setInterval(() => {
      if (remainingTime > 0) {
        setRemainingTime((prevTime) => prevTime - 1);
      } else {
        clearInterval(timerId);
        // Handle submission expiration here (e.g., alert, disable form)
        alert("Submission time is up!");
      }
    }, 1000); // Update every second
  };

  return (
    <div>
      <h2>Time Left: {remainingTime} seconds</h2>
      <button onClick={startTimer}>Start Submission Timer</button>
    </div>
  );
}

export default SubmissionTimer;
