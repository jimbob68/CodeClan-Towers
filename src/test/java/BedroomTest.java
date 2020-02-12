import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "double", 100);
        guest = new Guest("Stephen");
    }
    @Test
    public void room_starts_empty(){
        assertEquals(0, bedroom.guestCount());
    }
    @Test
    public void can_add_guest_to_room(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }
    @Test
    public void cant_add_guest_if_room_is_full(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.guestCount());
    }
    @Test
    public void can_get_bedroom_type(){
        assertEquals("double", this.bedroom.getTypeOfRoom());
    }
    @Test
    public void can_remove_guest_from_room(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.guestCount());
    }
}
