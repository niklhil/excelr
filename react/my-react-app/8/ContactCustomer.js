// ContactCustomer.js

import React from 'react';

function ContactCustomer() {
  const contact = (message) => {
    alert(message);
  }

  return (
    <button onClick={() => contact("Customer contacted successfully!")}>Contact Customer</button>
  );
}

export default ContactCustomer;
