public class T136 {
    public static void main(String[] args) {
        int[] n = {2, 2, 4, 5, 5};
        System.out.println(singleNumber(n));
    }

    public static int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
