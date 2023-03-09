package com.blz.movietheatre;

public class MovieController {
    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater();
        Movie movie1 = new Movie("KGF Chapter 1","Surya Murthi",9.0);
        Movie movie2 = new Movie("KGF Chapter 2","Kanhaiya Murthi",9.5);
        Movie movie3 = new Movie("KGF Chapter 3","Virat Murthi",9.6);
        theater.addMovie(movie1);
        theater.addMovie(movie2);
        theater.addMovie(movie3);
        Movie foundMovie = theater.searchMovie("KGF Chapter 2");
        if (foundMovie != null){
            System.out.println("Found Movie:" + foundMovie.getTitle());
        }else{
            System.out.println("Movie Not Found");
        }
        theater.removeMovie(movie1);
        theater.sortMoviesByRatingAscending();
        System.out.println("Movies Sorted By Rating (ascending):");
        for(Movie movie : theater.getMovies()){
            System.out.println(movie.getTitle() + "(" +movie.getRating() +")");
        }
        double avgRating = theater.getAverageRating();
        System.out.println("Average Rating Of All Movies:" + avgRating);
    }
}
