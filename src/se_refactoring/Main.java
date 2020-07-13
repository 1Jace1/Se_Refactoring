package se_refactoring;

public class Main {

	public static void main(String[] args) {
		
		String result;
        System.out.println("Movie Store");
        Movie m1 = new Movie("firstMovie", PriceCode.NEW);
        Movie m2 = new Movie("secondMovie", PriceCode.REGULAR);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);   
        c1.addRental(r2);
        System.out.println("Let's get the Statement");
        result = c1.statement();
        System.out.println(result);

	}

}
