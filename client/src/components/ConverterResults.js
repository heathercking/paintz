import React from 'react';
import { getEquivalentPaints } from '../services/PaintzService';



const ConverterResults = ( {paintNumber, paintManu} ) => {

    if (!paintManu) {
        return null
    }

    const getResults = () => {
        let results = getEquivalentPaints(paintNumber, paintManu);
        return results
    }
    
    
    const matchedPaints = getResults();

    console.log(matchedPaints);



    return (
        <>
            <h2>Exact Matches</h2>
            <ul>
                {/* {matchedPaints.map((paint, index) => {
                    return (
                        <li key={index}>
                            {paint.manufacturer}, {paint.paintNum}, {paint.name}
                        </li>
                    )
                })} */}
            </ul>
            <h2>Closest Matches</h2>

        </>
    )
}

export default ConverterResults;