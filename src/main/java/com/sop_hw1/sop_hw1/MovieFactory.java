package com.sop_hw1.sop_hw1;

public class MovieFactory {
    public static Movie create(String id, String title, double price, String genre) {

        return new Movie(id, title, price, genre);
    }
}
