

package lab2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
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
        Song s4 = new Song("SongFour", 1, 1, 1, 1);
        
        Map<String, Song> map = new HashMap<String, Song>();
        map.put("SongOne", s1);
        map.put("SongTwo", s2);
        map.put("SongThree", s3);
        map.put("SongFour", s4);
        
        //output isn't random
        Set<String> keys = map.keySet();
        for(String key : keys) {
            Song found = map.get(key);
            System.out.println(found.toString());
        }
        
        System.out.println("");
        Map<String, Song> map2 = new LinkedHashMap<String, Song>();
        map2.put("SongOne", s1);
        map2.put("SongTwo", s2);
        map2.put("SongFour", s4);
        map2.put("SongThree", s3);
        
        Set<String> keys2 = map2.keySet();
        for(String key3 : keys2) {
            Song found = map2.get(key3);
            System.out.println(found.toString());
        }
        
    }
    
}
