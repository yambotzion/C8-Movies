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
      for(int i = movies.length-1; i>=0; i--){
       pool.add(0,movies[i]); 
      }
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
        for(int i = pool.size()-1; i>=0; i--){
         if(pool.get(i).getStudio().equals(studio)){
           foundStudio.add(0,pool.get(i));  
         }
        } 
        return foundStudio;
    }
    
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestRating(ArrayList<Movie> movies)
    {
      Movie highestRating = movies.get(0);
      for(int i = 1; i<movies.size(); i++){
       if(movies.get(i).getRating() > highestRating.getRating()){
        highestRating = movies.get(i);
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
        
        highestRated.add(0,getHighestRating(getByStudio("Disney")));
        highestRated.add(0,getHighestRating(getByStudio("Ghibli")));
        highestRated.add(0,getHighestRating(getByStudio("Indy")));
         return highestRated;
        // return highestRated;
        
    }

}
