import java.util.HashSet;
import java.util.Set;

public class T17 {
    public static void main(String[] args) {
        String[] str = {"","b"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        int count = 0;
        int result = 0;
        int size = 0;
        int loop = 0;
        for (int i = 0; i < strs.length; i++) {
            int minSize = strs[i].length();
            if (strs[i] == "") {
                break;
            }
            if (size == 0 || minSize < size) {
                size = minSize;
            }
        }
        if (size == 0) {
            return "";
        }
        while (loop < size) {
            Set<String> temp = new HashSet<>();
            for (int i = 0; i < strs.length; i++) {
                temp.add(""+strs[i].charAt(count));
                if (i == strs.length - 1) {
                    count++;
                }
                if (temp.size() == 1 && i == strs.length - 1) {
                    result++;
                }
            }
            loop++;
        }
        if (result == 0) {
            return "";
        } else {
            return strs[0].substring(0, result);
        }
    }
}
