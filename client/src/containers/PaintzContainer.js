import React, {useState, useEffect} from "react";
import App from "../App";
import '../css/Paintz.css';
import {getPaints} from '../services/PaintzService';



const PaintzContainer = () => {


    return (
        <>
        <div className="welcome-page">
        <h1>Paintz!</h1>
            <h2>the model paint app</h2>

            <button type="">Sign In</button>
            <br/>
            OR
            <br/>
            <button type="">Enter As Guest</button>   
        </div>

        </>
    )
}

export default PaintzContainer;