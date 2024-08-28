// PersonInfo.js
import React, { Component } from 'react';

class PersonInfo extends Component {
  constructor(props) {
    super(props);

    // Initialize state with person information
    this.state = {
      name: "John",
      age: 30,
      gender: "Male",
      city: "New York"
    };
  }

  // Event handler to update the city in the state
  updateCity = () => {
    this.setState({city: "Bangalore"});
  };

  render() {
    return (
      <div>
        <h1>{this.state.name}'s Information</h1>
        <p>
          Name: {this.state.name} <br />
          Age: {this.state.age} <br />
          Gender: {this.state.gender} <br />
          City: {this.state.city} <br />
        </p>
        <button onClick={this.updateCity}>Update City</button>
      </div>
    );
  }
}

export default PersonInfo;

