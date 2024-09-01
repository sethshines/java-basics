package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3,6,0};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i -1;j++) {
                System.out.println(j+"  "+i);
                if(arr[j] > arr[j+1]){
                    int _temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = _temp;
                }
            }
        }
        return arr;
    }
}
