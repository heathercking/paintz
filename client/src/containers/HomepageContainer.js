import React, {useState, useEffect} from "react";
import App from "../App";
import {useNavigate} from 'react-router-dom';


import PaintSearchContainer from "./PaintSearchContainer";

function HomePageContainer() {

   

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