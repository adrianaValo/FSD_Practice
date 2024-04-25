
import { Container, Col } from 'react-bootstrap';
import Card from 'react-bootstrap/Card';

const MovieItem=({movie})=>{
  return (
    <Col xs={12} sm={6} md={4} lg={3} className="mb-3">
      <Card style={{ height: '100%' }}>
        <Card.Img variant="top" src={movie.Poster} style={{ objectFit: 'cover', height: '250px' }} />
        <Card.Body>
          <Card.Title>{movie.Title}</Card.Title>
          <Card.Text>Year: {movie.Year}</Card.Text>
          <Card.Text>Type: {movie.Type}</Card.Text>
        </Card.Body>
      </Card>
    </Col>
  );
}

export default MovieItem;