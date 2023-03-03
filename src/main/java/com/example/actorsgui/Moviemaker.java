package com.example.actorsgui;

import java.util.ArrayList;

public class Moviemaker {
    static ArrayList<Moviemaker> allmoviemakers = new ArrayList<>();

    String rank;
    String name;
    String average;
    String numberOfFilms;
    String worldwideTotal;

    public Moviemaker(String rank, String name, String average, String numberOfFilms, String worldwideTotal) {
        this.rank = rank;
        this.name = name;
        this.average = average;
        this.numberOfFilms = numberOfFilms;
        this.worldwideTotal = worldwideTotal;
        allmoviemakers.add(this);
    }

    public static ArrayList<Moviemaker> getAllmoviemakers() {
        return allmoviemakers;
    }

    public static void setAllmoviemakers(ArrayList<Moviemaker> allmoviemakers) {
        Moviemaker.allmoviemakers = allmoviemakers;
    }

    public String getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getAverage() {
        return average;
    }

    public String getNumberOfFilms() {
        return numberOfFilms;
    }

    public String getWorldwideTotal() {
        return worldwideTotal;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public void setNumberOfFilms(String numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public void setWorldwideTotal(String worldwideTotal) {
        this.worldwideTotal = worldwideTotal;
    }
    void describeSelf(){
        System.out.println("My name is" + name + ",my rank is" + rank + ",My average is"+ average + ",I am in" + numberOfFilms+"films" + ",My worldwide total is" + worldwideTotal);
    }
}
