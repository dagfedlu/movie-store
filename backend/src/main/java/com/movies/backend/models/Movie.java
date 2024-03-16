package com.movies.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;

    private String genre;

    private String trailer;

    private Double rating = 0.0;

    public Movie () {}

    public Movie (String title, String genre, Double rating, String trailer) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.trailer = trailer;
    }

}
