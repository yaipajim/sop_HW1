package com.sop_hw1.sop_hw1;

import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MovieShop {
    public static List<Movie> movies = new ArrayList<>();
    static {
        movies.add(MovieFactory.create("001", "The Shawshank Redemption", 9.3, "Drama"));
        movies.add(MovieFactory.create("002", "The Godfather", 9.2, "Crime, Drama"));
        movies.add(MovieFactory.create("003", "The Godfather: Part II", 9.0, "Crime, Drama"));
        movies.add(MovieFactory.create("004", "The Dark Knight", 9.0, "Action, Crime, Drama"));
        movies.add(MovieFactory.create("005", "12 Angry Men", 8.9, "Drama"));
    }
    static String num;

    Movie movie = MovieFactory.getInstance().getMovie("Drama");
    public MovieShop() {
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
    public static void fileWriter() {
        try {
            FileWriter w = new FileWriter("data.txt");
            w.write(num);
            w.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void fileReader() {
        try {
            FileReader r = new FileReader("data.txt");
            int data;
            while((data = r.read()) != -1) {
                System.out.printf("%c\n", data);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
