package logic.customer;

import logic.room.Seat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gramanas on 29-Dec-14.
 */
public class Customer {
    private String name;
    private String phone;
    private List<Seat> bookedSeats;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
        bookedSeats = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String toString(){
        String tmp;
        tmp = "name: " + name +  " " + phone + "\n" + "Seats Booked:";
        ArrayList<String> tmplist = new ArrayList<>();
        for (Seat bookedSeat : bookedSeats) {
            tmp += bookedSeat.getCode() + " ";
        }
        return tmp;
    }
}
