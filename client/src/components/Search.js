import React, {useState, useEffect, Component}  from 'react';
import SearchResults from './SearchResults';
import '../css/Search.css';


function Search ({handleChange, handleSearchTerm, searchTerm})  {

    

  
    useEffect(() => {
      handleChange(searchTerm);
    }, [searchTerm]);


    const changeSearchTerm = (event) => {
        event.preventDefault();
        handleSearchTerm(event.target.value);
      }


 
  
    const handleSubmit = (event) => {
      event.preventDefault();
    }

    return (
        <>
        <form onSubmit={handleSubmit}>
          <input className="search-input"
            onChange={changeSearchTerm}
            type="text"
            name="searchTerm"
            placeholder="search paints.."
            value={searchTerm} />
        </form>

        
        </>

    );



}


export default Search;