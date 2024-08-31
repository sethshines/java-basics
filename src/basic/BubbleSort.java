package basic;

import java.util.ArrayList;

public class BubbleSort {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(26);
        nums.add(25);
        nums.add(24);
        nums.add(23);
        nums.add(22);
        nums.add(21);
        nums.add(20);
        System.out.println(nums);
        for (int i=0;i<nums.size()-1;i++) {

            for (int j=0;j<nums.size()-1-i;j++) {
                if(nums.get(j+1) < nums.get(j)){
                    int _temp = nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, _temp);
                }
            }
        }
        System.out.println(nums);

    }
}
