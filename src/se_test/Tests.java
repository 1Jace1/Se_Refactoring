package se_test;

public class Tests {
	import se_refactoring.Customer;
	import se_refactoring.Movie;
	import se_refactoring.Rental;
	import se_refactoring.PriceCode;
	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.Test;

	public class Testing {

	    Movie movie1;
	    Movie movie2;
	    Customer customer;

	    @Before
	    public void setup() {
	        movie1 = new Movie("firstMovie", PriceCode.NEW);
	        movie2 = new Movie("secondMovie", PriceCode.REGULAR);

	        customer = new Customer("Anrold Schwarzenegger");
	        customer.addRental(new Rental(movie1, 5));
	        customer.addRental(new Rental(movie2, 2));
	    }
	    public void testCharge(){
	        Assert.assertEquals(1.5, movie2.getCost(2),0);
	    }

	    @Test
	    public void testTitle(){
	        Assert.assertEquals( "movie1", movie2.getTitle());
	    }
	    @Test
	    public void testMovieEquals(){
	        Assert.assertFalse(movie1.equals(movie2));
	    }
	    @Test
	    public void testCustomerEquals(){
	        Assert.assertFalse(customer.equals(new Customer("Anrold Schwarzenegger")));
	    }
	    @Test
	    public void testStatement() {
	        String statement = customer.statement();
	        Assert.assertNotNull(statement);
	    }
}
