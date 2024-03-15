import MovieItem from "./MovieItem"
import { Container, Row, Col } from 'react-bootstrap';


const MovieList=({movies})=>{

    return(
        <Container>
        <h2>Movies</h2>
        <Row>
          {movies.map((movie) => (
            <Col key={movie.imdbID} xs={12} sm={6} md={4} lg={3}>
              <MovieItem movie={movie} />
            </Col>
          ))}
        </Row>
      </Container>
    )

}

export default MovieList;