package com.micro.Controller;

import com.micro.model.Movie;
import com.micro.model.Rating;
import com.micro.model.catalogItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/catalog")
public class MovieCatalogResources {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<catalogItem> getCatalog(@PathVariable("userId") String userId){

//        Movie movie = restTemplate.getForObject("http://localhost:8082/movies/foo", Movie.class);


        //  get all movie id
        List<Rating>  ratings =Arrays.asList(
            new Rating("1224",4),
            new Rating("45435", 3)
        );
        //for each loop
        return ratings.stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
            return new catalogItem(movie.getName(),"Desc", rating.getRating());
        })
        .collect(Collectors.toList());

    }
}
