package Number8;

public class SemiLuxRoom extends Room {
    public SemiLuxRoom(int id, String roomNumber, int numberOfPeople, double price) {
        super(id, roomNumber, numberOfPeople, price);
    }

    @Override
    public String toString() {
        return "Комната полулюкс: " + super.toString();
    }

    @Override
    public String toFileString() {
        return "Комната полулюкс," + super.toFileString();
    }

    public static SemiLuxRoom fromFileString(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[1]);
        String roomNumber = parts[2];
        int numberOfPeople = Integer.parseInt(parts[3]);
        double price = Double.parseDouble(parts[4]);
        return new SemiLuxRoom(id, roomNumber, numberOfPeople, price);
    }
}
