package Group3;

public class T1672 {
    public static void main(String[] args) {
        int[][] a = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(a));
    }

    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if (temp > result) {
                result = temp;
            }
        }

        return result;
    }
}
