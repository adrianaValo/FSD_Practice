import { useState } from "react";

function Login() {
let [emailid,setEmailId]=useState("");
let [password,setPassword]=useState("");
let [typeofuser,setTypeofUser]=useState("");

let handleSubmit=(event)=> {
    event.preventDefault();
    let login = {emailid,password,typeofuser}
    console.log(login)
}
    return(
        <div>
            <h3>Login Page</h3>
            <form onSubmit={handleSubmit}>
                <label>EmailId</label>
                <input type="emailid" name="emailid" onChange={(event)=>setEmailId(event.target.value)}/><br/>
                <label>Password</label>
                <input type="password" name="password" onChange={(event)=>setPassword(event.target.value)}/><br/>
                <label>TypeOfUser</label>
                <input type="radio" name="typeofuser" value="admin" onChange={(event)=>setTypeofUser(event.target.value)}/>Admin
                <input type="radio" name="typeofuser" value="customer" onChange={(event)=>setTypeofUser(event.target.value)}/>Customer<br/>
                <input type="submit" value="SignIn"/>
                <input type="reset" value="reset"/>
            </form>
        </div>
    )
}

export default Login;