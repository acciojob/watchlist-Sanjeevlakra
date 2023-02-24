package com.driver;

public class Director {
    private String name;
    private int numberOfMovies;
    private double imdbRatings;

    public Director(String name, int numberOfMovies, double ratings) {
        this.name = name;
        this.numberOfMovies = numberOfMovies;
        this.imdbRatings = imdbRatings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public double getRatings() {
        return imdbRatings;
    }

    public void setRatings(double ratings) {
        this.imdbRatings = imdbRatings;
    }
}
