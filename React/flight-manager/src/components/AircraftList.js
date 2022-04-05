import React from 'react';
import AircraftCard from './AircraftCard';
const AircraftList = (props) => {
    const renderAircraft = props.aircrafts.map((aircraft) => {
        return(
            <AircraftCard aircraft = {aircraft}></AircraftCard>
        );
});
return(
    <div className="ui cards">Aircraft List
        {renderAircraft}
    </div>
    );
}

export default AircraftList;