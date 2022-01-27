import React, {useState, useEffect} from "react";
import App from "../App";
import {useNavigate} from 'react-router-dom';

import {getPaints} from '../services/PaintzService';
import PaintSearchContainer from "./PaintSearchContainer";

function HomePageContainer() {

    const [paints, setPaints] = useState([]);

    useEffect(() => {
        getPaints()
        .then(data => {setPaints(data)})
    }, [])

    console.log(paints);

    let navSearch = useNavigate();
    function handleSearchClick() {
        navSearch('/search')
    }

    let navConverter = useNavigate();
    function handleConverterClick() {
        navConverter('/convert')
    }



    return (
        <div>
            This is the home page
            <button type="" onClick={handleSearchClick}>Search</button>
            <button type="" onClick={handleConverterClick}>Converter</button>
            
        </div>
    )
}

export default HomePageContainer;