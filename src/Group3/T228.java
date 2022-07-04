package Group3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T228 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 5, 6, 7, 9};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap();
        return list;
    }
}
