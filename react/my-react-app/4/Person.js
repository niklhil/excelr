import React, { Component } from 'react';

class Person extends Component {
  constructor(props) {
    super(props);

    // Initialize state using the constructor
    this.state = {
      age: 25,
    };

    // Define a class property
    this.country = 'India';
  }

  render() {
    const { firstName, lastName } = this.props;
    const { age } = this.state;

    return (
      <div>
        <h2>Greetings, {firstName} {lastName}!</h2>
        <p>{`Age: ${age}`}</p>
        <p>{`Country: ${this.country}`}</p>
      </div>
    );  
  }
}

export default Person;

