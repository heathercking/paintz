const baseURL = "http://localhost:8443/api/";

// let base64 = require('base-64');
// let username = 'user';
// let password = 'password';

export const getPaints = () => {
    return(
        fetch(baseURL + "paints", {
            headers: {
                Accept: 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': 'https://localhost:8443',
                // 'Authorization' : 'Basic ' + base64.encode(username + ":" + password)
            }
        })
        .then(res => res.json())
    )
}