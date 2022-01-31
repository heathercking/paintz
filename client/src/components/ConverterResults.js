import React from 'react';



const ConverterResults = ( {allPaints, allExactMatches, allCloseMatches} ) => {

    if (!allExactMatches) {
        return null
    }

    console.log(allPaints);
    console.log(allExactMatches);
    console.log(allCloseMatches);





    return (
        <>
            <section className="converter-results">
                <h2>Exact Matches</h2>
                    {allExactMatches.map((paint, index) => {
                        return (
                            <div key={index}>
                                {paint.manufacturer} No. {paint.paintNum}
                                <br/>{paint.name}
                            </div>
                        )
                    })}
                <h2>Closest Matches</h2>
                    {allCloseMatches.map((paint, index) => {
                        return (
                            <div key={index}>
                                {paint.manufacturer} No. {paint.paintNum}
                                <br/>{paint.name}
                            </div>
                        )
                    })}

            </section>

        </>
    )
}

export default ConverterResults;