// import React, {useState} from 'react'
import "./App.css";
import Homepage from "./Homepage";
import Contact from './Contact'
import AboutLittleLemon from "./AboutLittleLemon";
import { Routes, Route, Link } from "react-router-dom";

// function countInitial(){
//   console.log("run function")
//   return 4
// }

function App() {

  // const [count, setCount] = useState(4) //run one time
  // const [theme, setTheme] = useState("red")
  

  // function increment(){
  //   setCount(prevCount => prevCount + 1)
  //   setTheme("blue")
  // }

  // function decrement(){
  //   setCount(nextCount => nextCount + 1) //useful because it each time take updated value but no same value when this function runs first time
  //   setTheme("red")
  // }

  return (
    <div>
      <nav>
        <Link to="/" className="nav-item">Homepage</Link>
        <Link to="/about" className="nav-item">About</Link>
        <Link to="/contact" className="nav-item">Contact</Link>
      </nav>
      <Routes>
        <Route path="/" element={<Homepage />}></Route>
        <Route path="/about-me" element={<About />}></Route>
        <Route path="/contact" element={<Contact />}></Route>
      </Routes>

      {/* <button onClick={decrement}>-</button>
      <span>{count}{theme}</span> 
      <button onClick={increment}>+</button> */}
    </div>
  );
}

export default App;
