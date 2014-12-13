package logic.program;

import logic.room.Room;
import logic.show.Show;
import logic.show.Time;

/**
 * PTSD stands for <b>Place</b>, <b>Time</b>, <b>Show</b> and <b>Day</b>.
 * The purpose of this class is to serve as a daddy class for PTMD and PTTD.
 * In here there are fields for place (a Room) for time (a Time) for day (a Day) and for show (a Show).
 * While for the time variable I just create a new object and insert it, for the other two
 * I check the list of the currently added Shows and Rooms and then I make a copy of each one and then
 * insert it here so the reservations done for this show/room combination won't affect the other show/room
 * ones.
 * @see logic.program.PTTD
 * @see logic.program.PTMD
 * @see logic.program.Program
 * @author gramanas
 */
public class PTSD {
    private Room room;
    private Time time;
    private Show show;
    private Day day;

    /**
     * Constructs an empty PTSD object.
     */
    public PTSD(){}

    /**
     * @param room Room to be set.
     */
    public void setPlace(Room room){
        this.room = room;
    }

    /**
     * @param time Time to be set.
     */
    public void setTime(Time time){
        this.time = time;
    }

    /**
     * @param show Show to be set.
     */
    public void setShow(Show show){
        this.show = show;
    }

    /**
     * @param day Day to be set.
     */
    public void setDay(Day day){
        this.day = day;
    }

    /**
     * @return The PTSD object in a correct way to be printed.
     */
    @Override
    public String toString(){
        //TODO code
        return null;
    }
}
