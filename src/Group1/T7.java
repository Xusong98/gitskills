package Group1;

import java.util.Arrays;

public class T7 {

    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val) {
        int result =0;
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val){
                count++;
                nums[i]=51;
            }
        }
        Arrays.sort(nums);
        result=nums.length-count;


        return result;
    }
}
