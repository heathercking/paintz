import React, {useEffect} from 'react';
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
            value={searchTerm} 
            autoComplete="off" />
        </form>   
        </>
    );
}


export default Search;