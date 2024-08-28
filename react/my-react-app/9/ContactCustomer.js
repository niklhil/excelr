// ContactCustomer.js

import React from 'react';

function ContactCustomer() {
  const contact = (message, event) => {
    alert(message);
    alert(`Event type: ${event.type}`);
  }

  return (
    <button onClick={(event) => contact("Customer contacted successfully!", event)}>Contact Customer</button>
  );
}

export default ContactCustomer;
