package fr.perso.movieQuizz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private int id;

    private String original_language;

    private String title;

    private long revenue;

    private List<Genre> genres;

    private int runtime;

    private String release_date;

    private String status;

    private String backdrop_path;

}
