package Number7;

public class LuxRoom extends Room {
    private int minRentalPeriod;
    private int maxRentalPeriod;

    public LuxRoom(int id, String roomNumber, int numberOfPeople, double price, int minRentalPeriod, int maxRentalPeriod) {
        super(id, roomNumber, numberOfPeople, price);
        this.minRentalPeriod = minRentalPeriod;
        this.maxRentalPeriod = maxRentalPeriod;
    }

    @Override
    public String toString() {
        return "Комната люкс: " + super.toString() + ", Мин. срок сдачи: " + minRentalPeriod + ", Макс. срок сдачи: " + maxRentalPeriod;
    }
}
