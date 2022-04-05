import React  from "react";
import user from "../images/OIP.jpg";

const ContactCard = (props) => {
    const {name,email} = props.contact;
    return (
        <div className="item">
            <img className="avatar" src={user} alt="user" width={"20px"} height={"20px"} />
            <div className="content">
                <div className="header">{name}</div>
                <div className="description">{email}</div>
                <i className="trash alternate outline icon" style={{color:'Red',marginTop:'7px'}}></i>
            </div>
        </div>
    );
}

export default ContactCard;