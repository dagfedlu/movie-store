package com.movies.backend.models;

import org.springframework.beans.factory.annotation.Value;

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

    @Value("{0}")
    private Double rating;

    public Movie () {}

    public Movie (String title, String genre, Double rating, String trailer) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.trailer = trailer;
    }

}
