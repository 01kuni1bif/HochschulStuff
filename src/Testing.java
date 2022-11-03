
import jdk.jfr.StackTrace;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;


public class Testing {

    Customer customer1;

    Movie movie1;

    Rental rental1;
    @BeforeEach
    public void initEach() {
        movie1 = new Movie("Der Herr der Ringe", 2);
        rental1 = new Rental(movie1, 14);
        customer1 = new Customer("Niklas Kurzenberger");
        customer1.addRental(rental1);
    }
    @Test
    void statementTest(){
        assertEquals(2,movie1.getPriceCode());
        assertEquals("Der Herr der Ringe",movie1.getTitle());
        assertEquals(14, rental1.getDaysRented());
        assertEquals("Niklas Kurzenberger",customer1.getName());

    }
}
