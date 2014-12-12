package logic.room;

import java.util.ArrayList;

/**
 * This class implements the multiplex as a "building".
 * It consist of a structure with Room objects that define the avaliable rooms for theatricals or movies.
 * @author gramanas
 */
public class Multiplex {
    ArrayList<Room> rooms;

    /**
     * Constructs an empty multiplex object and initializes the
     * structure that the Room objects will be stored.
     */
    public Multiplex(){
        rooms = new ArrayList<>();
    }

    /**
     * Adds a room in the structure.
     * @param room Room to be added.
     */
    public void addRoom(Room room){
        rooms.add(room);
    }

    /**
     * Deletes a room with the given name.
     * @param name Name of the room to be deleted.
     */
    public void deleteRoom(String name){
        for (Room room : rooms){
            if (room.getName().equals(name)){
                rooms.remove(room);
                return;
            }
        }
        System.err.println("Could not remove room, name does not exist.");
    }

    /**
     * Searches the room with the given name and then presents it to the admin
     * so he can change whatever he wants from it.
     * @param name Name of the room to be changed.
     * @return The room to be changed.
     */
    public Room changeRoom(String name){
        for (Room room : rooms){
            if (room.getName().equals(name)){
                return room;
            }
        }
        System.err.println("Could not find room, name does not exist.");
        return null;
    }
}
