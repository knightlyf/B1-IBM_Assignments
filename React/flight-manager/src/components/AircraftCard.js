import React from 'react';
import plane from '../image/plane.png';
const AircraftCard = (props) => {
    const { aircraft,arrival,departure } = props.aircraft;
    // aircraft_t=aircraft
    const source ="https://airhex.com/images/airline-logos/tail/"+aircraft.toLowerCase()+".png"
    return(
        <div className="item">
            {/* <img className='pic' src={plane} alt="plane" width="30px"/> {aircraft} {departure} {"-->"} {arrival} */}
            <table>
                <tr>
                    <th></th>
                    <th>Airline</th>
                    <th>Departure</th>
                    <th>Arrival</th>
                </tr>
                <tr>
                    {/* <td><img className='pic' src={plane} alt="plane" width="30px"/></td> */}
                    <td><img src={source}  width="30px"/></td>
                    <td>{aircraft}</td>
                    <td>{departure}</td>
                    <td>{arrival}</td>
                </tr>
            </table>
            {/* <div className="content">
                <div className="header">{aircraft}</div>
                <div>{arrival}</div>
                <div>{departure}</div>
         
            </div> */}
        </div>
    );
}

export default AircraftCard;