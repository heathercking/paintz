import React, {useEffect}  from 'react';


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
          <input
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