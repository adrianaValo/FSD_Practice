import { createStore } from "redux";
import CounterReducer from "./reducers/CounterReducer";
import rootReducer from "./reducers";

const store = createStore(rootReducer);

export default store;

// to install Redux: npm i react-redux redux
// create the store.js file
// put the < App/ > between Provider in the index.js with the store state
