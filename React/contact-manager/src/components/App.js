import React from 'react';
import Header from './Header';
import ContactList from './ContactList';
import ContactCard from './ContactCard';
import AddConatct from './AddContact';
import './App.css';

function App() {
  const contacts = [
    {'id': 1,'name':'Alpha', 'email':'Alpha1@email.com'},
    {'id': 2,'name':'Beta', 'email':'Beta1@email.com'}
  ]
  return (
    <div>Hello World
      <Header />
      <AddConatct />
      <ContactList contacts={contacts} />
      {/* <ContactCard /> */}
    </div>
    
  
  );
}

export default App;
