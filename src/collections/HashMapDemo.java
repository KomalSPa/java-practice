package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Jay Vaghani
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("first", 1);
        map.put("second", 100.25);
        map.put("third", 100.25);
        map.put(100, "selenium");
        map.put(null, null);
        map.put("first", 100000);
        //Print Map
        System.out.println(map);
        // Iterate value from map
        Set setOfKeys = map.keySet();
        Iterator itr = setOfKeys.iterator();
        while (itr.hasNext()) {
            Object key = itr.next();
            System.out.println("Key-->" + key + ", Value-->" + map.get(key));
        }
    }
}
