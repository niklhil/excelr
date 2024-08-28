import React from 'react';
import ReactDOM from 'react-dom';

const MyComponent = () => {
  const container = document.getElementById('testRoot');
  const root = ReactDOM.createRoot(container);
  root.render(<p>Hello</p>);
};

export default MyComponent;




