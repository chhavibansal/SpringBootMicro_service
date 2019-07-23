package com.micro.Controller;

import com.micro.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/movies")
public class MovieResources {
    @RequestMapping("/{movieId}")
    public Movie getMovieId(@PathVariable("movieId")String movieId){
        return new Movie(movieId, "test name");
    }
}
