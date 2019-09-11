package com.sop_hw1.sop_hw1;

public class MovieSingleton {
    private static MovieSingleton instance;
    private String id;
    private String title;
    private double price;
    private String genre;


    private MovieSingleton() {

    }

    public static MovieSingleton getInstance() {
        if (instance == null) {
            instance = new MovieSingleton();
        }
        return instance;
    }
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public String getGenre() {
        return genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }
}
