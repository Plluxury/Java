package Number7;

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
}
