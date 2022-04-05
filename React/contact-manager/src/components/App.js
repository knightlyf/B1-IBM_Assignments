import React,{useEffect,useState} from 'react';
import Header from './Header';
import ContactList from './ContactList';
import ContactCard from './ContactCard';
import AddContact from './AddContact';
import './App.css';

function App() {
  // const contacts = [
  //   {'id': 1,'name':'Alpha', 'email':'Alpha1@email.com'},
  //   {'id': 2,'name':'Beta', 'email':'Beta1@email.com'}
  // ]
  const LOCAL_STORAGE_KEY = 'contacts';
  const [contacts, setContacts] = useState([]);
  const addContactHandler = (contact) => {
    setContacts([...contacts, contact]);
  }

  useEffect(() => {
    const retrievedContacts = localStorage.getItem(LOCAL_STORAGE_KEY);
    if (retrievedContacts) setContacts(retrievedContacts);
  }, []);

  useEffect(() => {
    localStorage.setItem(LOCAL_STORAGE_KEY, JSON.stringify(contacts));
  }, [contacts]);

  return (
    <div className='ui container'>
      <Header />
      <AddContact addContactHandler={addContactHandler}/>
      <ContactList contacts={contacts} />
      {/* <ContactCard /> */}
    </div>
    
  
  );
}

export default App;
