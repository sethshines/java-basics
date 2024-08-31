package basic;

import java.util.ArrayList;

// Sum of Array Elements:
// Write a program to find the sum of all elements in an array.
public class SumOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(5);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        int sum = 0;
        for(Integer num: array) {
            sum += num;
        }
        System.out.println(sum);
    }
}
