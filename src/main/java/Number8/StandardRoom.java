package Number8;

public class StandardRoom extends Room {
    public StandardRoom(int id, String roomNumber, int numberOfPeople, double price) {
        super(id, roomNumber, numberOfPeople, price);
    }

    @Override
    public String toString() {
        return "Стандартная комната: " + super.toString();
    }

    @Override
    public String toFileString() {
        return "Стандартная комната," + super.toFileString();
    }

    public static StandardRoom fromFileString(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[1]);
        String roomNumber = parts[2];
        int numberOfPeople = Integer.parseInt(parts[3]);
        double price = Double.parseDouble(parts[4]);
        return new StandardRoom(id, roomNumber, numberOfPeople, price);
    }
}
