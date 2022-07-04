package Group2;

public class T121 {
    public static void main(String[] args) {
        int[] p = {2,4,1,7};
        System.out.println(maxProfit(p));
    }

    public static int maxProfit(int[] prices) {
        int tempMin = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (tempMin > prices[i]) {
                tempMin = prices[i];
            } else {
                result = Math.max(result, prices[i] - tempMin);
            }
        }
        return result;
    }
}
