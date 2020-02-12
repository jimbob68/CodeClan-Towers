import org.junit.Before;

public class BookingTest {

    private Bedroom bedroom;
    private Booking booking;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 5, "double",100);
        booking = new Booking(bedroom, 5);
    }

}
