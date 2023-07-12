//2) The class Movie is started below. An instance of class Movie represents a film. This
//class
//has the following three class variables:
//● title, which is a String representing the title of the movie
//● studio, which is a String representing the studio that made the movie
//● rating, which is a String representing the rating of the movie (i.e. PG13,
//R, etc)
//public class Movie {
//private String title;
//private String studio;
//private String rating;
//// your code goes here
//}
//a) Write a constructor for the class Movie, which takes a String representing the title
//of the movie, a String representing the studio, and a String representing the rating
//as its
//arguments, and sets the respective class variables to these values.
//b) Write a second constructor for the class Movie, which takes a String representing
//the title
//of the movie and a String representing the studio as its arguments, and sets the
//respective class variables to these values, while the class variable rating is set to
//"PG".
//c) Write a method getPG, which takes an array of base type Movie as its argument,
//and
//returns a new array of only those movies in the input array with a rating of "PG". You
//may
//assume the input array is full of Movie instances. The returned array need not be full.
//d) Write a piece of code that creates an instance of the class Movie with the title
//“Casino
//Royale”, the studio “Eon Productions”, and the rating “PG13”.

public class Task3 {
    public static void main(String[] args) {

        Movie movie1=new Movie("Casino Royale","Eon Productions","PG13");
        Movie movie2=new Movie(" tito","Eon Productions","PG");
        Movie movie3=new Movie("ابن الحاج احمد ","Eon Productions");
        Movie movie4=new Movie("اللعبة","Eon Productions");
        Movie movie5=new Movie("بوحة","Eon Productions","R");

        Movie[] movies={movie1,movie2,movie3,movie4,movie5};

        Movie.getPG(movies);



    }
}
