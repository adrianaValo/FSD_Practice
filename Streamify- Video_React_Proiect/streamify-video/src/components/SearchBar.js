import { useState } from "react";
import { BiSearch } from 'react-icons/bi';
import { Button, Form, FormControl, InputGroup } from 'react-bootstrap';




const SearchBar=({onSearch})=>{
    const [searchTerm,setSearchTerm]=useState('');

    const handleSubmit=(event)=>{
            event.preventDefault();
            onSearch(searchTerm);
    }

    const handleChange=(event)=>{
        setSearchTerm(event.target.value);

    }

    return (
        <Form onSubmit={handleSubmit}>
            <InputGroup className="mb-3">
            
            <FormControl type="text" placeholder="Search Movies" className= "mr-sm-2" value={searchTerm}  onChange={handleChange} />
            
            <InputGroup.Text>
            <Button variant= "outline-success" type= "submit" style={{ marginLeft: '5px', marginTop: '5px'}}>
                <BiSearch /> Search
                </Button>
                </InputGroup.Text>
            </InputGroup>
        </Form>
    )
}

export default SearchBar;