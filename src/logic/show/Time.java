package logic.show;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//TODO must add limits 23 and 59 for hours and mins...
/**
 * This class represents time and it packs the methods that control it
 * depending on the needs of the admin.
 * @author gramanas
 */
public class Time {
    private int hour;
    private int min;

    /**
     * Constructs an empty Time object.
     */
    public Time(){}

    /**
     * Constructs an object Time with specific time and minutes.
     * @param hour Hours.
     * @param min Minutes.
     */
    public Time(int hour, int min){
        this.hour = hour;
        this.min = min;
    }

    public Time(String time) throws IllegalArgumentException {
        String[] parts = time.split(":");
        this.hour = Integer.parseInt(parts[0]);
        this.min = Integer.parseInt(parts[1]);
    }

    /**
     * Sets the time to the given parameters.
     * @param hour Hours.
     * @param min Minutes.
     */
    public void setTime(int hour, int min){
        this.hour = hour;
        this.min = min;
    }

    /**
     * @return A Time object with the current time.
     */
    public static Time getCurrentTime(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Calendar cal = Calendar.getInstance();
        String tmp =  dateFormat.format(cal.getTime()); //16:23
        String[] parts = tmp.split(":");
        return new Time(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
    }

    /**
     * Returns the time in a proper way to be printed wherever necessary.
     * @return for example 13:25
     */
    @Override
    public String toString(){
        return hour + ":" + min;
    }

    //TODO delete this!!
    public static void main(String[] args) {
        Time time1 = Time.getCurrentTime();
        Time time2 = new Time(20,30);
        System.out.println(time1);
        System.out.println(time1.equals(time2));
        System.out.println(time2);
    }

    public boolean equals(Time time){
        if (this.hour == time.hour && this.min == time.min){
            return true;
        }
        return false;
    }
}
