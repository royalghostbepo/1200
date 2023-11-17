

import java.util.ArrayList;
import java.util.List;

public class PlayListManager {

    private List<String> songs ;
    
    public PlayListManager() {
        this.songs = new ArrayList<>();
    }

    /**
     * Function allows user to add a song from the playlist
     * @param song
     */

     private void removeSong(String song) {
        songs.remove(songs) ;
     }

     /**
      * Function displays all the songs in the playlist
      */

      private void displaySongs() {
        for (String song : songs) {
            System.out.println("Playing " + song);
            
        }
      }
      /**
       * BONUS: search function
       * @param song
       */

       private boolean 

}