import React, { useState } from 'react';
import axios from '../services/Axios';

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
        <div>
            <form onSubmit={handleSubmit}>
                <h1>Sign in to your account</h1>
                <p>Don't have an acocunt? Register here</p>
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
            </form>
        </div>
    )
}

export default LoginContainer;