package dev.farhan.movieist.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    // instantiated this class for us
    @Autowired
    private MovieRepository repository;

    public List<Movie> findAllMovies() {
        return repository.findAll(); // predefined method from repo
    }

    // id may not exist
    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }
}
