package logic.program;

import logic.room.Cine;
import logic.room.Room;
import logic.room.Theatre;

import java.util.ArrayList;

/**
 * This is a wrapper class to pack the rooms in a nice way for them to be printed later.
 * @author gramanas
 * @see logic.program.PTMD
 * @see logic.program.PTTD
 * @see logic.program.PTSD
 */
public class Day {
    private enum Days {
        SUNDAY, MONDAY, TUESDAY, WETNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    private ArrayList<Cine> movieTheatres;
    private ArrayList<Theatre> theatres;
    private Days day;

    /**
     * Constructor. Init the arrays.
     */
    public Day(){
        movieTheatres = new ArrayList<>();
        theatres = new ArrayList<>();
    }

    /**
     * Sets the day to the chosen value.
     * @param day The day to be set.
     */
    public void setDay(Days day) {
        this.day = day;
    }

    /**
     * Adds a copy of a room in the structure.
     * @param room Room to be added.
     */
    public void addRoom(Room room){
        if (room instanceof Cine){
            Cine tmp = new Cine((Cine) room);
            movieTheatres.add(tmp);
        }else{
            Theatre tmp = new Theatre((Theatre) room);
            theatres.add(tmp);
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
}