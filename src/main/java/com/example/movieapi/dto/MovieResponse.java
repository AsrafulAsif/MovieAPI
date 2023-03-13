package com.example.movieapi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponse {
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
}
