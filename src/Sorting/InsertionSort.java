package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3,6,0};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort (int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int j=i;
            while(j>0) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }

        }
        return arr;
    }
}
