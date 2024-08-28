import React, { Component } from 'react';

class Customer extends Component {
  constructor() {
    super();

    // Initialize state directly in the constructor
    this.state = {
      loyaltyPoints: 500,
      preferredLanguage: 'English',
    };
  }

  render() {
    const { loyaltyPoints, preferredLanguage } = this.state;

    return (
      <div>
        <h2>Greetings, valued customer!</h2>
        <p>{`Loyalty Points: ${loyaltyPoints}`}</p>
        <p>{`Preferred Language: ${preferredLanguage}`}</p>
      </div>
    );
  }
}

export default Customer;