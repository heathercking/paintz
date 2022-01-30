import React, {useState} from 'react';

function LoginContainer() {


    const [user, setUser] = useState('');
    const [pwd, setPwd] = useState('');

    const handleSubmit = (event) => {
        event.preventDefault();
        console.log(user, pwd);
    }


    return (
        <>
                <section>
                    <h1>Sign In</h1>
                    <form onSubmit={handleSubmit}>
                        <label htmlFor="username">Email:</label>
                        <input
                            type="text"
                            id="username"
                            autoComplete="off"
                            onChange={(e) => setUser(e.target.value)}
                            value={user}
                            required
                        />

                        <label htmlFor="password">Password:</label>
                        <input
                            type="password"
                            id="password"
                            onChange={(e) => setPwd(e.target.value)}
                            value={pwd}
                            required
                        />
                        <button>Sign In</button>
                    </form>
                    <p>
                        Need an account?<br />
                        <span className="line">
                            {/*put router link here*/}
                            <a href="#">Sign Up</a>
                        </span>
                    </p>

                </section>
            
        </>
    )
}

export default LoginContainer;