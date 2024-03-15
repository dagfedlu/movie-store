package com.movies.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;

    private String genre;

    private String trailer;

}
