public class T13 {
    public static void main(String[] args) {
        int x = 17;
        System.out.println(mySqrt(x));

    }

    public static int mySqrt(int x) {

        int low = 0;
        int high = x;
        if (x == 1) {
            return 1;
        }
        while (high > low+1) {
            int mid = (low + high) / 2;
            if (x / mid < mid) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return low;

    }
}
