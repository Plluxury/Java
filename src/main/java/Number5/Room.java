package Number5;

public class Room { // Number5
    // Свойства класса
    private int id; // Идентификатор
    private String codeNumbers; // Код номера
    private int numberPeople; // Количество человек
    private String comfortType; // Комфортность
    private double price; // Цена

    // Конструктор
    public Room(int id, String codeNumbers, int numberPeople, String comfortType, double price) {
        this.id = id;
        this.codeNumbers = codeNumbers;
        this.numberPeople = numberPeople;
        this.comfortType = comfortType;
        this.price = price;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeNumbers() {
        return codeNumbers;
    }

    public void setCodeNumbers(String codeNumbers) {
        this.codeNumbers = codeNumbers;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getComfortType() {
        return comfortType;
    }

    public void setComfortType(String comfortType) {
        this.comfortType = comfortType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Переопределение метода toString() для вывода информации об объекте
    @Override
    public String toString() {
        return String.format(
                "Номер комнаты: %d\nКод номера: %s\nКоличество человек: %d\nКомфортность: %s\nЦена: %.2f\n",
                id, codeNumbers, numberPeople, comfortType, price
        );
    }

    // Пример использования
    public static void main(String[] args) {
        // Создаем объект класса Number5.Room
        Room room = new Room(1, "A101", 2, "Стандарт", 2500.50);

        // Выводим информацию о комнате
        System.out.println(room);
    }
}