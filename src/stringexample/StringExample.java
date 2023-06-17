package stringexample;

/**
 * Created by Jay Vaghani
 */
public class StringExample {

    public static void main(String[] args) {
        // String Object
        String s = new String("Prime");
        s.concat("Testing");
        System.out.println(s);

        // String Buffer Object
        StringBuffer sb = new StringBuffer("Prime");
        sb.append("Testing");
        System.out.println(sb);
    }
}
