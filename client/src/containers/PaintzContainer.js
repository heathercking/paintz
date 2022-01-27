import React, {useState, useEffect} from "react";
import App from "../App";
import {getPaints} from '../services/PaintzService';



const PaintzContainer = () => {

    const [paints, setPaints] = useState([]);

    useEffect(() => {
        getPaints()
        .then(data => {setPaints(data)})
    }, [])

    console.log(paints);

    return (
        <>
            <h1>Paintz!</h1>
            <h2>the model paint app</h2>

            <button type="">Enter</button>
        </>
    )
}

export default PaintzContainer;