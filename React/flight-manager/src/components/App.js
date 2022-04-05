import React,{useState,useEffect} from 'react';
import './App.css';
import Header from './Header';
import AddAircraft from './AddAircraft';
import AircraftList from './AircraftList';

function App() {
  const LOCAL_STORAGE_KEY = 'aircrafts';
  const [aircrafts, setAircrafts] = useState([]);
  const addAircraftHandler = (aircraft) => {
    setAircrafts([...aircrafts, aircraft]);
  };
  useEffect(() => {
    const retrievedAircrafts = JSON.parse(localStorage.getItem(LOCAL_STORAGE_KEY));
    if (retrievedAircrafts) {
      setAircrafts(retrievedAircrafts);
    }
  }, []);
  useEffect(() => {
    localStorage.setItem(LOCAL_STORAGE_KEY, JSON.stringify(aircrafts));
  }, [aircrafts]);
  return (
    <div className="App">
      <Header className="App-header"/>
        <AddAircraft addAircraftHandler={addAircraftHandler} />
        <AircraftList aircrafts={aircrafts} />
    </div>
  );
}

export default App;
