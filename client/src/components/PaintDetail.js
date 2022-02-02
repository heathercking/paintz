import React from 'react';
import '../css/PaintDetail.css'


const PaintDetail = ( {chosenPaint, closeModal}) => {

    if (!chosenPaint) {
        return null
    }

    // let name = selectedPaint.name;
    // console.log(name)
    // let number = selectedPaint.paintNum;
    // console.log(number)

    // let name = chosenPaint.name;

    return(
        <>
            <div className="paint-modal">
                <div className="paint-modal-content">
                    <div className="paint-modal-header">
                        <h1 className="paint-modal-title">{chosenPaint.name}</h1>
                        <div className="paint-modal-body">
                            <p>Paint Number: {chosenPaint.paintNum}</p>
                            <p>Model Number: {chosenPaint.modelNum}</p>
                            <p>Manufacturer: {chosenPaint.manufacturer}</p>
                            <p>Paint Type: {chosenPaint.paintType}</p>
                            <p>Size: {chosenPaint.size}</p>
                        </div>
                        <div className="paint-modal-footer">
                            <button type="submit" onClick={closeModal}  >Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}

export default PaintDetail;