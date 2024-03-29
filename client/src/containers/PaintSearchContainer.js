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
    const [chosenColour, setChosenColour] = useState("default");
    const [chosenPaintType, setChosenPaintType] = useState("default");
    const [searchTerm, setSearchTerm] = useState("");

    useEffect(() => {
        getPaints()
        .then((paints) => {
            setPaints(paints)
            
        }); 
        filter(searchTerm);
    }, [chosenBrand,chosenColour,chosenPaintType] )


    
    const handleBrandFilter = (event) => {
        event.preventDefault();
        setChosenBrand(event.target.value)
    }

    const handleColourFilter = (event) => {
        event.preventDefault();
        setChosenColour(event.target.value)
    }

    const handlePaintTypeFilter = (event) => {
        event.preventDefault();
        setChosenPaintType(event.target.value)
    }

    const handleSearchTerm = (value) => {
        setSearchTerm(value)

    }

    const handleSearchReset = () => {
        setSearchTerm("");
        setChosenBrand("default");
        setChosenColour("default");
        setChosenPaintType("default");
    }

    // massive filter function!
    const filter = (searchTerm) => {
        const lowerSearch = searchTerm.toLowerCase();

        const filteredPaints = paints.filter((paint) => {
            if(chosenBrand != "default" && chosenColour != "default" && chosenPaintType != "default"){
                return (paint.name.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.colourCategory == chosenColour && paint.paintType == chosenPaintType)
                || paint.hexValue.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.colourCategory == chosenColour && paint.paintType == chosenPaintType)
                || paint.paintNum.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.colourCategory == chosenColour && paint.paintType == chosenPaintType)
                || paint.modelNum.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.colourCategory == chosenColour && paint.paintType == chosenPaintType)
                )
            } else if (chosenBrand != "default" && chosenColour != "default"){
                return (paint.name.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.colourCategory == chosenColour)
                || paint.hexValue.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.colourCategory == chosenColour)
                || paint.paintNum.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.colourCategory == chosenColour)
                || paint.modelNum.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.colourCategory == chosenColour)
                )
            } else if (chosenBrand != "default" && chosenPaintType != "default"){
                return (paint.name.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.paintType == chosenPaintType)
                || paint.hexValue.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.paintType == chosenPaintType)
                || paint.paintNum.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.paintType == chosenPaintType)
                || paint.modelNum.toLowerCase().indexOf(lowerSearch) > -1 && (paint.manufacturer == chosenBrand && paint.paintType == chosenPaintType)
                )
            } else if (chosenColour != "default" && chosenPaintType != "default"){
                return (paint.name.toLowerCase().indexOf(lowerSearch) > -1 && (paint.colourCategory == chosenColour && paint.paintType == chosenPaintType)
                || paint.hexValue.toLowerCase().indexOf(lowerSearch) > -1 && (paint.colourCategory == chosenColour && paint.paintType == chosenPaintType)
                || paint.paintNum.toLowerCase().indexOf(lowerSearch) > -1 && (paint.colourCategory == chosenColour && paint.paintType == chosenPaintType)
                || paint.modelNum.toLowerCase().indexOf(lowerSearch) > -1 && (paint.colourCategory == chosenColour && paint.paintType == chosenPaintType)
                )
            } else if (chosenBrand != "default") {
                return (paint.name.toLowerCase().indexOf(lowerSearch) > -1 && paint.manufacturer == chosenBrand
                || paint.hexValue.toLowerCase().indexOf(lowerSearch) > -1 && paint.manufacturer == chosenBrand
                || paint.paintNum.toLowerCase().indexOf(lowerSearch) > -1 && paint.manufacturer == chosenBrand
                || paint.modelNum.toLowerCase().indexOf(lowerSearch) > -1 && paint.manufacturer == chosenBrand
                )
        } else if (chosenColour != "default"){
                return (paint.name.toLowerCase().indexOf(lowerSearch) > -1 && paint.colourCategory == chosenColour
                || paint.hexValue.toLowerCase().indexOf(lowerSearch) > -1 && paint.colourCategory == chosenColour
                || paint.paintNum.toLowerCase().indexOf(lowerSearch) > -1 && paint.colourCategory == chosenColour
                || paint.modelNum.toLowerCase().indexOf(lowerSearch) > -1 && paint.colourCategory == chosenColour
                )
        } else if (chosenPaintType != "default"){
                return (paint.name.toLowerCase().indexOf(lowerSearch) > -1 && paint.paintType == chosenPaintType
                || paint.hexValue.toLowerCase().indexOf(lowerSearch) > -1 && paint.paintType == chosenPaintType
                || paint.paintNum.toLowerCase().indexOf(lowerSearch) > -1 && paint.paintType == chosenPaintType
                || paint.modelNum.toLowerCase().indexOf(lowerSearch) > -1 && paint.paintType == chosenPaintType
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
                    <div className="filter-buttons">
                        <h3 className="filters-heading">filters...</h3>

                            <select className="filter" defaultValue="" onChange={handleBrandFilter} >
                            <option value="default">brand</option>
                            <option value="HUMBROL">Humbrol</option>
                            <option value="REVELL">Revell</option>
                            <option value="TAMIYA">Tamiya</option>
                            </select>

                            <select className="filter" defaultValue="" onChange={handleColourFilter} >
                            <option value="default">colour</option>
                            <option value="RED">Red</option>
                            <option value="VIOLET">Violet</option>
                            <option value="GREEN">Green</option>
                            <option value="BLUE">Blue</option>
                            <option value="YELLOW">Yellow</option>
                            <option value="ORANGE">Orange</option>
                            <option value="BLACK">Black</option>
                            <option value="WHITE">White</option>
                            <option value="GREY">Grey</option>
                            <option value="NEUTRAL">Neutral</option>
                            </select>

                            <select className="filter" defaultValue="" onChange={handlePaintTypeFilter} >
                            <option value="default">type</option>
                            <option value="ENAMEL">Enamel</option>
                            <option value="ACRYLIC">Acrylic</option>
                            <option value="SPRAY_ACRYLIC">Spray Acrylic</option>
                            </select>
                    </div>
                : ""
                }
            </div>
            <div>
                {
                    (filteredPaints.length == 0 && chosenBrand != "default" && chosenColour != "default" && chosenPaintType != "default")
                    ? <button className="reset-button" onClick={handleSearchReset} type="submit">Reset</button> 
                    : (filteredPaints.length == 0 && chosenBrand != "default" && chosenColour != "default")
                    ? <button className="reset-button" onClick={handleSearchReset} type="submit">Reset</button> 
                    : (filteredPaints.length == 0 && chosenBrand != "default" && chosenPaintType != "default")
                    ? <button className="reset-button" onClick={handleSearchReset} type="submit">Reset</button> 
                    : (filteredPaints.length == 0 && chosenColour != "default" && chosenPaintType != "default")
                    ? <button className="reset-button" onClick={handleSearchReset} type="submit">Reset</button> 
                    : (filteredPaints.length > 0)
                    ? <button className="reset-button" onClick={handleSearchReset} type="submit">Reset</button> 
                    : ""
                }
            </div>
            <div>
                {filteredPaints.length > 0 ? <SearchResults paints={filteredPaints}/> : <p>begin typing to search...</p>}
            </div>  
        </div>
    )
}

export default PaintSearchContainer;