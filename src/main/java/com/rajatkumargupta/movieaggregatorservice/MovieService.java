package com.rajatkumargupta.movieaggregatorservice;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Value("${tmdb.api.accessToken}")
    private String apiAccessToken;

    @PostConstruct
    public void fetchAndSaveMovies() {
        String url = "https://api.themoviedb.org/3/movie/popular?language=en-US&page=1";
        WebClient.Builder builder = WebClient.builder();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer "+apiAccessToken);
        headers.set("Content-Type", "application/json");

        MovieResponse movieResponse = builder
                .build()
                .get()
                .uri(url)
                .headers(httpHeaders -> httpHeaders.addAll(headers))
                .retrieve()
                .bodyToMono(MovieResponse.class)
                .block();

        System.out.println("-------------------------------");

        for (Movie movie : movieResponse.getResults()) {
            System.out.println("Movie Name = "+movie.getTitle());
            System.out.println("Movie Image = "+movie.getPosterPath());
            CustomMovie newMovie = new CustomMovie();
            newMovie.setTitle(movie.getTitle());
            newMovie.setImagePath(movie.getPosterPath());
            movieRepository.save(newMovie);
            System.out.println("Saved");
        }

        System.out.println("-------------------------------");

    }
}
