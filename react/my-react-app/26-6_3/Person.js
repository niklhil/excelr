import React, { Component } from 'react';

class Person extends Component {
  constructor() {
    super();

    // Initialize state directly in the constructor
    this.state = {
      age: 25,
    };

    // Set a class property directly in the constructor
    this.country = 'India';
  }

  render() {
    const { age } = this.state;

    return (
      <div>
        <h2>Greetings!</h2>
        <p>{`Age: ${age}`}</p>
        <p>{`Country: ${this.country}`}</p>
      </div>
    );
  }
}

export default Person;
