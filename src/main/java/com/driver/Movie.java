package com.driver;

public class Movie {
    private String name;
    private int durationInminutes;
    private double ratings;

    public Movie(String name, int durationInminutes, double ratings) {
        this.name = name;
        this.durationInminutes = durationInminutes;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInminutes() {
        return durationInminutes;
    }

    public void setDurationInminutes(int durationInminutes) {
        this.durationInminutes = durationInminutes;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
