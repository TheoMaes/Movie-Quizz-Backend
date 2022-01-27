package fr.perso.movieQuizz.repository;

import fr.perso.movieQuizz.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
