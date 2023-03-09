package com.blz.movietheatre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MovieTheater {
    private ArrayList<Movie> movies;
    private int numMovies;


    public MovieTheater(){
        movies = new ArrayList<Movie>();
        numMovies=0;
    }
    public ArrayList<Movie> getMovies(){
        return movies;
    }
    public void addMovie(Movie movie){
        movies.add(movie);
        numMovies++;
    }
    public void removeMovie(Movie movie){
        movies.remove(movie);
        numMovies--;
    }
    public Movie searchMovie(String title){
        for (Movie movie : movies){
            if(movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }
    public void sortMoviesByRatingAscending(){
        Collections.sort(movies, new Comparator<Movie>(){
            @Override
            public int compare(Movie m1, Movie m2){
                if(m1.getRating() < m2.getRating()) {
                    return -1;
                }
                else if(m1.getRating() > m2.getRating()) {
                    return 1;
                }else {
                    return 0;
                }

            }
        });
    }
    public void sortMoviesByRatingDescending(){
        Collections.sort(movies, new Comparator<Movie>(){
            public int compare(Movie m1, Movie m2){
                if(m1.getRating() < m2.getRating()) return 1;
                if(m1.getRating() > m2.getRating()) return -1;
                return 0;

            }
        });
    }
    public double getAverageRating(){
        double totalRating = 0;
        for (Movie movie : movies){
            totalRating += movie.getRating();
        }
        return totalRating/numMovies;
    }
}

