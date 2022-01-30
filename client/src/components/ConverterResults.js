import React from 'react';
import { getEquivalentPaints } from '../services/PaintzService';



const ConverterResults = ( {paintNumber, paintManufacturer} ) => {

    if (!paintManufacturer) {
        return null
    }

    const getResults = () => {
        let results = getEquivalentPaints(paintNumber, paintManufacturer);
        return results
    }
    
    
    const matchedPaints = getResults();

    console.log(matchedPaints);



    return (
        <>
            <h2>This is the paint converter input/output component</h2>
            <ul>
                {/* {getResults.map((paint, index) => {
                    return (
                        <li key={index}>
                            {paint.paintNum}
                        </li>
                    )
                })} */}
            </ul>

        </>
    )
}

export default ConverterResults;