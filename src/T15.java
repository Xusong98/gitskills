public class T15 {
    public static void main(String[] args) {
        int []temp={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println( maxSubArray(temp));
    }

    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            value += nums[i];
            if (value > result) {
                result = value;
            }
            if (value <= 0) {
                value = 0;
            }
        }

        return result;
    }
}
