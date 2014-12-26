package logic.program;


import logic.room.Cine;
import logic.room.Room;
import logic.show.Movie;
import logic.show.Show;
import logic.show.Time;

import java.util.List;
import java.util.Map;

//TODO USE SETS INSTEAD OF ARRAY LISTS!!!!!!!!!!!!!!!!!!!!!!!!

/**
 * This class implements and manages the program of movies and theatricals in the multiplex.
 * It has an <tt>Array</tt> with the days of the week and in here takes place the search for
 * available rooms, days and times that the selected movie will be played. Also there are methods for adding or removing
 * movies and theatricals for the admin.
 * @author gramanas
 */
public class Program {
    private Day[] days;

    /**
     * Constructs an empty Program object.
     * Initializes the arrays with the days for movies and theatricals.
     */
    public Program() {
        days = new Day[7];
        for (int i = 0; i < 7; i++) {
            days[i] = new Day();
        }
    }

    public void addShow(Show show, String dei){
        Days day = Days.valueOf(dei);
        int d = day.ordinal();
        days[d].addShow(show);
    }
    
    public void addRoom(String showName, String dei, Room room){
        Days day = Days.valueOf(dei);
        int d = day.ordinal();
        if (room instanceof Cine){
            for (Movie movie : days[d].getMovies()) { //iter the shows of that day
                if (movie.getName().equals(showName)){ //see if there is a show with tha correct name
                    for (Room room1 : movie.getRooms()) { //iter the rooms of the given show
                        if (room1.getName().equals(room.getName())) { //see if there is a room with the same name
                            movie.addRoom(room);
                        }
                    }
                }
            }
        }
    }

    /**
     * For every day in the array of the days searches for rooms and theatres for the selected show,
     * and then using a private function prints it either in text or in a JLabel.
     *
     * @param show Search key.
     */
    public void searchMovie(Show show) {
        //TODO code
    }

    /**
     * Adds a show to the proper array.
     *
     * @param ptsd Place, Time, Show.
     */
    public void addShow(PTSD ptsd) {
        //TODO code
    }

    /**
     * Removes a show from the proper array
     *
     * @param ptsd The show to be removed.
     */
    public void removeShow(PTSD ptsd) {
        //TODO code
    }
}
