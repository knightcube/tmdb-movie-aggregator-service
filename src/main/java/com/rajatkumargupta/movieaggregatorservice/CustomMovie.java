package com.rajatkumargupta.movieaggregatorservice;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "movies")
public class CustomMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @Column(name = "image_path")
    private String imagePath;
}
