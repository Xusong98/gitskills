package Group1;

import java.util.ArrayList;
import java.util.List;

public class T16 {
    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < nums2.length; j++) {
                r.add(Math.max(nums1[i], nums2[j]));
            }
        }
        int[] result = r.stream().mapToInt(Integer::valueOf).toArray();
    }
}
