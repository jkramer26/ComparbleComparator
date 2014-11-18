package lab1;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jkramer26
 */
public class StartUp {
    public static void main(String[] args) {
        Song s1 = new Song("SongOne", 1, 1, 1, 1);
        Song s2 = new Song("SongTwo", 2, 1, 1, 1);
        Song s3 = new Song("SongThree", 3, 1, 1, 1);
        Song s4 = new Song("SongOne", 1, 1, 1, 1);
        
        Set<Song> set = new TreeSet<Song>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        // Get the size of the Set (which should now be 3, to prove that
        // the duplicate was removed AND the set is sorted!
        // ... then we can loop and output...
        System.out.println("The size of the Sorted Set is: " + set.size());
        for(Song s : set) {
            System.out.println(s);
        }
        
    }
}
