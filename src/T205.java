import java.util.HashMap;
import java.util.Map;

public class T205 {
    public static void main(String[] args) {
        String s = "abbd";
        String t = "cdde";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        if (a.length != b.length) {
            return false;
        }
        Map<Character, Character> map = new HashMap();
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                if (map.containsValue(b[i])) {
                    return false;
                }
                map.put(a[i], b[i]);
            } else {
                if (map.get(a[i]) != b[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
