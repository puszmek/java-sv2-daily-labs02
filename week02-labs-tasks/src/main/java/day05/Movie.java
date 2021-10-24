package day05;

public class Movie {

    private String title;
    private int yearOfProduction;

    private double averageRating;
    private int sumOfRatings;
    private int sumOfVoters;

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }

    public double rateMovie(int rating) {
        sumOfRatings += rating;
        sumOfVoters += 1;
        averageRating = (double)sumOfRatings/sumOfVoters;
        return averageRating;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getAverageRating() {
        return averageRating;
    }
}
