package logic.show;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gramanas on 13-Dec-14.
 */
public class ShowCollection {
    private List<Movie> movies;
    private List<Theatrical> theatricals;

    public ShowCollection(){
        movies = new ArrayList<>();
        theatricals = new ArrayList<>();
    }

    public void addShow(Show show){
        if (show instanceof Movie){
            movies.add((Movie) show);
        }else{
            theatricals.add((Theatrical) show);
        }
    }

    public boolean removeShow(String name){
        for (Movie movy : movies) {
            if (movy.getName().equals(name)){
                movies.remove(movy);
                return true;
            }
        }
        for (Theatrical theatrical : theatricals) {
            if (theatrical.getName().equals(name)){
                theatricals.remove(theatrical);
                return true;
            }
        }
        System.err.println("Could ot find show.");
        return false;
    }

}
