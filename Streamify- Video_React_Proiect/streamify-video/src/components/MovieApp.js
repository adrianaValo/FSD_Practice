import React,{useState} from 'react';
import axios from 'axios';
import SearchBar from './SearchBar';
import MovieList from './MovieList';
import { Container, Row, Col, Spinner } from 'react-bootstrap';

const MovieApp=()=>{

    const [loading,setLoading]=useState(false);
    const [error,setError]=useState(false);
    const [movies,setMovies]=useState([]);

  

    //fetch the movie
    const fetchMovies= async(searchTerm)=>{
        setLoading(true);
        setError(null);

        const API_KEY=process.env.REACT_APP_API_KEY;

        try {
            
            const response=await axios.get(`https://www.omdbapi.com/?apikey=${API_KEY}&s=${searchTerm}`);
            if(response.data.Response === "True"){
                console.log(response.data);
                
                setMovies(response.data.Search);
            }else{
                setError(response.data.Error);
            }
        } catch (error) {
            setError('An Error Occured While Fetching the Data:',error);
        }finally{
            setLoading(false);
        }
    }


    return(
        
    <Container style= {{backgroundColor: '#e7f2f9' }}>

        <Col>

        <h1 className='text-center mt-5 mb-4'>Movie List</h1>
        
        <SearchBar onSearch={fetchMovies}/>

        </Col>

        <Row className='justify-content-center'>
            <Col className='text-center'>

            {loading && <Spinner animation= "border" role="status" className="mt-5">
                
                <span className='sr-only'>Loading....</span>
                </Spinner>}

            {error && <p className='text-danger mt-5'>{error}</p>}

            </Col>

        </Row>

         
        <Row>
            <Col>
                <MovieList movies={movies} />   
            </Col>
        </Row>
         
    </Container>);
};

export default MovieApp;