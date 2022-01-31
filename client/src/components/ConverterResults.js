import React from 'react';
// import Circle from './Circle';


const ConverterResults = ( {allPaints, allExactMatches, allCloseMatches} ) => {

    if (!allExactMatches) {
        return null
    }

    console.log(allPaints);
    console.log(allExactMatches);
    console.log(allCloseMatches);


    const Circle = (colour) => {
        // let colour = ""

        var circleStyle = {
            padding:10,
            margin:20,
            display:"inline-block",
            backgroundColor: '#'+colour,
            borderRadius: "50%",
            width:45,
            height:45,
          };
          return (
            <div style={circleStyle}>
            </div>
          );
    }



    return (
        <>
            <section className="converter-results">
                <h2>Exact Matches</h2>
                    {allExactMatches.map((paint, index) => {
                        return (
                            <div key={index}>
                                {/* <Circle /> */}
                                <div >
                                    {Circle(paint.hexValue)}
                                </div>
                                <br/>
                                {paint.manufacturer} No. {paint.paintNum}
                                <br/>{paint.name}
                            </div>
                        )
                    })}
                <h2>Closest Matches</h2>
                    {allCloseMatches.map((paint, index) => {
                        return (
                            <div key={index}>
                                <div >
                                    {Circle(paint.hexValue)}
                                </div>
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