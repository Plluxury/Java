package Number7;

public class StandardRoom extends Room {
    public StandardRoom(int id, String roomNumber, int numberOfPeople, double price) {
        super(id, roomNumber, numberOfPeople, price);
    }

    @Override
    public String toString() {
        return "Стандартная комната: " + super.toString();
    }
}
