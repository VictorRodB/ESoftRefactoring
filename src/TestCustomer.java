package src;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCustomer{

    @Test
    public void testStatement(){
        Customer cust1 = new Customer("Customer Test");

        Movie movie1 = new Movie("Movie Test 1", 0);
        Movie movie2 = new Movie("Movie Test 2: It Returns", 1);
        Movie movie3 = new Movie("Movie Test 3: Begins", 2);

        Rental rent1 = new Rental(movie1, 3);
        Rental rent2 = new Rental(movie2, 4);
        Rental rent3 = new Rental(movie3, 5);

        cust1.addRental(rent1);
        cust1.addRental(rent2);
        cust1.addRental(rent3);

        assertEquals(cust1.statement(),"Rental Record for Customer Test\n" + 
        "	Movie Test 1	3.5\n" + 
        "	Movie Test 2: It Returns	12.0\n" + 
        "	Movie Test 3: Begins	4.5\n" + 
        "Amount owed is 20.0\n" + 
        "You earned 4 frequent renter points");
    }
}