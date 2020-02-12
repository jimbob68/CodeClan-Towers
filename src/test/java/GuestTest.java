import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before(){
       guest = new Guest("Stephen");
    }
    @Test
    public void guestHasName(){
        assertEquals("Stephen", guest.getName());
    }
}
