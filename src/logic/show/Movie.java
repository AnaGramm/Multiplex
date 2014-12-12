package logic.show;

/**
 * @author gramanas
 * @see logic.show.Show
 */
public class Movie extends Show {
    private int duration;

    /**
     * Constructs an empty Movie object.
     * Initializes the structure in witch the actors are stored.
     */
    public Movie(){
        super();
    }

    /**
     * Constructs a Movie object with the given parameters.
     * Initializes the structure in witch the actors are stored.
     * @param name The name of the movie.
     * @param description The description of the movie.
     * @param director The director of the movie.
     * @param duration Movie duration.
     */
    public Movie(String name, String description, String director, int duration){
        super(name, description, director);
        this.duration = duration;
    }

    /**
     * Copy constructor for Moive objects.
     * @param movie The movie to be copied.
     */
    public Movie(Movie movie){
        super(movie);
        this.duration = movie.duration;
    }

    /**
     * @param duration Movie duration to set.
     */
    public void setDuration(int duration){
        this.duration = duration;
    }


}
