package fr.perso.movieQuizz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    private int id;

   // private String original_language;

    @Column(name = "title")
    private String title;

    //private long revenue;

    @ManyToOne(targetEntity = Genre.class)
    @JoinColumn(name = "id_genre")
    private Genre genre;

    //private List<Genre> genres;
    /*
    private int runtime;

    private String release_date;

    private String status;

    private String backdrop_path;
*/
}
