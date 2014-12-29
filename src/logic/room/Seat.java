package logic.room;

/**
 * Represents a seat in the rooms. A structure with objects from this class will be in
 * every instance of a room. This is where the reservation takes place.
 * @author gramanas
 */
public class Seat {
    private String code;
    private boolean avaliable;
    private boolean VIP;

    /**
     * Constructs a Seat object with the given code that is ready for reservation and can later be
     * a VIP seat from the admin.
     * @param code The seat code.
     */
    public Seat(String code){
        this.code = code;
        avaliable = true;
        VIP = false;
    }

    /**
     * Constructs an empty Seat object.
     */
    public Seat(){}

    /**
     * Copy constructor.
     * @param seat Seat to be copied.
     */
    public Seat(Seat seat){
        this.code = seat.code;
        this.avaliable = seat.avaliable;
        this.VIP = seat.VIP;
    }

    /**
     * @param code The seat code to be set.
     */
    public void setCode(String code){
        this.code = code;
    }

    /**
     * @return True for an available seat, else false.
     */
    public boolean isAvailable(){
        return avaliable;
    }

    /**
     * @return True for a VIP seat. else false.
     */
    public boolean isVIP(){
        return VIP;
    }

    /**
     * If a seat is not VIP it sets it. If it is VIP it unsets it.
     */
    public void changeVIP(){
        if (VIP == false){
            VIP = true;
        }else{
            VIP = false;
        }
    }

    /**
     * Renders the seat reserved.
     */
    public void reservation(){
        if (avaliable == false){
            //exception about reserved seat.
            return;
        }
        avaliable = false;
    }

    /**
     * Renders the seat available.
     */
    public void unreserve(){
        avaliable = true;
    }

    public String getCode() {
        return code;
    }
}
