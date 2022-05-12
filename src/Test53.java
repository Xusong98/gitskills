public class Test53 {

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
    }



    //暴力破解
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }

    //动态规划
    public static int maxSubArray1(int[] nums) {
        int max = nums[0];
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] > 0 ? dp[i - 1] + nums[i] : nums[i];
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }

    //分治法
    public static int maxSubArray2(int[] nums) {
        int low = 0;
        int high = nums.length;
        int m = (low + high) / 2;
        int left = 0;
        int leftResult = 0;
        int right = 0;
        int rightResult = 0;
        while (high - low > 1) {
            for (int i = m; i >= low; i--) {
                left += nums[i];
                leftResult = Math.max(left, leftResult);
            }
            for (int i = m + 1; i < high; i++) {
                right += nums[i];
                rightResult = Math.max(right, rightResult);
            }

        }
        if (low == high) {
            return nums[low];
        }


        return 0;
    }


}
