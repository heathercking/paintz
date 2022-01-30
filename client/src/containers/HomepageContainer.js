import React, {useState, useEffect} from "react";
import App from "../App";
import {useNavigate} from 'react-router-dom';
import '../css/Homepage.css'

import {getPaints} from '../services/PaintzService';
import PaintSearchContainer from "./PaintSearchContainer";
import mainLogo from "../assets/PaintzLogo_White_1300x500.png"

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
        <>
        <section className="homepage">
            <div className="homepage-contents">
                <div className="homepage-welcome-text">
                    <h1 id="welcome-heading">welcome to</h1>
                    <img className="main-logo" src={mainLogo} alt=""/>
                    <p id="welcome-para">the model paints app</p>
                </div>
                <div className="welcome-buttons">
                    <button className="welcome-btn" type="" onClick={handleConverterClick}>Paint Converter</button>
                    <button className="welcome-btn" type="" onClick={handleSearchClick}>Paint Search</button>
                </div>
            </div>
            
        </section>

        </>
    )
}

export default HomePageContainer;