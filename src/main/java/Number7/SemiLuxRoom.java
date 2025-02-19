package Number7;

public class SemiLuxRoom extends Room {
    public SemiLuxRoom(int id, String roomNumber, int numberOfPeople, double price) {
        super(id, roomNumber, numberOfPeople, price);
    }

    @Override
    public String toString() {
        return "Комната полулюкс: " + super.toString();
    }
}
