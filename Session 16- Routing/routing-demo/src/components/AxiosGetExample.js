

import React, { useEffect, useState } from "react";
import axios from "axios";


function AxiosGetExample(){

    const [users,setUsers]=useState([]);
    const getData= async()=>{

        try {
            
            //backend data fetch: http://localhost:8080/api/auth/users/
            //task:http://universities.hipolabs.com/search?country=india
            const resp=await axios.get('https://jsonplaceholder.typicode.com/posts');
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
            <h1 className="bg-secondary text-warning">Universities List In ROMANIA</h1>
            
            <h2 className="text-center">Example Axios GET</h2>
            <table className="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>User ID</th> <th>ID</th> <th>Title</th> <th>Body</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        users.map((item)=>{
                            return(<tr key={item.id}>
                                <td>{item.userId}</td>
                                <td>{item.id}</td>
                                <td>{item.title}</td>
                                <td>{item.body}</td>
                                
                            </tr>)
                        })
                    }
                </tbody>
            </table>
        </div>
    )
}
export default AxiosGetExample;