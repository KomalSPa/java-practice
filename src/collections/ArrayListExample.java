package collections;

import java.util.ArrayList;

/**
 * Created by Jay Vaghani
 */
public class ArrayListExample {

    ArrayList<String> arrayList = new ArrayList<String>();
    // Insert element to array list
    public void addElementToList(){
        arrayList.add("India");
        arrayList.add("United Kingdom");
        arrayList.add("United State");
        arrayList.add("Dubai");
        arrayList.add("France");
    }

    public static void main(String[] args) {
        ArrayListExample example = new ArrayListExample();
        example.addElementToList();
        System.out.println(example.arrayList);
        System.out.println(example.isElementPresentInList("India"));
        System.out.println(example.isElementPresentInList("Belgium"));
        System.out.println(example.verifyElementPresentInList("Belgium"));
        System.out.println(example.verifyElementPresentInList("United Kingdom"));
    }
    public boolean isElementPresentInList(String element){
        return arrayList.contains(element);
    }

    public boolean verifyElementPresentInList(String element){
        boolean verify = false;
        for (String str : arrayList ){
            if (str.equals(element)){
                verify = true;
                break;
            }
        }
        return verify;
    }
}
