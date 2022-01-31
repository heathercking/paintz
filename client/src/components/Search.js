import React, {useState, useEffect, Component}  from 'react';
import SearchResults from './SearchResults';


function Search ({handleChange})  {

    const [searchTerm, setSearchTerm] = useState("");
  
    const changeSearchTerm = (event) => {
      event.preventDefault();
      setSearchTerm(event.target.value);
    }
  
    useEffect(() => {
      handleChange(searchTerm);
    }, [searchTerm]);
  
    const handleSubmit = (event) => {
      event.preventDefault();
    }

    return (
        <form onSubmit={handleSubmit}>
          <input
            onChange={changeSearchTerm}
            type="text"
            name="searchTerm"
            placeholder="search paints.."
            value={searchTerm} />
        </form>

    );



}


export default Search;