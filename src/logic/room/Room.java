package logic.room;

import java.util.ArrayList;

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
    private ArrayList<ArrayList<Seat>> seats;


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
        for (ArrayList<Seat> list : room.seats) {
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
     * This calls a private function witch creates an array list of numOfSeatsInRow Seat objets
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
}
