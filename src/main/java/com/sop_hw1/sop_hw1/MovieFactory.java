package com.sop_hw1.sop_hw1;


public class MovieFactory {

    private static MovieFactory movies = new MovieFactory();

    public static Movie create(String id, String title, double price, String genre) {

        return new Movie(id, title, price, genre);
    }

    public static MovieFactory getInstance(){
        return movies;
    }
    public static Movie getMovie(String genre){
        if(genre == null){
            return null;
        }
        if(genre.equalsIgnoreCase("Drama")){
            return new Movie("001", "The Shawshank Redemption", 9.3, "Drama");
        }
        if(genre.equalsIgnoreCase("Drama")){
            return new Movie("005", "12 Angry Men", 8.9, "Drama");
        }
        else if(genre.equalsIgnoreCase("Action, Crime, Drama")){
            return new Movie("004", "The Dark Knight", 9.0, "Action, Crime, Drama");
        }
        return null;
    }
}
