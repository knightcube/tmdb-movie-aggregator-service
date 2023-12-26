package com.rajatkumargupta.movieaggregatorservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@ToString
public class MovieResponse {
    private int page;
    private List<Movie> results;
}
