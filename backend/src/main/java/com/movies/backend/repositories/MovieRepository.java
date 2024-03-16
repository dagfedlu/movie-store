package com.movies.backend.repositories;

// import org.hibernate.mapping.List;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.backend.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContaining(String title);
    // inside here we have to find a way to get the AVG(select rating.score from rating where movieId = {id from url})
}
