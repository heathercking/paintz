import React, {useState, useEffect} from "react";
import { getPaints, getExactMatches, getClosestMatches } from '../services/PaintzService';
import ConverterResults from "../components/ConverterResults";
import '../css/PaintConverter.css'


function PaintConverterContainer() {

    const [searchNum, setSearchNum] = useState("");
    const [searchManu, setSearchManu] = useState("");
    const [exactMatches, setExactMatches] = useState([]);
    const [closestMatches, setClosestMatches] = useState([]);
    const [paints, setPaints] = useState([]);
    const [errorMsg, setErrorMsg] = useState('');


    useEffect(() => {
        getPaints()
        .then(data => {setPaints(data)})
    }, [])


    const handleNumChange = (event) => {
        event.preventDefault();
        setSearchNum(event.target.value);
        console.log(searchNum);
    }

    const handleManuChange = (event) => {
        event.preventDefault();
        setSearchManu(event.target.value);
        console.log(searchNum);
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        getMatches();  
        getCloseMatches();
    }

    const getMatches = () => {
        try {
            getExactMatches(searchNum, searchManu)
            .then(data => {setExactMatches(data)})
        } catch (error) {
            if (!error?.response) {
                setErrorMsg('No Server Response')
            } else if (error.response?.status == 409) {
                setErrorMsg('Cannot find that paint')
            } else {
                setErrorMsg('Something went wrong')
            }
        }
    }

    const getCloseMatches = () => {
        try {
            getClosestMatches(searchNum, searchManu)
            .then(data => {setClosestMatches(data)})
        } catch (error) {
            if (!error?.response) {
                setErrorMsg('No Server Response')
            } else if (error.response?.status == 409) {
                setErrorMsg('Cannot find that paint')
            } else {
                setErrorMsg('Something went wrong')
            }
        }

    }

    


    return (
        <>
            <section className="paint-converter">
            
                <div>
                   Enter some instruction here....
                </div>
                <div>
                    <form >
                        <input 
                            onChange={handleNumChange}
                            type="text"
                            name="number"
                            autoComplete="off"
                            placeholder="enter paint number"
                            value={searchNum} 
                            />

                        {/* <button onClick={handleSubmit} type="Submit" id="HUMBROL">Humbrol</button>
                        <button onClick={handleSubmit} type="Submit" id="REVELL">Revell</button>
                        <button onClick={handleSubmit} type="Submit" id="TAMIYA">Tamiya</button> */}

                        <input 
                            onChange={handleManuChange}
                            type="text"
                            name="manu"
                            autoComplete="off"
                            placeholder="enter manufacturer"
                            value={searchManu} 
                            />

                        <button onClick={handleSubmit} type="Submit">Convert!</button>
                    </form>
                </div>

                <div>
                    <ConverterResults allPaints={paints} manufacturer={searchManu} allExactMatches={exactMatches} allCloseMatches={closestMatches} />
                </div>
            </section>
        </>
    )
}

export default PaintConverterContainer;



    // const handleChange = (event) => {
    //     event.preventDefault();
    //     setSearchNum(event.target.value);
    //     console.log(searchNum);
    //     setSearchManu(event.target.id);
    //     console.log(event.target.id);
    //     setSearchResults(getEquivalentPaints(searchNum, searchManu));
    // }


    // const handleSubmit = () => {
    //     setSearchResults(getEquivalentPaints(searchNum, searchManu))
    //     .then(console.log(searchResults));
    // }

    // console.log(searchResults);


    // if (searchNum && searchManu) {
    //     var results = getEquivalentPaints(searchNum, searchManu);
    //     setSearchResults(results);
    // }