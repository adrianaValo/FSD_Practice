import { useState } from "react";
import MovieItem from "./MovieItem"
import { Container, Row, Col } from 'react-bootstrap';


const MovieList=({movies})=>{

  const [filteredMovies, setFilteredMovies] = useState(movies);
  
  const filterMovies = (keyword) => {
    const filtered = movies.filter(movie => movie.Title.toLowerCase().includes(keyword.toLowerCase()));
    setFilteredMovies(filtered);
  };

    return(
      <Container>
      <h2>Movies</h2>
      <Row s={1} sm={2} md={3} lg={4}>
        {movies.map((movie) => (
          
            
              <MovieItem movie={movie} />
            
         
        ))}
      </Row>
    </Container>
  );

}

export default MovieList;