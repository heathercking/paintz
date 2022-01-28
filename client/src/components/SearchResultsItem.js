import React from 'react';

const SearchResultsItem = ({paint}) => {


    return (
        <>
            <ul>
            <li>
                {paint.name}
            </li>
            <li>
                Paint Number:
                {paint.paintNum}
            </li>
            <li>
                Model Number: 
                {paint.modelNum}
            </li>
            <br></br>
            </ul>

        </>
    )
}

export default SearchResultsItem;