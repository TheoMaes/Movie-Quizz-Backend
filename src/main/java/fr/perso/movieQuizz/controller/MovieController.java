package fr.perso.movieQuizz.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.perso.movieQuizz.model.Movie;
import fr.perso.movieQuizz.service.MovieService;
import org.eclipse.jetty.websocket.jsr356.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import javax.imageio.stream.FileImageOutputStream;
import java.awt.*;
import java.util.*;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/find")
    public Movie getMovie(@RequestParam int id) {
        return movieService.getMovie(id);
    }

    @PostMapping("/save")
    public Movie postFilm(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    /*
    EXTERNAL API REQUESTS
     */
    @GetMapping(value = "/findExternalAPI")
    private Movie getFilmExternalAPI(@RequestParam int id)
    {
        final String uri = "https://api.themoviedb.org/3/movie/"+id+"?api_key=b82973427eb927f7cf6d2f6519aca43d";

        RestTemplate restTemplate = new RestTemplate();
        Movie result = restTemplate.getForObject(uri, Movie.class);

        return result;
    }

    @GetMapping(value = "/RandomExternalAPI")
    private Object getRandomFilm() throws JsonProcessingException {
        String uri = "https://api.themoviedb.org/3/movie/popular?api_key=b82973427eb927f7cf6d2f6519aca43d&page=";
        Random random = new Random();
        int page = random.nextInt(20);

        uri = uri + Integer.toString(page);

        RestTemplate restTemplate = new RestTemplate();
        Object result = restTemplate.getForObject(uri, Object.class);

        return result;

    }

}
