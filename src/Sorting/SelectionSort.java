package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
       int[] arr = {4,2,1,3,6,0};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    public static int[] selectionSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int _temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = _temp;
        }
        return arr;
    }
}
