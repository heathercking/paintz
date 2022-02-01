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
    const [exactMatchesResponse, setExactMatchesResponse] = useState(null);
    const [closeMatchesResponse, setCloseMatchesResponse] = useState(null);


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
        getExactMatches(searchNum, searchManu)
        // .then(response => setExactMatchesResponse(response.status))
        .then(data => {setExactMatches(data)})
        // .then(data => console.log(data))
        // .then(data => {setExactMatches(data)})
    }

    const getCloseMatches = () => {
        getClosestMatches(searchNum, searchManu)
        // .then(response => setCloseMatchesResponse(response.status))
        .then(data => {setClosestMatches(data)})
    }

    

    return (
        <>
            <section className="paint-converter">
            
                <div>
                   Enter some instruction here....
                </div>
                <div>
                    <form >
                        <div>
                            <div>
                                <input 
                                    onChange={handleNumChange}
                                    type="text"
                                    name="number"
                                    autoComplete="off"
                                    placeholder="enter paint number"
                                    value={searchNum} 
                                    />
                                    
                                <select onChange={handleManuChange} name="manufacturer" id="manufacturer">
                                    <option className="placeholder" value="default">Choose a brand</option>
                                    <option value="humbrol">Humbrol</option>
                                    <option value="revell">Revell</option>
                                    <option value="tamiya">Tamiya</option>
                                </select>
                            </div>
                        </div>

                        <button onClick={handleSubmit} type="Submit">Convert!</button>
                    </form>
                </div>

                <div>
                    <ConverterResults allPaints={paints} manufacturer={searchManu} allExactMatches={exactMatches} allCloseMatches={closestMatches} exactMatchesResp={exactMatchesResponse} closeMatchesResp={closeMatchesResponse}/>
                </div>
            </section>
        </>
    )
}

export default PaintConverterContainer;