import logo from "./logo.svg";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.min.js";

import "./App.css";
import UseEffectDemo from "./component/UseEffectDemo";
import Timer from "./component/Timer";
import RealTimeClock from "./component/RealTimeClock";

import UserCaseInputValidation from "./component/UserCaseInputValidation";
import SubmissionTimer from "./component/SubmissionTimer";
import Demo from "./component/Demo";
import SubmissionTimerEx from "./component/SubmissionTimerEx";

function App() {
  return (
    <div>
      <h1>Welcome to useEffect Demo</h1>
      <UseEffectDemo />
      <Timer />
      <RealTimeClock />
      <Demo />
      <UserCaseInputValidation />
      <SubmissionTimer submissionDate="2024-03-29T23:59:59" />
      <SubmissionTimerEx initialTime={120} />{" "}
      {/* Set initial time to 120 seconds */}
    </div>
  );
}

export default App;
