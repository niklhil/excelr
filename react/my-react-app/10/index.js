import React,{useState} from "react";
import ReactDOM from "react-dom/client";
function MyForm()
{
    const[selectedFruit,setselectedFruit]=useState("apple");
    const handleChange=(event)=>
        {
            setselectedFruit(event.target.value);
        }

    return(
        <form>
            <label>
                chose your fruit:
                <select value={selectedFruit} onChange={handleChange}>
                    <option value="apple">Apple</option>
                    <option value="banana">Banan</option>
                    <option value="orange">Orange</option>
                </select>
            </label>
            <p>You selected:{selectedFruit}</p>
            </form>
    )
}
 const root=ReactDOM.createRoot(document.getElementById('root'));
 root.render(<MyForm/>);