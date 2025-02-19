package Number6;

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
}