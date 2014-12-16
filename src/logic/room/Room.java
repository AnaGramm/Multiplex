package logic.room;

import logic.show.Show;
import logic.show.Time;

import java.util.ArrayList;
import java.util.List;

/**
 * Every basic method for every kind of room lies in here.
 * @author gramanas
 */
public class Room {
    private final int MAX_ROWS = 15;
    private final int MAX_SEATS_PER_ROW = 20;
    private String name;
    private int numOfRows;
    private int numOfSeats;
    private List<List<Seat>> seats;
    private List<Time> times;

    /*When a room is created for the first time the times array will be empty and it will
     *only be filled when the room is copied inside a show.
     */

    /**
     * Constructs an empty Room object.
     */
    public Room(){}

    /**
     * Constructs a room with the given name.
     * @param name Name to set.
     */
    public Room(String name){
        this.name = name;
        this.seats = new ArrayList<>();
        numOfSeats = 0;
        numOfRows = 0;
    }

    /**
     * Copy constructor.
     * @param room The object being copied.
     */
    public Room(Room room){
        this.name = room.getName();
        this.numOfRows = room.numOfRows;
        this.numOfSeats = room.numOfSeats;
        this.seats = new ArrayList<>();
        this.times = new ArrayList<>();
        for (List<Seat> list : room.seats) { //might break (oops)!
            ArrayList<Seat> tempList = new ArrayList<>();
            for (Seat seat : list) {
                tempList.add(new Seat(seat));
            }
            this.seats.add(tempList);
        }
    }

    /**
     * @param name Name to set.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * @param numOfRows Number of Rows to set.
     */
    public void setNumOfRows(int numOfRows){
        if (numOfRows <= MAX_ROWS) {
            this.numOfRows = numOfRows;
        }else {
            this.numOfRows = MAX_ROWS;
        }
    }
    
    /**
     * This calls a private function witch creates an array list of numOfSeatsInRow Seat objects
     * and then adds them to the ArrayList<ArrayList<Seat>> field of the Room.
     *
     * @param numOfSeatsInRow The number of seats to be added in the next row (starting from 0)
     */
    public void setSeatsInRow(int rowNumber, int numOfSeatsInRow){
        if (numOfSeatsInRow <= MAX_SEATS_PER_ROW) {
            ArrayList<Seat> tmpList = new ArrayList<>();
            for (int i = 0; i < numOfSeatsInRow; i++) {
                Seat tmp = new Seat(rowNumber + ":" + i);
                tmpList.add(tmp);
            }
            seats.add(tmpList);
        }else {
            setSeatsInRow(rowNumber, MAX_SEATS_PER_ROW);
        }
    }

    /**
     * Reserves a seat with the given code.
     * @param code Seat code.
     */
    public void reserve(String code){
        String[] parts = code.split(":");
        String part1 = parts[0];
        String part2 = parts[1];
        int row = Integer.parseInt(part1);
        int col = Integer.parseInt(part2);
        seats.get(row - 1).get(col - 1).reservation();
    }

    /**
     * @return The room's name.
     */
    public String getName() {
        return name;
    }

    public void addTime(Time time){
        times.add(time);
    }
}
