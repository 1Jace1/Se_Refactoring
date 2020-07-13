package se_refactoring;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Rental Record for %s%n", this.getName()));
        result.append("\tTitle\t\tDays\tAmount\n");
        for (Rental current : rentals) {
            //show figures for this rental
            result.append(String.format("\t%s\t\t%d\t%s%n", current.getMovie().getTitle(), current.getDaysRented(), current.getCost()));
        }
        //add footer lines
        result.append(String.format("Amount owed is %s%n", getTotalCost()));
        result.append(String.format("You earned %d frequent renter points", getTotalPoints()));
        return result.toString();
    }

    private int getTotalPoints() {
        return rentals.stream().mapToInt(Rental::getPoints).sum();
    }

    private double getTotalCost() {
        return rentals.stream().mapToDouble(Rental::getCost).sum();
    }

}
