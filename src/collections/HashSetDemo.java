package collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Jay Vaghani
 */
public class HashSetDemo {

    public static void main(String[] args) {
        // HashSet Declaration
        HashSet<String> set = new HashSet<String>();
        set.add("Prime");
        set.add("Testing");
        set.add("Selenium");
        set.add("Java");
        // Print HashSet
        System.out.println(set);
        // Iterate all set value using for each loop
        for (String var : set) {
            System.out.println(var);
        }
        // Iterate all set value using Iterator and while loop
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        String[] array = {"first", "second", "third", "first", "fourth",
        "third", "fifth"};

        HashSet<String> set1 = new HashSet<String>();
        for (String str : array){
            set1.add(str);
        }

        Iterator<String> itr = set1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
