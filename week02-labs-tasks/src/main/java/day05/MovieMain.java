package day05;

public class MovieMain {

    public static void main(String[] args) {

        Movie movie = new Movie("The Intouchables", 2011);

        System.out.println(movie.rateMovie(4));
        System.out.println(movie.rateMovie(5));
        System.out.println(movie.rateMovie(5));

        Viewer viewer = new Viewer();
        viewer.watchMovie(movie, 4);

        System.out.println(movie.getAverageRating());
    }
}
