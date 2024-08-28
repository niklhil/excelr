import React from 'react';
import ReactDOM from 'react-dom';
import Person from './Person';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Person firstName="John" lastName="Doe" />);
