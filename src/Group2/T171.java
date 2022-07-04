package Group2;

public class T171 {
    public static void main(String[] args) {

    }

    public static int titleToNumber(String columnTitle) {
        char[] n = columnTitle.toCharArray();
        int res = 0;
        for (int i = 0; i < n.length; i++) {
            res = res * 26 + (n[i] - 'A' + 1);
        }
        return res;
    }
}
