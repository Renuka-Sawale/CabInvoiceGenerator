import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldRetunTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        System.out.println("The total fare is " + fare);
        Assertions.assertEquals(25, fare, 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldRetunTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = { new Ride(2.0, 5),
                new Ride(0.1, 1)};
        double fare = invoiceGenerator.calculateFare(rides);
        System.out.println("The total fare is " + fare);
        Assertions.assertEquals(27, fare, 0.0);
    }
}
