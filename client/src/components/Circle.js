import React from 'react';

const Circle = () => {

    var circleStyle = {
        padding:10,
        margin:20,
        display:"inline-block",
        backgroundColor: "#000000",
        borderRadius: "50%",
        width:50,
        height:50,
      };

      return (
        <div style={circleStyle}>
        </div>
      );


}

export default Circle;