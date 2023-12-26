package com.rajatkumargupta.movieaggregatorservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class Movie {
    private boolean adult;
    @JsonProperty("backdrop_path")
    private String backdropPath;
    private List<Integer> genreIds;
    private long id;
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private double popularity;

    @JsonProperty("poster_path")
    private String posterPath;
    private String releaseDate;
    private String title;
    private boolean video;
    private double voteAverage;
    private int voteCount;
}
