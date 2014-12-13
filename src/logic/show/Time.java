package logic.show;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
     * Returns the time in a proper way to be presented wherever necessary.
     * @return for example 13:25
     */
    @Override
    public String toString(){
        return hour + ":" + min;
    }

    public static void main(String[] args) {
        Time time = Time.getCurrentTime();
        System.out.println(time);
    }
}
