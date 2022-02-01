import React from 'react';
import '../css/SearchResultsItem.css';

const SearchResultsItem = ({paint}) => {

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

    return (
        <>
            <div className="card">
                {paint.manufacturer} No. {paint.paintNum}
                <div className="circle" >
                    {Circle(paint.hexValue)}
                </div>
                {paint.name}
            </div>
        </>
    )
}

export default SearchResultsItem;