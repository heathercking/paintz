import React from 'react';
import SearchResultsItem from './SearchResultsItem';


const SearchResults = ({paints}) => {

    const paintsItems = paints.map((paint, index) => {
        return <SearchResultsItem paint={paint} key={index} />
    })


    return (
        <div>
            <ul>
                {paintsItems}
            </ul>
        </div>
    )
}

export default SearchResults;