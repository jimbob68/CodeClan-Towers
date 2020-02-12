import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String typeOfRoom;
    private int nightlyRate;

    public Bedroom(int roomNumber, int capacity, String typeOfRoom, int nightlyRate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.typeOfRoom = typeOfRoom;
        this.guests = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if ( this.hasSpaceForGuest() ) {
            this.guests.add(guest);
        }
    }

    public boolean hasSpaceForGuest(){
        return this.capacity > this.guestCount();
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public int getNightlyRate() {
        return nightlyRate;
    }
}
