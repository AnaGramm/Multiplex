package logic.room;

import java.util.ArrayList;

/**
 * This class implements the multiplex as a "building".
 * It consist of a structure with Room objects that define the avaliable rooms for theatricals or movies.
 * @author gramanas
 */
public class Multiplex {
    ArrayList<Cine> movieTheatres;
    ArrayList<Theatre> theatres;

    /**
     * Constructs an empty multiplex object and initializes the
     * structure that the Room objects will be stored.
     */
    public Multiplex(){
        movieTheatres = new ArrayList<>();
        theatres = new ArrayList<>();
    }

    /**
     * Adds a room in the structure.
     * @param room Room to be added.
     */
    public void addRoom(Room room){
        if (room instanceof Cine){
            movieTheatres.add((Cine) room);
        }else{
            theatres.add((Theatre) room);
        }
    }

    /**
     * Deletes a room with the given name.
     * @param name Name of the room to be deleted.
     */
    public boolean deleteRoom(String name){
        for (Cine movieTheatre : movieTheatres) {
            if(movieTheatre.getName().equals(name)){
                movieTheatres.remove(movieTheatre);
                return true;
            }
        }
        for (Theatre theatre : theatres) {
            if(theatre.getName().equals(name)){
                theatres.remove(theatre);
                return true;
            }
        }
        System.err.println("Could not remove room, name does not exist.");
        return false;
    }

    /**
     * Searches the room with the given name and then presents it to the admin
     * so he can change whatever he wants from it.
     * @param name Name of the room to be changed.
     * @return The room to be changed.
     */
    public Room changeRoom(String name){
        for (Cine movieTheatre : movieTheatres) {
            if(movieTheatre.getName().equals(name)){
                return movieTheatre;
            }
        }
        for (Theatre theatre : theatres) {
            if(theatre.getName().equals(name)){
                return theatre;
            }
        }
        System.err.println("Could not find room, name does not exist.");
        return null;
    }

    /**
     * Scans the rooms list and retruns a list with the names of the rooms.
     * @return
     */
    public ArrayList<String> movieTheatresToList(){
        ArrayList<String> temp = new ArrayList<>();
        for (Cine movieTheatre : movieTheatres) {
            temp.add(movieTheatre.getName());
        }
        for (Theatre theatre : theatres) {
            temp.add(theatre.getName());
        }
        return temp;
    }
}
