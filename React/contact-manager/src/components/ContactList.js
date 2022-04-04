import React from "react";
const ContactList=(props)=>{
    console.log(props);
    const renderContactList = props.contacts.map((contact)=>{
        return(
            <div className="item">
                <div className="content">
                    <div className="header">{contact.name}</div>
                    <div className="description">{contact.email}</div>
                    <i className="trash alternate outline icon"></i>
                </div>
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