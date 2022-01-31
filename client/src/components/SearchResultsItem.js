import React from 'react';

const SearchResultsItem = ({paint}) => {


    return (
        <>
            <a className="paintItem">{paint.paintNum} - {paint.name}</a>
            <br></br>
        </>
    )
}

export default SearchResultsItem;