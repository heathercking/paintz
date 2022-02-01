import React, {useState} from 'react';
import {useNavigate} from 'react-router-dom';
import '../css/Header.css'
import headerLogo from "../assets/PaintzLogo_1300x500.png"
import LoginContainer from "../containers/LoginContainer"

function Header() {

    const [openLoginModal, setOpenLoginModal] = useState(false);

    let homeNav = useNavigate();
    function handleHomeClick() {
        homeNav("/")
    }

    let loginNav = useNavigate();
    function handleLoginClick() {
        loginNav("/login")
    }

    const setModal = () => {
        setOpenLoginModal(true);
    }


    // <img className="bauble-instructions" src={bauble_instructions} type="openModalBtn" onClick={() => {setOpenMapModal(true)}}/>
    //                 {openMapModal && <MapModal setOpenModal={setOpenMapModal}/>}

    return (
        <>
        <div className="nav-bar">
            <div className="nav-flex">
                <img className="header-logo" src={headerLogo} alt="Logo" onClick={handleHomeClick}/>
                {/* <h1 className="logo"><a >Logo</a></h1> */}
                <nav>
                    <ul>
                        <li><a onClick={() => {setOpenLoginModal(true)}} >Login</a></li>
                        {openLoginModal && <LoginContainer setOpenModal={setOpenLoginModal}/>}
                    </ul>
                </nav>

            </div>
        </div>

        </>
    )
}

export default Header;