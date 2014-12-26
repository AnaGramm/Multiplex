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
        for (Show show : days[d].getShows()) { //iter the shows of that day
            if (!show.getName().equals(showName)){ //see if there is a show with tha correct name
                for (Room room1 : show.getRooms()) { //iter the rooms of the given show
                    if (!room1.getName().equals(room.getName())) { //see if there is a room with the same name
                        show.addRoom(room);
                    }
                }
            }
        }
    }

    public void addTime(String showName, String dei, String roomName, Time time){
        Days day = Days.valueOf(dei);
        int d = day.ordinal();
        for (Show show : days[d].getShows()) { //iter the show array
            if (!show.getName().equals(showName)){ //see if there is a show with tha correct name
                for (Room room : show.getRooms()) { //iter the rooms of the given show
                    if (!room.getName().equals(roomName)) { //see if there is a room with the same name
                        for (Time time1 : room.getTime()) { //iter the time array
                            if (!time1.equals(time)){ //see if there is a show for this time already there
                                room.addTime(time);
                            }
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
}
