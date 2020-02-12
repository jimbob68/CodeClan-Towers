import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(5, "Mike Ritchie Room");
        guest = new Guest("Matteo");
    }
    @Test
    public void room_starts_empty(){
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void can_add_guest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void cant_add_guest_if_room_is_full(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(5, conferenceRoom.guestCount());
    }
    @Test
    public void can_remove_guest_from_conference_room(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.guestCount());
    }


}
