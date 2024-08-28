import axios from "axios";
import React, { useEffect, useState } from "react";

const baseURL = "https://jsonplaceholder.typicode.com/users";

 function AxiosGet() {
  const [userData, setData] = useState([]);

  useEffect(() => {
    console.log("Effect triggered");
    axios.get(baseURL).then((response) => {
      console.log(response)  
      setData(response.data);
    })
  }, []);

   return (
    <div>Axios Tutorial
    {
        userData.map((data)=>{
            return (
                <div>{data.name}</div>
            )
        })
    }
    </div>
  )
}

export default AxiosGet

