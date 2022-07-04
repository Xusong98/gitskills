package Group1;

import java.util.Arrays;

public class T9 {
    public static void main(String[] args) {
        String str=" a";
        String[] s = str.split(" ");


        for (String c : s) {
            System.out.println(c.length());
        }



    }


    public static int searchInsert(int[] nums, int target) {


        return search(nums,0,nums.length-1,target);
    }


    public static int search(int[] nums, int low, int high, int target) {
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return search(nums, mid, nums.length - 1, target);
        } else {
            return search(nums, 0, mid, target);
        }
    }
}
