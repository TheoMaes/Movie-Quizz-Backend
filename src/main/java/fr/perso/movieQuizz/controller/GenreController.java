package fr.perso.movieQuizz.controller;

import fr.perso.movieQuizz.model.Genre;
import fr.perso.movieQuizz.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/genre")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping(value = "/genre")
    public Genre getGenre(@RequestParam int id) {
        return genreService.getGenre(id);
    }

    @PostMapping(value = "/save")
    public Genre saveGenre(Genre genre) {
        return genreService.saveGenre(genre);
    }

}
