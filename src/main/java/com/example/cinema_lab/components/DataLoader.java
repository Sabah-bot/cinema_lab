package com.example.cinema_lab.components;

import com.example.cinema_lab.models.Movie;
import com.example.cinema_lab.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final MovieService movieService;

    @Autowired
    public DataLoader(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void run(String... args) throws Exception {
        seedDatabase();
    }

    private void seedDatabase() {
        // Seed the database with some initial movie objects
        Movie movie1 = new Movie("Challengers", "18", 2020);
        Movie movie2 = new Movie("Spiderman 2", "12", 2021);
        Movie movie3 = new Movie("Spiderman", "12", 2022);

        movieService.addMovie(movie1);
        movieService.addMovie(movie2);
        movieService.addMovie(movie3);
    }
}
