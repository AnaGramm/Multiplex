package logic.program;

import logic.show.Movie;
import logic.show.Show;
import logic.show.Theatrical;

import java.util.ArrayList;

//TODO CHANGE GREEN TEXT!

/**
 * This is a wrapper class to pack the rooms in a nice way for them to be printed later.
 * @author gramanas
 * @see logic.program.PTMD
 * @see logic.program.PTTD
 * @see logic.program.PTSD
 */
public class Day {
    private ArrayList<Show> shows;
    private Days day;

    /**
     * Constructor. Init the arrays.
     */
    public Day(){
        shows = new ArrayList<>();
    }

    /**
     * Sets the day to the chosen value.
     * @param day The day to be set.
     */
    public void setDay(Days day) {
        this.day = day;
    }

    /**
     * Adds a copy of a show in the structure.
     */
    public boolean addShow(Show show){
        if (show instanceof Movie){
            if (showExists(show)){
                return false;
            }else {
                Movie tmp = new Movie((Movie) show);
                shows.add(tmp);
            }
        }else{
            if (showExists(show)){
                return false;
            }else {
                Theatrical tmp = new Theatrical((Theatrical) show);
                shows.add(tmp);
            }
        }
        return true;
    }

    /**
     * Stuff
     * @param show
     * @return
     */
    private boolean showExists(Show show){
        for (Show show1 : shows) {
            if (show1.getName().equals(show.getName())){
                return true;
            }
        }
        return false;
    }

    /**
     * Deletes a show with the given name.
     * @param name Name of the show to be deleted.
     */
    public boolean deleteShow(String name){
        for (Show show : shows) {
            if(show.getName().equals(name)){
                shows.remove(show);
                return true;
            }
        }
        System.err.println("Could not remove show, name does not exist.");
        return false;
    }

    public ArrayList<Show> getShows() {
        return shows;
    }
}