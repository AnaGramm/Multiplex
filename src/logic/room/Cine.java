package logic.room;

import logic.show.Movie;
import logic.show.Show;

/**
 * This is the basic class or the cinema rooms. The price of the movie depends on the kind of screen it has.
 * This means it has a private field price and a private function calcPrice that returns the suited price.
 * @author gramanas
 */
public class Cine extends Room{
    private Screen screen;

    /**
     * Constructs a room with the given name.
     * @param name The name of the room.
     */
    public Cine(String name){
        super(name);
        screen = new Screen();
    }

    /**
     * Copy constructor.
     * @param cine The object being copied.
     */
    public Cine(Cine cine) throws IllegalArgumentException{
        super(cine);
        screen = cine.screen;
    }

    /**
     * Constructs an empty Cine object.
     */
    public Cine(){
        screen = new Screen();
    }

    /**
     * Adds a copy of a show to the array.
     * @param show Show to be added.
     */
    @Override
    public void addShow(Show show){
        Movie tmp = new Movie((Movie) show);
        this.getShows().add(tmp);
    }
}
