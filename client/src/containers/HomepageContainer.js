import React, {useState, useEffect} from "react";
import App from "../App";
import {getPaints} from '../services/PaintzService';

function HomePageContainer() {

    const [paints, setPaints] = useState([]);

    useEffect(() => {
        getPaints()
        .then(data => {setPaints(data)})
    }, [])

    console.log(paints);

    return (
        <div>
            This is the home page
        </div>
    )
}

export default HomePageContainer;