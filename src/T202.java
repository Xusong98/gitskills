public class T202 {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = method(n);
        while (fast != 1 && slow != fast) {
            fast = method(method(fast));
            slow = method(slow);
        }
        return fast == 1;
    }

    public static int method(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res = temp * temp + res;
            n = n / 10;
        }
        return res;
    }
}
