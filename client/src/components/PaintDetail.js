import React from 'react';
import '../css/PaintDetail.css'


const PaintDetail = ( {chosenPaint}) => {

    if (!chosenPaint) {
        return null
    }

    // let name = selectedPaint.name;
    // console.log(name)
    // let number = selectedPaint.paintNum;
    // console.log(number)

    let name = chosenPaint.name;

    return(
        <>
            <div className="paint-modal">
                <div className="paint-modal-content">
                    <div className="paint-modal-header">
                        <h1 className="paint-modal-title">I am the paint details pop-up</h1>
                        <div className="paint-modal-body">
                            <p>{name}</p>
                        </div>
                        <div className="paint-modal-footer">
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}

export default PaintDetail;