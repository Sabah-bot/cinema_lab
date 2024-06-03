package com.example.cinema_lab.services;

import com.example.cinema_lab.models.Movie;
import com.example.cinema_lab.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public String addNewMovie(Movie movie) {
        movieRepository.save(movie);
        return "Movie added successfully!";
    }


    public void deleteAllMovies() {
        movieRepository.deleteAll();
    }


    public void addMovie(Movie movie1) {

    }
}