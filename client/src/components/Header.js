import React from 'react';
import {useNavigate} from 'react-router-dom';
import '../css/Header.css'
import headerLogo from "../assets/PaintzLogo_1300x500.png"

function Header() {

    let homeNav = useNavigate();
    function handleHomeClick() {
        homeNav("/")
    }

    let loginNav = useNavigate();
    function handleLoginClick() {
        loginNav("/login")
    }

    return (
        <>
        <div className="nav-bar">
            <div className="nav-flex">
                <img className="header-logo" src={headerLogo} alt="Logo" onClick={handleHomeClick}/>
                {/* <h1 className="logo"><a >Logo</a></h1> */}
                <nav>
                    <ul>
                        <li><a onClick={handleLoginClick}>Login</a></li>
                    </ul>
                </nav>

            </div>
        </div>

        </>
    )
}

export default Header;