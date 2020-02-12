import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
   private Hotel hotel;
   private Bedroom bedroom;
   private ConferenceRoom conferenceRoom;
   private Guest guest;

   @Before
    public void before(){
       hotel = new Hotel("CodeClan Towers");
       bedroom = new Bedroom(5, 4,"double", 100);
       conferenceRoom = new ConferenceRoom(5, "Stephen Ramsay Suite");
       guest = new Guest("Luca Sanz");
   }
   @Test
    public void can_add_bedroom(){
       this.hotel.addBedroom(bedroom);
       assertEquals(1, hotel.bedroomCount());
   }
   @Test
    public void can_add_conference_room(){
       this.hotel.addConferenceRoom(conferenceRoom);
       assertEquals(1, hotel.conferenceRoomCount());
   }
   @Test
    public void can_check_in_guest_to_bedroom(){
       this.hotel.addBedroom(bedroom);
       int roomNumber = bedroom.getRoomNumber();
       this.hotel.checkInGuest(guest, roomNumber);
       assertEquals(1, bedroom.guestCount() );
   }
   @Test
   public void can_check_in_guest_to_conference_room(){
       this.hotel.addConferenceRoom(conferenceRoom);
       String conferenceRoomName = conferenceRoom.getName();
       this.hotel.checkInGuestToConferenceRoom(guest, conferenceRoomName);
       assertEquals(1, conferenceRoom.guestCount());
   }

    @Test
    public void can_check_guest_out_of_bedroom(){
        this.hotel.addBedroom(bedroom);
        int roomNumber = bedroom.getRoomNumber();
        this.hotel.checkInGuest(guest, roomNumber);
        this.hotel.checkoutGuest(guest, roomNumber);
        assertEquals(0, bedroom.guestCount() );
   }

   @Test
    public void can_check_guest_out_of_conference_room(){
       this.hotel.addConferenceRoom(conferenceRoom);
       String conferenceRoomName = conferenceRoom.getName();
       this.hotel.checkInGuestToConferenceRoom(guest, conferenceRoomName);
       this.hotel.checkOutGuestFromConferenceRoom(guest, conferenceRoomName);
       assertEquals(0, conferenceRoom.guestCount());
   }

   @Test
    public void can_create_booking(){
       hotel.createBooking(bedroom, 5);
       assertEquals(1, this.hotel.bookingsCount());
   }

   @Test
    public void can_get_total_bill(){
       Booking booking = hotel.createBooking(bedroom, 5);
       assertEquals(500, booking.totalBill());
   }
}
