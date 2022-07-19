import { useState, useEffect } from 'react';
import ShirtCard from './ShirtCard.js';
import ShirtForm from './ShirtForm.js';

function TShirts() {

    const [TShirts, setShirts] = useState([]);
    const [showForm, setShowForm] = useState(false);
    const [scopedShirt, setScopedShirt] = useState({});
    const [error, setError] = useState();

    useEffect(() => {
        fetch("http://localhost:8080/tShirts")
        .then(response => response.json())
        .then(result => setShirts(result))
        .catch(TShirts.log);
    }, []);

    function addClick() {
        const now = new Date();
        setScopedShirt({ id: 0, size: "", color: "", description:"", price: "", quantity: ""});
        setShowForm(true);
    }

    function notify({ action, Shirt, error }) {

        if (error) {
            setError(error);
            setShowForm(false);
            return;
        }

        switch (action) {
            case "add":
                setShirts([...TShirts, Shirt]);
                break;
            case "edit":
                setShirts(TShirts.map(e => {
                    if (e.id === Shirt.id) {
                        return Shirt;
                    }
                    return e;
                }));
                break;
            case "edit-form":
                setScopedShirt(Shirt);
                setShowForm(true);
                return;
            case "delete":
                setShirts(TShirts.filter(e => e.id !== Shirt.id));
                break;
        }
        
        setError("");
        setShowForm(false);
    }

    if (showForm) {
        return <ShirtForm Shirt={scopedShirt} notify={notify} />
    }

    return (
        <>
            {error && <div className="alert alert-danger">{error}</div>}
            <div>
                <h1 id='ShirtTitle'>TShirts</h1>
                <button className="btn btn-primary" type="button" onClick={addClick}>Add a Shirt</button>
                <table id='TShirts'>
                    <tr>
                        <th>Size</th>
                        <th>Color</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>Quantity</th>
                    </tr>
                    <tbody>
                        {TShirts.map(r => <ShirtCard key={r.ShirtId} Shirt={r} notify={notify} />)}
                    </tbody>
                </table>
            </div>
        </>
    )
}

export default TShirts;