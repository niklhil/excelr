// UserProfile.js
import React, { Component } from 'react';
import Customer from './Customer';

class UserProfile extends Component {
  render() {
    return (
      <div>
        <h2>User Profile</h2>
        <Customer />
        <p>User Name: John Doe</p>
        <p>Email: john.doe@example.com</p>
      </div>
    );
  }
}

export default UserProfile;
