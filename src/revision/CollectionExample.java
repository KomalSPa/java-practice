package revision;

import java.util.*;

/**
 * Created by Jay Vaghani
 */
public class CollectionExample {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(2);
        list.add("Prime");
        list.add(null);
        list.add(true);
        list.add("Prime");

        List list1 = new ArrayList();
        Set set1 = new HashSet();

        for (Object object : list){
            System.out.println(object);
        }

        System.out.println("-----------------------------------");
        HashSet set = new HashSet();
        set.add("Green");
        set.add(2);
        set.add(null);
        set.add("prime");
        set.add("Green");


        for (Object o :set){
            System.out.println(o);
        }

        System.out.println("--------------------------------");

        HashMap<Integer, String> map = new HashMap<>();
        Map<Integer, String> map1 = new HashMap();
        map.put(1, "Prime");
        map.put(2, "Testing");
        map.put(3, "Java");
        map.put(4, "Java");
        map.put(2, "Automation");

        Set colour = map.entrySet();

        for (Object o: colour){
            System.out.println(o);
        }

    }
}
