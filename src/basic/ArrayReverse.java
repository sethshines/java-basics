package basic;

import java.util.ArrayList;

public class ArrayReverse {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(5);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println(array);
        int lastIndex = array.size() - 1;
        int middleIndex = array.size() % 2 == 0 ? array.size() / 2 : (array.size() + 1) / 2 ;

        for(int i=0;i<middleIndex;i++) {
            int _temp = array.get(i);
            array.set(i, array.get(lastIndex - i));
            array.set(lastIndex -i, _temp);
        }
        System.out.println(array);
    }
}
