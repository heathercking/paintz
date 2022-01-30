import React, {useState, useEffect} from "react";
import { getEquivalentPaints } from '../services/PaintzService';
import ConverterResults from "../components/ConverterResults";


function PaintConverterContainer() {

    const [searchNum, setSearchNum] = useState("");
    const [searchManu, setSearchManu] = useState("");
    const [searchResults, setSearchResults] = useState([]);


    const handleChange = (event) => {
        event.preventDefault();
        setSearchNum(event.target.value);
        console.log(searchNum);
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        setSearchManu(event.target.id);
        // setSearchNum(event.target.value);
        // console.log(searchManu);
        // setSearchResults(getEquivalentPaints(searchNum, searchManu));
    }


    return (
        <>
            <div>
                This is the paint converter page
            </div>
            <div>
                <form >
                    <input 
                        onChange={handleChange}
                        type="text"
                        name="number"
                        placeholder="enter paint number"
                        value={searchNum} 
                        />
                    {/* <p>Select the brand</p> */}
                    <button onClick={handleSubmit} type="Submit" id="HUMBROL">Humbrol</button>
                    <button onClick={handleSubmit} type="Submit" id="REVELL">Revell</button>
                    <button onClick={handleSubmit} type="Submit" id="TAMIYA">Tamiya</button>
                </form>
            </div>

            <div>
                <ConverterResults paintNumber={searchNum} paintManu={searchManu} />
            </div>
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