package Number8;

public class Room {
    private int id;
    private String roomNumber;
    private int numberOfPeople;
    private double price;

    public Room(int id, String roomNumber, int numberOfPeople, double price) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.numberOfPeople = numberOfPeople;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Номер: %s, Количество человек: %d, Цена: %.2f",
                id, roomNumber, numberOfPeople, price);
    }

    public String toFileString() {
        return String.format("%d,%s,%d,%.2f", id, roomNumber, numberOfPeople, price);
    }

    public static Room fromFileString(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[0]);
        String roomNumber = parts[1];
        int numberOfPeople = Integer.parseInt(parts[2]);
        double price = Double.parseDouble(parts[3]);
        return new Room(id, roomNumber, numberOfPeople, price);
    }
}