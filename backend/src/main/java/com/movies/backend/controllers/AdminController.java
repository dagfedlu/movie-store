package com.movies.backend.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.backend.models.Movie;
import com.movies.backend.repositories.MovieRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




/*
 * define admin methods here
 * 1. all CRUD operations
 * 2. by default all raing will be given value = 0 
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    MovieRepository movieRepository;

    // read method
    @GetMapping("/read")
    public @ResponseBody Iterable<Movie> readMovies() {
        return movieRepository.findAll();
    }

    // create method
    @PostMapping("/create")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie m) {
        try {
            Movie _movie = movieRepository.save(new Movie(m.getTitle(), m.getGenre(), m.getRating(), m.getTrailer()));
            return new ResponseEntity<>(_movie, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // update method
    @PutMapping("edit/{id}")
    public ResponseEntity<Movie> editMovie(@PathVariable("id") Long id, @RequestBody Movie m) {
        Optional<Movie> movieData = movieRepository.findById(id);
        if(movieData.isPresent()) {
            Movie _movie = movieData.get();

            if(m.getTitle() != null) {
            _movie.setTitle(m.getTitle());
            }
            if(m.getGenre() != null) {
                _movie.setGenre(m.getGenre());
            }
            if(m.getRating() != null) {
                _movie.setRating(m.getRating());
            }
            if(m.getTrailer() != null) {
                _movie.setTrailer(m.getTrailer());
            }
            return new ResponseEntity<>(movieRepository.save(_movie), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // delete method
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Movie> deleteMovie(@PathVariable("id") Long id) {
        try {
            movieRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
