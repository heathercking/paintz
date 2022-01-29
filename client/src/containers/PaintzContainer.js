import React, {useState, useEffect} from "react";
import App from "../App";
import '../css/Paintz.css';
import {getPaints} from '../services/PaintzService';
import {useNavigate} from 'react-router-dom';



const PaintzContainer = () => {

    let navLogin = useNavigate();
    function handleLoginClick() {
        navLogin('/login')
    }

    return (
        <>
            <h1>Paintz!</h1>
            <h2>the model paint app</h2>

            
            <button type="" onClick={handleLoginClick}>Login</button>
            <br/> OR <br/>
            <button type="">Enter As Guest</button>

        </>
    )
}

export default PaintzContainer;