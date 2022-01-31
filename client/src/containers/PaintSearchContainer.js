import React, {useState, useEffect} from "react";
import HomePageContainer from './HomePageContainer';
import SearchResults from "../components/SearchResults";
import {getPaints} from '../services/PaintzService';
import Search from "../components/Search";

function PaintSearchContainer() {


    const [paints, setPaints] = useState([]);
    const [filteredPaints, setFilteredPaints] = useState([]);

    useEffect(() => {
        getPaints()
        .then((paints) => {
            setPaints(paints)
            setFilteredPaints(paints);
        });
    }, [])

    
    const filter = (searchTerm) => {
        const lowerSearch = searchTerm.toLowerCase();
        const filteredPaints = paints.filter((paint) => {
          return paint.name.toLowerCase().indexOf(lowerSearch) > -1;
        });
        setFilteredPaints(filteredPaints);
      }


    

    return (
        <div>
            <h2>Paint Search</h2>
            <Search handleChange={filter}/>
            <div>
            <SearchResults paints={filteredPaints}/>
            </div>
            
        </div>
    )
}

export default PaintSearchContainer;