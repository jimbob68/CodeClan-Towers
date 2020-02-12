import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(String name){
        this.name = name;
        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();
        bookings = new ArrayList<Booking>();
    }

    public int bookingsCount() {
        return this.bookings.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int bedroomCount() {
         return this.bedrooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuest(Guest guest, int roomNumber) {
        Bedroom bedroom = this.getBedroomFromBedroomNumber(roomNumber);
        System.out.println(bedroom);
        bedroom.addGuest(guest);
    }

    public Bedroom getBedroomFromBedroomNumber(int roomNumber) {

        for (Bedroom bedroom : this.bedrooms){
            if ( bedroom.getRoomNumber() == roomNumber ){
                return bedroom;
            }
        }
        return null;
    }

    public void checkoutGuest(Guest guest, int roomNumber) {
        Bedroom bedroom = getBedroomFromBedroomNumber(roomNumber);
        bedroom.removeGuest(guest);
    }

    public void checkInGuestToConferenceRoom(Guest guest, String conferenceRoomName) {
        ConferenceRoom conferenceRoom = this.getConferenceRoomFromConferenceRoomName(conferenceRoomName);
        conferenceRoom.addGuest(guest);
    }

    public ConferenceRoom getConferenceRoomFromConferenceRoomName(String conferenceRoomName) {

        for ( ConferenceRoom conferenceRoom : this.conferenceRooms ){
            if ( conferenceRoom.getName() == conferenceRoomName ){
                return conferenceRoom;
            }
        }
        return null;
    }

    public void checkOutGuestFromConferenceRoom(Guest guest, String conferenceRoomName) {
        ConferenceRoom conferenceRoom = this.getConferenceRoomFromConferenceRoomName(conferenceRoomName);
        conferenceRoom.removeGuest(guest);
    }

    public Booking createBooking(Bedroom bedroom, int numberOfNights) {
        Booking booking = new Booking(bedroom, numberOfNights);
        this.bookings.add(booking);
        return booking;
    }
}
