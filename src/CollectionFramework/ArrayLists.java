package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
//        ArrayList<String> strArr = new ArrayList<>();
//        ArrayList<Boolean> boolArr = new ArrayList<>();

        // add elements
        intArr.add(0);
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);

        // print
        System.out.println(intArr);

        // getElements
        System.out.println(intArr.get(1));
        System.out.println(intArr.get(2));
        System.out.println(intArr.get(3));
        System.out.println(intArr.get(4));

        // update element
        intArr.set(0, 2);

        System.out.println(intArr);
        // remove element
        intArr.remove(1);
        intArr.remove(3);
        System.out.println(intArr);
        // Size of Array
        System.out.println(intArr.size());

        // sort
        Collections.sort(intArr);

        // Traversal of elements
        for(int a: intArr) {
            System.out.println(a);
        }
    }
}
