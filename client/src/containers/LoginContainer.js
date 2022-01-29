import React from 'react';

function LoginContainer() {

    return (
        <div>
            <form>
                <h1>Sign in to your account</h1>
                <p>Don't have an acocunt? Register here</p>
                <div>
                    <label htmlFor="username">Email:</label>
                    <input type="text" id="username" name="username" placeholder="email" required />
                </div>
                <div>
                    <label htmlFor="password">Password:</label>
                    <input type="text" id="password" name="password" placeholder="password" required />
                </div>
                <button type="submit">Submit</button>
            </form>
        </div>
    )
}

export default LoginContainer;