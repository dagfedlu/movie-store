package com.movies.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.backend.models.Movie;
import com.movies.backend.models.Rating;
import com.movies.backend.repositories.MovieRepository;
import com.movies.backend.repositories.RatingRepository;

/* 
 * define methods here for user
 * 1. to get all movies
 * 2. to rate movies
 * 
*/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    MovieRepository movieRepository;
    @Autowired
    RatingRepository ratingRepository;

    // get a list of all movies
    @GetMapping("/movies")
    // match the id rating id to movie id to get rating for each record and display avg(movie id) = rating
    public @ResponseBody Iterable<Movie> getAllMovies() {
        
        return movieRepository.findAll();
    }

    @PostMapping("/rating/{id}")
    public ResponseEntity<Rating> rateMovie(@PathVariable("id") Long id, @RequestBody Rating r) {
        try {
            // Rating newRating = new Rating();
            // newRating.setMovieId(id);
            // newRating.setScore(r.getScore());
            // ratingRepository.save(newRating);
            Rating _rating = ratingRepository.save(new Rating(id, r.getScore()));
            return new ResponseEntity<>(_rating, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // for testing only
    @GetMapping("/ratings")
    public @ResponseBody Iterable<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }
}
