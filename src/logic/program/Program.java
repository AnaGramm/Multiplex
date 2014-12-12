package logic.program;


import logic.show.Show;


/**
 * This class implements and manages the program of movies and theatricals in the multiplex.
 * It has an <tt>Array</tt> with the days of the week and in here takes place the search for
 * available rooms, days and times that the selected movie will be played. Also there are methods for adding or removing
 * movies and theatricals for the admin.
 * @author gramanas
 */
public class Program {
    //TODO fields

    /**
     * Constructs an empty Program object.
     * Initializes the arrays with the days for movies and theatricals.
     */
    public Program() {
        //TODO code
    }

    /**
     * For every day in the array of the days searches for rooms and theatres for the selected show,
     * and then using a private function prints it either in text or in a JLabel.
     *
     * @param show Search key.
     */
    public void searchMovie(Show show) {
        //TODO code
    }

    /**
     * Adds a show to the proper array.
     *
     * @param ptsd Place, Time, Show.
     */
    public void addShow(PTSD ptsd) {
        //TODO code
    }

    /**
     * Removes a show from the proper array
     *
     * @param ptsd The show to be removed.
     */
    public void removeShow(PTSD ptsd) {
        //TODO code
    }
}
