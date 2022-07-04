package Group2;

public class T125 {
    public static void main(String[] args) {
        String test = "A man, a";
        System.out.println(isPalindrome(test));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        StringBuffer s1 = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            if ((c[i] >= '0' && c[i] <= '9') || (c[i] >= 'a' && c[i] <= 'z')) {
                s1.append(c[i]);
            }
        }
        if (s1.toString().equals(s1.reverse().toString())) {
            return true;
        } else return false;
    }
}
