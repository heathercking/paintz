import React, {useState, useEffect} from "react";
import HomePageContainer from './HomePageContainer';
import SearchResults from "../components/SearchResults";
import {getPaints} from '../services/PaintzService';
import Search from "../components/Search";
import '../css/PaintSearchContainer.css';

function PaintSearchContainer() {

    const [paints, setPaints] = useState([]);
    const [filteredPaints, setFilteredPaints] = useState([]);
    const [chosenBrand, setChosenBrand] = useState("default");
    const [searchTerm, setSearchTerm] = useState("");

    useEffect(() => {
        getPaints()
        .then((paints) => {
            setPaints(paints)
            
        }); 
        filter(searchTerm);
    }, [chosenBrand])



    
    const handleBrandFilter = (event) => {
        event.preventDefault();
        setChosenBrand(event.target.value)
    }

    const handleSearchTerm = (value) => {
        setSearchTerm(value)

    }

    const filter = (searchTerm) => {
        const lowerSearch = searchTerm.toLowerCase();


        const filteredPaints = paints.filter((paint) => {
            if (chosenBrand != "default"){
          return (paint.name.toLowerCase().indexOf(lowerSearch) > -1 && paint.manufacturer == chosenBrand
          || paint.hexValue.toLowerCase().indexOf(lowerSearch) > -1 && paint.manufacturer == chosenBrand
          || paint.paintNum.toLowerCase().indexOf(lowerSearch) > -1 && paint.manufacturer == chosenBrand
          || paint.modelNum.toLowerCase().indexOf(lowerSearch) > -1 && paint.manufacturer == chosenBrand
          )
        } else {
            return (paint.name.toLowerCase().indexOf(lowerSearch) > -1 
          || paint.hexValue.toLowerCase().indexOf(lowerSearch) > -1 
          || paint.paintNum.toLowerCase().indexOf(lowerSearch) > -1 
          || paint.modelNum.toLowerCase().indexOf(lowerSearch) > -1 ) 
          
        }
        
      });
      setFilteredPaints(filteredPaints);
    }

    return (
        <div className="paint-search">
            <h1 className="paint-search-heading">Paint Search</h1>
            <Search handleChange={filter} handleSearchTerm={handleSearchTerm} searchTerm={searchTerm}/>
            <div>
                {filteredPaints.length > 0 ? 
                    <select className="search-input" defaultValue="" onChange={handleBrandFilter} >
                    <option value="default">Choose a Brand</option>
                    <option value="HUMBROL">Humbrol</option>
                    <option value="REVELL">Revell</option>
                    <option value="TAMIYA">Tamiya</option>
                    </select>
                    :
                    ""
                }
            </div>
            <div>
                {filteredPaints.length > 0 ? <SearchResults paints={filteredPaints}/> : <p>begin typing to search...</p>}
            </div>
            
        </div>
    )
}

export default PaintSearchContainer;