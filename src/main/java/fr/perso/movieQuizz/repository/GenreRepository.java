package fr.perso.movieQuizz.repository;

import fr.perso.movieQuizz.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
