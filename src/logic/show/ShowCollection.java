package logic.show;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a collection of all the shows in the multiplex and
 * it is used as a source to copy shows in the PTSD classes.
 * @see logic.program.PTSD
 * @see logic.show.Show
 * @author gramanas
 */
public class ShowCollection {
    private List<Movie> movies;
    private List<Theatrical> theatricals;

    /**
     * Constructs an empty collection object and initialises the two array lists.
     */
    public ShowCollection(){
        movies = new ArrayList<>();
        theatricals = new ArrayList<>();
    }

    /**
     * Adds the given show to the corresponding List.
     * @param show Show to add.
     */
    public void addShow(Show show){
        if (show instanceof Movie){
            movies.add((Movie) show);
        }else{
            theatricals.add((Theatrical) show);
        }
    }

    /**
     * Removes a show from the proper array based on that show's name.
     * @param name Name of the show to be removed.
     * @return True if the show was removed else false.
     */
    public boolean removeShow(String name){
        for (Movie movie : movies) {
            if (movie.getName().equals(name)){
                movies.remove(movie);
                return true;
            }
        }
        for (Theatrical theatrical : theatricals) {
            if (theatrical.getName().equals(name)){
                theatricals.remove(theatrical);
                return true;
            }
        }
        System.err.println("Could not find show.");
        return false;
    }

    /**
     * Searches through the movie array list and gets the names of all the shows,
     * then it adds them in the new array list that is returned.
     * @return The list with the movies.
     */
    public ArrayList<String> moviesToList(){
        ArrayList<String> temp = new ArrayList<>();
        for (Movie movie : movies) {
            temp.add(movie.getName());
        }
        return temp;
    }

    /**
     * Same for theatricals.
     */
    public ArrayList<String> theatricalsToList(){
        ArrayList<String> temp = new ArrayList<>();
        for (Theatrical theatrical : theatricals) {
            temp.add(theatrical.getName());
        }
        return temp;
    }
}
