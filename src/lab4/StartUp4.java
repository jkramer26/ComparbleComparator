
package lab4;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jkramer26
 */
public class StartUp4 {
    public static void main(String[] args) {
        Song s1 = new Song("zSongOne", 1, 1, 1, 1);
        Song s2 = new Song("bSongTwo", 2, 1, 1, 1);
        Song s3 = new Song("cSongThree", 3, 1, 1, 1);
        Song s4 = new Song("zSongOne", 1, 1, 1, 1);
        Song s5 = new Song("aSongFive", 1, 1, 1, 1);
        
        Set<Song> set = new TreeSet<Song>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        // Get the size of the Set (which should now be 3, to prove that
        // the duplicate was removed AND the set is sorted!
        // ... then we can loop and output...
        System.out.println("The size of the Sorted Set is: " + set.size());
        for(Song s : set) {
            System.out.println(s);
        }
    }
}
