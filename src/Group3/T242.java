package Group3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class T242 {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Objects.equals(c1, c2);
    }
}
