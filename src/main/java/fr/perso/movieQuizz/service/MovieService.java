package fr.perso.movieQuizz.service;

import fr.perso.movieQuizz.model.Movie;
import fr.perso.movieQuizz.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie getMovie(int id) {
        return movieRepository.findById(id).orElse(null);
    }

    public Movie saveMovie(Movie movie) {
        movieRepository.save(movie);
        return movie;
    }

}
