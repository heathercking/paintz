import React from 'react';


const PaintDetail = ( {selectedPaint}) => {

    if (!selectedPaint) {
        return null
    }

    let name = selectedPaint.name;
    console.log(name)
    let number = selectedPaint.paintNum;
    console.log(number)

    return(
        <>
            <h1>I am the paint details pop-up</h1>

            {/* <p>{selectedPaint.paintNum}</p> */}
        </>
    )
}

export default PaintDetail;