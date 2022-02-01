import React from 'react';
// import Circle from './Circle';
import '../css/ConverterResults.css'


const ConverterResults = ( {allPaints, manufacturer, allExactMatches, allCloseMatches, exactMatchesResp, closeMatchesResp} ) => {

    if (!allExactMatches) {
        return null
    }

    console.log(allPaints);
    console.log(allExactMatches);
    console.log(allCloseMatches);
    console.log(`manu = ` + manufacturer);


    const Circle = (colour) => {

        var circleStyle = {
            padding:5,
            margin:10,
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


    if (exactMatchesResp != null) {
        return (
            <>
                <h1>{exactMatchesResp}</h1>
                <p>Give it another go...</p>
            </>
        )
    } else {
        return (
            <>
                <section className="converter-results">
    
                    <h2>Exact Matches</h2>
                    <div className="searched-section">
                        <div className="container flex">
                            {allExactMatches.map((paint, index) => {
                                if (paint.manufacturer.toLowerCase() == manufacturer) {
                                    console.log(paint.manufacturer)
                                    console.log(paint.manufacturer.toLowerCase())
                                    return (
                                    <div className="card" key={index}>
                                            {paint.manufacturer} No. {paint.paintNum}
                                        <div className="circle" >
                                            {Circle(paint.hexValue)}
                                        </div>
                                        {paint.name}
                                    </div>
                                    )
                                }})}
                        </div>
                    </div>
    
                    <div id="exact-matches">
                        <div className="container flex">
                            {allExactMatches.map((paint, index) => {
                                if (paint.manufacturer.toLowerCase() != manufacturer) {
                                    return (
                                        <div className="card" key={index}>
                                            {paint.manufacturer} No. {paint.paintNum}
                                            <div className="circle">
                                                {Circle(paint.hexValue)}
                                            </div>
                                            {paint.name}
                                        </div>
                                    )
                                }})}
                        </div>
                    </div>
    
                    <h2>Closest Matches</h2>
                        <div className="closest-matches">
                            <div className="container flex">
                                {allCloseMatches.map((paint, index) => {
                                    return (
                                        <div className="card" key={index}>
                                            {paint.manufacturer} No. {paint.paintNum}
                                            <div className="circle">
                                                {Circle(paint.hexValue)}
                                            </div>
                                            {paint.name}
                                        </div>
                                    )
                                })}
                            </div>
                        </div>
    
    
                </section>
    
            </>
        )
    }

}

export default ConverterResults;