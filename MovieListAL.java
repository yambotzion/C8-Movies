import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieListAL here.
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 */
public class MovieListAL
{
    // instance variables - replace the example below with your own
    private ArrayList<Movie> pool;

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {
      pool = new ArrayList<Movie>();
      for(Movie i : movies)
       pool.add(i);
    }
    
    public ArrayList<Movie> getPool()
    {
        return pool;
    }
    
    
    /**
     * Given an arraylist of Movies and a studio name, create a new ArrayList of movies
     * by that studio
     */
    public ArrayList<Movie> getByStudio(String studio)
    {
        ArrayList<Movie> foundStudio = new ArrayList<Movie>();
        for(Movie i : pool)
         if(i.getStudio().equals(studio)){
           foundStudio.add(i);  
         }
        
        return foundStudio;
    }
    
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestRating(ArrayList<Movie> movies)
    {
      Movie highestRating = movies.get(0);
      for(Movie i : movies){
       if(i.getRating() > highestRating.getRating()){
        highestRating = i;
        }
      }
      return highestRating;
        
        
        
    }
    
    

    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        
        highestRated.add(getHighestRating(getByStudio("Disney")));
        highestRated.add(getHighestRating(getByStudio("Ghibli")));
        highestRated.add(getHighestRating(getByStudio("Indy")));
        return highestRated;
        // return highestRated;
        
    }

}
