package com.example.movieapi.repository;

import com.example.movieapi.dto.MovieResponse;
import com.example.movieapi.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovieRepository extends MongoRepository<Movie,String> {
    List<MovieResponse>findByImdbId(String id);
}
