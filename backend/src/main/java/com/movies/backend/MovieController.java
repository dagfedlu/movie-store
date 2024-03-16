// package com.movies.backend.controllers;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.movies.backend.models.Movie;
// import com.movies.backend.repositories.MovieRepository;

// // import io.micrometer.common.lang.NonNull;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// // import org.springframework.http.HttpStatusCode;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// // import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;



// @RestController
// @RequestMapping("/movies")
// public class MovieController {

//     @Autowired
//     MovieRepository movieRepository;

//     @GetMapping("/all")
//     // public @ResponseBody Iterable<Movie> getAllMovies() {
//     //     return movieRepository.findAll();
//     // }
//     public ResponseEntity<List<Movie>> getAllMovies(@RequestParam(required = false) String title) {
//         try {
//             List<Movie> movies = new ArrayList<Movie>();
//             if (title == null) {
//                 movieRepository.findAll().forEach(movies::add);
//             } else {
//                 movieRepository.findByTitleContaining(title).forEach(movies::add);
//             }

//             if (movies.isEmpty()) {
//                 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//             }
            
//             return new ResponseEntity<>(movies, HttpStatus.OK);
//         } catch (Exception e) {
//             return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//         }
//     }

//     @PostMapping("/add")
//     // public @ResponseBody String addNewMovie (@RequestParam String title, @RequestParam String genre,
//     // @RequestParam Double rating, @RequestParam String trailer) {
//     //     Movie m = new Movie();
//     //     m.setTitle(title);
//     //     m.setGenre(genre);
//     //     m.setRating(rating);
//     //     m.setTrailer(trailer);
//     //     movieRepository.save(m);

//     //     return "Success";
//     // }
//     // public String saveMovie(@RequestBody @NonNull Movie movie) {
//     //     movieRepository.save(movie);
//     //     return "success";
//     // }
//     public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
//         try {
//             Movie _movie = movieRepository.save(new Movie(movie.getTitle(), movie.getGenre(), movie.getRating(), movie.getTrailer()));
//             return new ResponseEntity<>(_movie, HttpStatus.OK);
//         } catch(Exception e) {
//             return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//         }
//     }

    
    
// }
