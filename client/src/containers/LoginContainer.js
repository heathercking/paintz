import React, { useState } from 'react';
import axios from '../services/Axios';
import '../css/LoginContainer.css'

const LOGIN_URL = '/login';


function LoginContainer() {

    // const { setAuth } = useAuth();
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [success, setSuccess] = useState(false);

    console.log(username);
    console.log(password);


    const handleSubmit = async (e) => {
        e.preventDefault();

        console.log(username);
        console.log(password);

        const response = await axios.post(LOGIN_URL, JSON.stringify({ username: username, password : password }),
            {
                headers: { 'Content-Type': 'application/json', 'Access-Control-Allow-Origin': 'https://localhost:8443' },
                withCredentials: true
            }
        );
        console.log(JSON.stringify(response?.data));
        //console.log(JSON.stringify(response));
        const accessToken = response?.data?.accessToken;
        const roles = response?.data?.roles;
        console.log(accessToken);
        console.log(roles);

    
        // setAuth({ user, pwd, roles, accessToken });
        // setUsername('');
        // setPassword('');
        setSuccess(true);

    }


    return (
        <div className="map-modal">
            <div className="map-modal-content">
                <div className="map-modal-header">

                    <form onSubmit={handleSubmit}>
                        <h1 className="map-modal-title">Sign in to your account</h1>
                        
                        <div className="map-modal-body">
                            <div>
                                <label htmlFor="username">Email:</label>
                                <input 
                                    type="text" 
                                    id="username" 
                                    name="username" 
                                    placeholder="email"
                                    autoComplete="off"
                                    onChange={(e) => setUsername(e.target.value)}
                                    value={username}
                                    required />
                            </div>
                            <div>
                                <label htmlFor="password">Password:</label>
                                <input 
                                    type="text" 
                                    id="password" 
                                    name="password" 
                                    placeholder="password" 
                                    onChange={(e) => setPassword(e.target.value)}
                                    value={password}
                                    required />
                            </div>
                            <button type="submit">Submit</button>
                        </div>
                        <div className="map-modal-footer">
                                <p>Don't have an acocunt?</p>
                                <button type="">Register here</button>
                            </div>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default LoginContainer;