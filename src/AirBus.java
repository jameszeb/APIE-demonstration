public class AirBus extends Airplane {
    private String passengerSeats;

    public AirBus(int weight, String length, String passengerSeats) {
        super(weight, length);
        this.passengerSeats = passengerSeats;
    }

    public AirBus(String passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public String getPassengerSeats() {
        return passengerSeats;
    }
}
