package Sorting;

import java.util.ArrayList;
import java.util.Objects;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(12);
        arr.add(14);
        arr.add(13);
        arr.add(16);
        arr.add(10);
        System.out.println(mergeSort(arr));
    }

    static ArrayList<Integer> mergeSort (ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }
        int middle = arr.size() / 2;
        return merge(mergeSort(new ArrayList<>(arr.subList(0, middle))), mergeSort(new ArrayList<>(arr.subList(middle, arr.size()))));
    }

    static ArrayList<Integer> merge (ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> mergedArr = new ArrayList<>();
        // Instead of using 0 here we should manage with indexes.
        while(!left.isEmpty() && !right.isEmpty()){
            if(left.get(0) < right.get(0)) {
                mergedArr.add(left.remove(0));
            } else if(left.get(0) > right.get(0)) {
                mergedArr.add(right.remove(0));
            } else if(Objects.equals(left.get(0), right.get(0))) {
                mergedArr.add(left.remove(0));
                mergedArr.add(right.remove(0));
            }

            if(!left.isEmpty() && right.isEmpty()) {
                while(!left.isEmpty()){
                    mergedArr.add(left.remove(0));
                }
            }
            if(left.isEmpty() && !right.isEmpty()) {
                while(!right.isEmpty()){
                    mergedArr.add(right.remove(0));
                }
            }
        }
        return mergedArr;
    }
}

