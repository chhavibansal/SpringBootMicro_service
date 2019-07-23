package com.micro.Controller;

import com.micro.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ratingsdata")
public class RatingResources {

    @RequestMapping(path = "/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return  new Rating(movieId , 4);
    }
}
