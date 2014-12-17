package logic.show;


import logic.room.Cine;
import logic.room.Room;
import logic.room.Theatre;

import java.util.ArrayList;
import java.util.List;

/**
 * The main class of the shows that take place in the multiplex.
 * @see Movie
 * @see Theatrical
 * @author gramanas
 */
public class Show {
    private String name;
    private String description;
    private String director;
    private List<String> actors;
    private List<Room> rooms;

    /**Constructs an empty show object. Initializes the structure in witch the actors are stored.
     */
    public Show(){
        actors = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    /**
     * Constructs a Show object with the given name description and director.
     * Initializes the structure in witch the actors are stored.
     * @param name Name.
     * @param description Description.
     * @param director Director
     */
    public Show(String name, String description, String director){
        this.name = name;
        this.description = description;
        this.director = director;
        actors = new ArrayList<String>();
    }

    /**
     * Copy constructor for Show objects.
     * @param show The show to be copied.
     */
    public Show(Show show){
        this.name = show.getName();
        this.director = show.director;
        this.description = show.description;
        this.actors = new ArrayList<>();
        rooms = new ArrayList<>();
        for (String actor : show.actors) {
            this.actors.add(actor);
        }
    }

    /**
     * Adds a copy of a room in the array.
     * @param room Room to be copied.
     */
    public void addRoom(Room room){
        if (room instanceof Cine){
            Cine tmp = new Cine((Cine) room);
            rooms.add(tmp);
        }else{
            Theatre tmp = new Theatre((Theatre) room);
            rooms.add(tmp);
        }
    }

    /**
     * @param name Name to be set.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * @param description Description to be set.
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * @param director Director to be set.
     */
    public void setDirector(String director){
        this.director = director;
    }

    /**
     * Adds an actor in the structure.
     * @param actor Actor's name.
     */
    public void addActor(String actor){
        actors.add(actor);
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
