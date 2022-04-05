import React from "react";
import ContactCard from "./ContactCard";

const ContactList=(props)=>{
    console.log(props);
    const renderContactList = props.contacts.map((contact)=>{
        return(
            <div className="item">
            <img className="avatar" src={user} alt="user" width={"20px"} height={"20px"} />
            <div className="content">
                <div className="header">{name}</div>
                <div className="description">{email}</div>
                <i className="trash alternate outline icon" style={{color:'Red',marginTop:'7px'}}></i>
            </div>
            {/* <ContactCard contact={con
                tact}></ContactCard> */}
        </div>
        );
});

return(
    <div className="ui Celled list">
        Contact list
        {renderContactList}
    </div>
    );
}

export default ContactList;