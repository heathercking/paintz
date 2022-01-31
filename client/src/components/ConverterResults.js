import React from 'react';
// import Circle from './Circle';


const ConverterResults = ( {allPaints, manufacturer, allExactMatches, allCloseMatches} ) => {

    if (!allExactMatches) {
        return null
    }

    console.log(allPaints);
    console.log(allExactMatches);
    console.log(allCloseMatches);
    console.log(`manu = ` + manufacturer);


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

                    <div id="searched-paint">
                        {allExactMatches.map((paint, index) => {
                            if (paint.manufacturer.toLowerCase() == manufacturer) {
                                console.log(paint.manufacturer)
                                console.log(paint.manufacturer.toLowerCase())
                                return (
                                    <div key={index}>
                                    <div >
                                        {Circle(paint.hexValue)}
                                    </div>
                                    {paint.manufacturer} No. {paint.paintNum}
                                    <br/>{paint.name}
                                </div>
                                )
                            }})}
                    </div>
                    <div id="exact-matches">
                        {allExactMatches.map((paint, index) => {
                            if (paint.manufacturer.toLowerCase() != manufacturer) {
                                return (
                                    <div key={index}>
                                    <div >
                                        {Circle(paint.hexValue)}
                                    </div>
                                    {paint.manufacturer} No. {paint.paintNum}
                                    <br/>{paint.name}
                                </div>
                                )
                            }})}
                    </div>
                    
                    {/* return ( 
                        <span id="matched-paint" key={index}>
                                {Circle(paint.hexValue)}

                            {paint.manufacturer} No. {paint.paintNum}
                            <br/>{paint.name}
                        </span>
                    ) */}

                <h2 className="closest-matches">Closest Matches</h2>
                    {allCloseMatches.map((paint, index) => {
                        return (
                            <div key={index}>
                                {Circle(paint.hexValue)}
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