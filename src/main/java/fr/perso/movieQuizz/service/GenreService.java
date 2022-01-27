package fr.perso.movieQuizz.service;

import fr.perso.movieQuizz.model.Genre;
import fr.perso.movieQuizz.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public Genre getGenre(int id) {
        return genreRepository.findById(id).orElse(null);
    }

}
