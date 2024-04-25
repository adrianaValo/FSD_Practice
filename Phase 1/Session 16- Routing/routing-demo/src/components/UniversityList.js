

import React, { useEffect, useState } from "react";
import axios from "axios";


function UniversityList(){

    const [users,setUsers]=useState([]);
    const getData= async()=>{

        try {
            
            //backend data fetch: http://localhost:8080/api/auth/users/
            //task:http://universities.hipolabs.com/search?country=india
            const resp= await axios.get('https://jsonplaceholder.typicode.com/users');
            console.log(resp.data);
            setUsers(resp.data);
            
        } catch (error) {
            console.log(error);
        }
    }

    useEffect(()=>{
        getData(); //function call when component will load for very first time
    },[])

    return(
        <div className="container">
            <h1 className="bg-secondary text-warning">List Users</h1>
            <h2>Task: to set the data in table</h2>
            <h2 className="text-center">User List</h2>
            <table className="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>Id </th> <th>Name </th> <th>Username </th> <th>Email </th> <th>Address </th> <th>Phone </th> <th>Website </th> <th>Company </th>
                    </tr>
                </thead>
                <tbody>
                    {
                        users.map((item)=>{
                            return(<tr key={item.id}>
                                <td>{item.id}</td>
                                <td>{item.name}</td>
                                <td>{item.username}</td>
                                <td>{item.email}</td>
                                <td>{item.address.street}, {item.address.zipcode}</td>

                                <td>{item.phone}</td>
                                <td>{item.website}</td>
                                <td>{item.company.name}</td>
                            </tr>)
                        })
                    }
                </tbody>
            </table>
        </div>
    )
}
export default UniversityList;