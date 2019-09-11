package com.sop_hw1.sop_hw1;

import java.util.ArrayList;
import java.util.List;

public class MovieShop {
    public static List<Movie> movies = new ArrayList<>();

    static {
        movies.add(MovieFactory.create("001", "The Shawshank Redemption", 9.3, "Drama"));
        movies.add(MovieFactory.create("002", "The Godfather", 9.2, "Crime, Drama"));
        movies.add(MovieFactory.create("003", "The Godfather: Part II", 9.0, "Crime, Drama"));
        movies.add(MovieFactory.create("004", "The Dark Knight", 9.0, "Action, Crime, Drama"));
        movies.add(MovieFactory.create("005", "12 Angry Men", 8.9, "Drama"));

    }

    public List<Movie> listMovie() {
        return movies;
    }

    public Movie getOne(String id) {
        for (Movie movie : movies) {
            if(movie.getId().equalsIgnoreCase(id)) {
                return movie;
            }
        }
        return null;
    }

}
