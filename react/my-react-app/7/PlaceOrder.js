// PlaceOrder.js

import React from 'react';

function PlaceOrder() {
  const placeOrder = () => {
    alert("Order placed successfully!");
  }

  return (
    <button onClick={placeOrder}>Place Order</button>
  );
}

export default PlaceOrder;
