package se_refactoring;

public class Rental {
	private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getPoints() {
        return getMovie().getPoints(getDaysRented());
    }

    public double getCost() {
        return getMovie().getCost(getDaysRented());
    }
}
