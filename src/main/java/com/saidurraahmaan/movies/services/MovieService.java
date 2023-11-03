package com.saidurraahmaan.movies.services;


import com.saidurraahmaan.movies.models.Movie;
import com.saidurraahmaan.movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){

        return movieRepository.findAll();
    }
}
