package fr.perso.movieQuizz.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.perso.movieQuizz.model.Movie;
import org.eclipse.jetty.websocket.jsr356.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import javax.imageio.stream.FileImageOutputStream;
import java.util.*;

@RestController
public class MovieController {

    @GetMapping(value = "/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping(value = "/film")
    private Movie getFilm(@RequestParam int id)
    {
        final String uri = "https://api.themoviedb.org/3/movie/"+id+"?api_key=b82973427eb927f7cf6d2f6519aca43d";

        RestTemplate restTemplate = new RestTemplate();
        Movie result = restTemplate.getForObject(uri, Movie.class);

        return result;
    }

    @GetMapping(value = "/filmRandom")
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
