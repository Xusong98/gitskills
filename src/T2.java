import java.util.Arrays;

public class T2 {

    public static void main(String[] args) {
        boolean f = isPalindrome(121121);
        System.out.println(f);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x >= 0 && x <= 9) {
            return true;
        }
        String str = "" + x;
        StringBuffer strb = new StringBuffer();
        strb.append(str);
        String s =strb.reverse().toString();
        if (s.equals(str)){return true;}
        else {return false;}
    }
}
