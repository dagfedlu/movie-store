package com.movies.backend.repositories;

// import java.util.Optional;

// import java.util.List;
// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.backend.models.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}
