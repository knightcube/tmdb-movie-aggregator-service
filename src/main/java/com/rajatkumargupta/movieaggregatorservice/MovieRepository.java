package com.rajatkumargupta.movieaggregatorservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<CustomMovie, Long> {
}
