package com.sop_hw1.sop_hw1;

public class Movie {

    private String id;
    private String title;
    private double price;
    private String genre;


    public Movie(String id, String title, double price, String genre) {
        super();
        this.id = id;
        this.title = title;
        this.price = price;
        this.genre = genre;

    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        id = id;
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



    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", price=" + price + ", genre=" + genre + "]";
    }


}