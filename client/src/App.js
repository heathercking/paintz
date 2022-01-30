import './App.css';
import { 
  BrowserRouter as Router,
  Routes,
  Route,
  Link
  } from 'react-router-dom';
import Header from './components/Header';
import PaintzContainer from './containers/PaintzContainer';
import HomePageContainer from './containers/HomePageContainer';
import PaintSearchContainer from './containers/PaintSearchContainer';
import PaintConverterContainer from './containers/PaintConverterContainer';
import LoginContainer from './containers/LoginContainer';
import UserInventoryContainer from './containers/UserInventoryContainer';
import Footer from './components/Footer';


function App() {
  
  return (

      <Router>
        
        <Header/>
        {/* <nav>
          <Link to="/home"> Home </Link>
          <Link to="/login"> Signin/Register </Link>
        </nav> */}

        <Routes>

          {/* <Route path="/" element={ <PaintzContainer /> } /> */}
          <Route path="/" element={ <HomePageContainer /> } />
          <Route path="/search" element={ <PaintSearchContainer /> } />
          <Route path="/convert" element={ <PaintConverterContainer /> } />
          <Route path="/login" element={ <LoginContainer /> } />
          <Route path="/inventory" element={ <UserInventoryContainer /> } />

          </Routes>
          <Footer/>

      </Router>

  );
}

export default App;
