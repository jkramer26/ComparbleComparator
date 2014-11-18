/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;

import java.util.*;

/**
 *
 * @author jkramer26
 */
public class StartUp5 {
    public static void main(String[] args) {
        
        Song s1 = new Song("zSongOne", 1, 1, 1, 1);
        Song s2 = new Song("bSongTwo", 2, 1, 1, 1);
        Song s3 = new Song("cSongThree", 3, 1, 1, 1);
        Song s4 = new Song("aSongFour", 1, 1, 1, 1);
        
        Map<String, Song> map = new HashMap<String, Song>();
        map.put("z", s1);
        map.put("b", s2);
        map.put("c", s3);
        map.put("a", s4);
        
        System.out.println("Sorted by Key");
        Set<String> keys2 = map.keySet();
        for(String key : keys2) {
            Song found = map.get(key);
            System.out.println(found.toString());
        }
        
        
        System.out.println("The size of the Map is: " + map.size());
        System.out.println("Sorted by compare method");
        Collection<Song> values = map.values();
        // Now put in List because Collections.sort reuquires it...
        List<Song> sortedList = new ArrayList<Song>(values);
        // Now use the utility class to perform the sort using the
        // natural order (Comparable) of the entity object
        Collections.sort(sortedList);
        for(Song emp : sortedList) {
            System.out.println(emp);
        }
        
    }
}
