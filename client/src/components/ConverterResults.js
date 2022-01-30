import React from 'react';



const ConverterResults = ( {allPaints, allExactMatches, allCloseMatches} ) => {

    if (!allExactMatches) {
        return null
    }

    // const getResults = () => {
    //     let results = getEquivalentPaints(paintNumber, paintManu);
    //     return results
    // }
    

    

    console.log(allPaints);
    console.log(allExactMatches);
    console.log(allCloseMatches);


    return (
        <>
            <section className="converter-results">
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
            </section>

        </>
    )
}

export default ConverterResults;