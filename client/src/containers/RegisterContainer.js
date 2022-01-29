import React, {useState, useEffect} from 'react';



function RegisterContainer() {

    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    const submit = (e) => {
        console.log({username, password})
    }


    return (
        <div>
            <form onSubmit={submit} >
                <h1>Create a Paintz! account</h1>
                <div>
                    <label htmlFor="username">Email:</label>
                    <input type="text" id="username" name="username" placeholder="email" required 
                    onChange={e => setUsername(e.target.value)} />
                </div>
                <div>
                    <label htmlFor="password">Password:</label>
                    <input type="text" id="password" name="password" placeholder="password" required 
                    onChange={e => setPassword(e.target.value)} />
                </div>
                <button type="submit">Submit</button>
            </form>
        </div>
    )
}

export default RegisterContainer;