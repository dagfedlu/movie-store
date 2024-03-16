package com.movies.backend.models;

// import org.springframework.data.annotation.Reference;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // our relation is one movie multiple rating => many to one
    // we would be referencing id fild of Movie table
    // movieId (ref key) == Movie id (primary key)
    private Long movieId;

    private Double score;

    public Rating() {}

    public Rating(Long id, Double score) {
        this.movieId = id;
        this.score = score;
    }
}
