package Group4;

import java.util.HashMap;
import java.util.Map;

public class T290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null) {
            return false;
        }
        String[] a = s.split(" ");
        if (a.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            char tmp = pattern.charAt(i);
            if (map.containsKey(tmp)) {
                if (!map.get(tmp).equals(a[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(a[i])) {
                    return false;
                }
                else {
                    map.put(tmp, a[i]);
                }
            }
        }
        return true;
    }
}
