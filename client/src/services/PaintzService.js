const baseURL = "http://localhost:8080/";

// let base64 = require('base-64');
// let username = 'user';
// let password = 'password';

export const getPaints = () => {
    return(
        fetch(baseURL + "paints", {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                // 'Authorization' : 'Basic ' + base64.encode(username + ":" + password)
            }
        })
        .then(res => res.json())
    )
}

export const getExactMatches = (number, manufacturer) => {
    let queryURL = baseURL + "paints/converter" + "?number=" + number + "&manufacturer=" + manufacturer
    console.log(queryURL)
    return(
    fetch(baseURL + "paints/converter" + "?number=" + number + "&manufacturer=" + manufacturer)
    .then(res => {
        console.log(res.status);
        if (res.status !== 200) {
            console.log("ERROR!");
            return res.status;
        } else {
            return res.json();
        }
    
        })
    )
    
    //return(
        //fetch(baseURL + "paints/converter" + "?number=" + number + "&manufacturer=" + manufacturer)
        // {
        //     'Accept': 'application/json',
        //     'Content-Type': 'application/json',
        //     'Access-Control-Allow-Origin': '*',
        // }   
        //.then(res => console.log(res.status)) 
        //.then(res => res.json())
   //  )
}

export const getClosestMatches = (number, manufacturer) => {
    return(
        fetch(baseURL + "paints/converter/equivalents" + "?number=" + number + "&manufacturer=" + manufacturer)
    .then(res => {
        console.log(res.status);
        if (res.status !== 200) {
            console.log("Error!!");
            return res.status;
        } else {
            return res.json();
        }
    })
        // {
        //     'Accept': 'application/json',
        //     'Content-Type': 'application/json',
        //     'Access-Control-Allow-Origin': '*',
        // }
        // .then(res => console.log(res.status)) 
        // .then(res => res.json())
    )
}