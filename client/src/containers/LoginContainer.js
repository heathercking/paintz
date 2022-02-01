import React, { useState } from 'react';
import {useNavigate} from 'react-router-dom';
import axios from '../services/Axios';
import '../css/LoginContainer.css'

const LOGIN_URL = '/login';


function LoginContainer() {

    // const { setAuth } = useAuth();
    // const [username, setUsername] = useState("");
    // const [password, setPassword] = useState("");
    // const [success, setSuccess] = useState(false);
    // console.log(username);
    // console.log(password);


    // temp handleSubmit function to route to homepage when clicking button - just for demo purposes
    let navLogin = useNavigate();
    function handleSubmit() {
        navLogin('/')
    }


    // this is part of the set-up for when connection to database is sorted

    // const handleSubmit = async (e) => {
    //     e.preventDefault();
    //     console.log(username);
    //     console.log(password);

    //     const response = await axios.post(LOGIN_URL, JSON.stringify({ username: username, password : password }),
    //         {
    //             headers: { 'Content-Type': 'application/json', 'Access-Control-Allow-Origin': 'https://localhost:8443' },
    //             withCredentials: true
    //         }
    //     );
    //     console.log(JSON.stringify(response?.data));
    //     //console.log(JSON.stringify(response));
    //     const accessToken = response?.data?.accessToken;
    //     const roles = response?.data?.roles;
    //     console.log(accessToken);
    //     console.log(roles);
    //     // setAuth({ user, pwd, roles, accessToken });
    //     // setUsername('');
    //     // setPassword('');
    //     setSuccess(true);
    // }


    return (
        <div className="login-modal">
            <div className="login-modal-content">
                <div className="login-modal-header">

                    <form onSubmit={handleSubmit}>
                        <h1 className="login-modal-title">Sign in to your account</h1>
                        
                        <div className="login-modal-body">
                            <div>
                                {/* <label htmlFor="username">Email:</label> */}
                                <input  className="login-input"
                                    type="text" 
                                    id="username" 
                                    name="username" 
                                    placeholder="Email"
                                    autoComplete="off"
                                    // onChange={(e) => setUsername(e.target.value)}
                                    // value={username}
                                    // required 
                                    />
                            </div>
                            <div>
                                {/* <label htmlFor="password">Password:</label> */}
                                <input className="login-input"
                                    type="text" 
                                    id="password" 
                                    name="password" 
                                    placeholder="Password" 
                                    // onChange={(e) => setPassword(e.target.value)}
                                    // value={password}
                                    // required 
                                    />
                            </div>
                            <button className="register-button" type="submit" >Submit</button>
                        </div>
                        <div className="login-modal-footer">
                                <p className="register-heading">Don't have an acocunt?</p>
                                <button className="register-button" type="">Register here</button>
                            </div>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default LoginContainer;