package se_refactoring;

public class Movie {
	private final String title;
    private PriceCode price;

    public Movie(String title, PriceCode priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public PriceCode getPriceCode() {
        return price;
    }

    public void setPriceCode(PriceCode code) {
        this.price = code;
    }

    public String getTitle() {
        return title;
    }

    public double getCost(int daysRented) {
        return price.getCost(daysRented);
    }

    public int getPoints(int daysRented) {
        return price.getPoints(daysRented);
    }
}
