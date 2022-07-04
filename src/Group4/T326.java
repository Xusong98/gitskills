package Group4;

public class T326 {
    public static void main(String[] args) {
        int a = 28;
        System.out.println(isPowerOfThree(a));
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) n /= 3;
        return n == 1;
    }
}
