package com.example.actorsgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Directors extends Moviemaker {

    // Fields
    private String HighestGrossingFilm;

    // Constructors


    public Directors(String rank, String name, String average, String numberOfFilms, String worldwideTotal, String highestGrossingFilm) {
        super(rank, name, average, numberOfFilms, worldwideTotal);
        HighestGrossingFilm = highestGrossingFilm;
    }

    public String getHighestGrossingFilm() {
        return HighestGrossingFilm;
    }
    public void setHighestGrossingFilm(String highestGrossingFilm) {
        HighestGrossingFilm = highestGrossingFilm;
    }
    // Methods
    public String toString() {
        return ("Hi! I'm ranked #" + rank + " in the world. My name is" + name + " and I've earned a total of " + worldwideTotal + ". I've made" + numberOfFilms + " films, and in those I average" + average + ".I'm most famous for directing " + HighestGrossingFilm + ".");

    }
    static void readAllData() {
    Scanner sc = null;
        try {
            File file = new File ("com/example/actorsgui/DirectorsData");
            sc = new Scanner(file);
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\t");
                String rank = lineScanner.next();
                String name = lineScanner.next();
                String worldwideTotal = lineScanner.next();
                String numberOfFilms = lineScanner.next();
                String average = lineScanner.next();
                String HighestGrossingFilm = lineScanner.next();
                new Directors (name, rank, HighestGrossingFilm, numberOfFilms, average, worldwideTotal);
            }
        }
        catch (FileNotFoundException e)
        {
                e.printStackTrace();
            }
            finally {
                if (sc != null) sc.close();
            }
        }
    }
