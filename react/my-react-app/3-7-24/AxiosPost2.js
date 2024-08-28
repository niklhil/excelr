import axios from "axios";
import React, { useState } from "react";
import "./App.css"; 

function AxiosPost() {
    const initialData = { fname: "", lname: "" };
    const [inputData, setInputData] = useState(initialData);

    const handleData = (e) => {
        setInputData({ ...inputData, [e.target.name]: e.target.value });
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        axios.post("https://jsonplaceholder.typicode.com/users", inputData)
            .then((response) => {
                console.log(response);
            })
            .catch((error) => {
                console.error("Error:", error);
            });
    }

    return (
        <div className="container"> 
            <div className="input-container"> 
                <label>First Name:</label>
                <input type="text" name="fname" value={inputData.fname} onChange={handleData} />
            </div>
            <div className="input-container"> 
                <label>Last Name:</label>
                <input type="text" name="lname" value={inputData.lname} onChange={handleData} />
            </div>

            <button onClick={handleSubmit}>Submit</button>
        </div>
    );
}

export default AxiosPost;
