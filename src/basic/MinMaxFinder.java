package basic;
import java.util.ArrayList;

public class MinMaxFinder {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        findMinMax(numbers);
    }

    public static void findMinMax(ArrayList<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        System.out.println("Max: " + max + " Min: " + min);
    }
}
