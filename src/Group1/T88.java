package Group1;

import java.util.Arrays;

public class T88 {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 0, 0, 0};
        int[] num1 = {2, 3, 5};
        int m = 3;
        int n = 3;
        merge(num, m, num1, n);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i - m];
        }
       Arrays.sort(nums1);
    }
}
