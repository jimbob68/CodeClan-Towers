public class Booking {

    private  Bedroom bedroom;
    private int NumberOfNightsBooked;


    public Booking(Bedroom bedroom, int numberOfNightsBooked) {
        this.bedroom = bedroom;
        this.NumberOfNightsBooked = numberOfNightsBooked;
    }

    public int totalBill(){
        return this.NumberOfNightsBooked * this.bedroom.getNightlyRate() ;
    }
}
