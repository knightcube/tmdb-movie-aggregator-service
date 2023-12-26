package com.rajatkumargupta.movieaggregatorservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MovieAggregatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieAggregatorServiceApplication.class, args);

	}

}
