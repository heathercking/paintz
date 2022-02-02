import React from 'react';
import SearchResultsItem from './SearchResultsItem';
import '../css/SearchResults.css'



const SearchResults = ({paints}) => {
    

    const paintsItems = paints.map((paint, index) => {
        return <SearchResultsItem paint={paint} key={index} />
    })
    

    return (
        <section className="search-results">
            <div className="searched-section">
                <div className="container flex">
                        {paintsItems}
                </div>
            </div>
        </section>
    )
}

export default SearchResults;