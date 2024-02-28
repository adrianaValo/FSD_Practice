import logo from './logo.svg';
import './App.css';
import UseEffectDemo from './component/UseEffectDemo';
import Timer from './component/Timer';
import RealTimeClock from './component/RealTimeClock';
import UserCaseInputValidation from './component/UserCaseinputvalidation';
import DemoTimer from './component/DemoTimer'


function App() {
  return (
    <div>
      <h1>Welcome to UseEffect Demo</h1>
      <UseEffectDemo/>
      <Timer/>
      <RealTimeClock/>
      <UserCaseInputValidation/>
      <DemoTimer/>
    </div>
  );
}

export default App;
