import React from 'react';
class AddContact extends React.Component{
    state={
        aircraft: '',
        arrival: '',
        departure: ''
    };
add = (e) => {
    e.preventDefault();
    if(this.state.aircraft===""||this.state.arrival===""||this.state.departure===""){
        alert("Please fill all the fields");
        return;
    }
    this.props.addAircraftHandler(this.state);
    this.setState({aircraft:'',arrival:'',departure:''});

}
render(){
    return(
        <div className="ui form">
            <h2>Add Aircraft</h2>
            <form className='ui form' onSubmit={this.add}>
                <div className="field">
                    <label>Aircraft </label>
                    <input type="text" name="aircraft" placeholder="Aircraft" value={this.state.aircraft} onChange={(e)=>this.setState({aircraft:e.target.value})}/>           
                </div>
                <div className="field">
                    <label>Arrival </label>
                    <input type="text" name="arrival" placeholder="Arrival" value={this.state.arrival} onChange={(e)=>this.setState({arrival:e.target.value})}/>
                </div>
                <div className="field">
                    <label>Departure </label>
                    <input type="text" name="departure" placeholder="Departure" value={this.state.departure} onChange={(e)=>this.setState({departure:e.target.value})}/>
                </div>
                <button className='ui button '>Add</button><br></br><br></br>
            </form>
        </div>
        );
    }
}
export default AddContact;