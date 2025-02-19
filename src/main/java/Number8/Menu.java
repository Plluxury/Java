package Number8;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить стандартную комнату");
            System.out.println("2. Добавить комнату полулюкс");
            System.out.println("3. Добавить комнату люкс");
            System.out.println("4. Вывести список номеров");
            System.out.println("5. Сортировать номера по количеству мест");
            System.out.println("6. Сортировать номера по цене");
            System.out.println("7. Сохранить данные в файл");
            System.out.println("8. Загрузить данные из файла");
            System.out.println("0. Выход");
            System.out.print("Выберите опцию: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите ID: ");
                    int id1 = scanner.nextInt();
                    System.out.print("Введите номер комнаты: ");
                    String roomNumber1 = scanner.next();
                    System.out.print("Введите количество человек: ");
                    int numberOfPeople1 = scanner.nextInt();
                    System.out.print("Введите цену: ");
                    double price1 = scanner.nextDouble();
                    hotel.addRoom(new StandardRoom(id1, roomNumber1, numberOfPeople1, price1));
                    break;
                case 2:
                    System.out.print("Введите ID: ");
                    int id2 = scanner.nextInt();
                    System.out.print("Введите номер комнаты: ");
                    String roomNumber2 = scanner.next();
                    System.out.print("Введите количество человек: ");
                    int numberOfPeople2 = scanner.nextInt();
                    System.out.print("Введите цену: ");
                    double price2 = scanner.nextDouble();
                    hotel.addRoom(new SemiLuxRoom(id2, roomNumber2, numberOfPeople2, price2));
                    break;
                case 3:
                    System.out.print("Введите ID: ");
                    int id3 = scanner.nextInt();
                    System.out.print("Введите номер комнаты: ");
                    String roomNumber3 = scanner.next();
                    System.out.print("Введите количество человек: ");
                    int numberOfPeople3 = scanner.nextInt();
                    System.out.print("Введите цену: ");
                    double price3 = scanner.nextDouble();
                    System.out.print("Введите минимальный срок сдачи: ");
                    int minRentalPeriod = scanner.nextInt();
                    System.out.print("Введите максимальный срок сдачи: ");
                    int maxRentalPeriod = scanner.nextInt();
                    hotel.addRoom(new LuxRoom(id3, roomNumber3, numberOfPeople3, price3, minRentalPeriod, maxRentalPeriod));
                    break;
                case 4:
                    hotel.printRooms();
                    break;
                case 5:
                    hotel.sortRoomsByNoP();
                    System.out.println("Номера отсортированы по количеству мест.");
                    break;
                case 6:
                    hotel.sortRoomsByPrice();
                    System.out.println("Номера отсортированы по цене.");
                    break;
                case 7:
                    System.out.print("Введите имя файла для сохранения: ");
                    String saveFilename = scanner.next();
                    hotel.saveToFile(saveFilename);
                    break;
                case 8:
                    System.out.print("Введите имя файла для загрузки: ");
                    String loadFilename = scanner.next();
                    hotel.loadFromFile(loadFilename);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
