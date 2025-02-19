package Number8;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void printRooms() {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    public void sortRoomsByNoP() {
        Collections.sort(rooms, Comparator.comparingInt(Room::getNumberOfPeople));
    }

    public void sortRoomsByPrice() {
        Collections.sort(rooms, Comparator.comparingDouble(Room::getPrice));
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Room room : rooms) {
                writer.write(room.toFileString());
                writer.newLine();
            }
            System.out.println("Данные успешно сохранены в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        rooms.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                switch (parts[0]) {
                    case "Standard":
                        rooms.add(StandardRoom.fromFileString(line));
                        break;
                    case "SemiLux":
                        rooms.add(SemiLuxRoom.fromFileString(line));
                        break;
                    case "Lux":
                        rooms.add(LuxRoom.fromFileString(line));
                        break;
                }
            }
            System.out.println("Данные успешно загружены из файла.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
