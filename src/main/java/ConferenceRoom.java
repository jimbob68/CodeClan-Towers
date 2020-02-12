import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.name = name;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if( this.hasSpaceForGuest() ){
            this.guests.add(guest);
        }
    }

    public boolean hasSpaceForGuest(){
        return this.capacity > this.guestCount();
    }
    public void removeGuest(Guest guest){
        this.guests.remove(guest);

    }

    public String getName() {
        return name;
    }
}