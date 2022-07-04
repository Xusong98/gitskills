package Group1;

public class T3 {
    public static void main(String[] args) {
        String s = "IV";
        int value = romanToInt(s);
        System.out.println(value);
    }


    public static int romanToInt(String s) {
        int result = 0;
        s = s.replace("IV", "a");
        s = s.replace("IX", "b");
        s = s.replace("XL", "c");
        s = s.replace("XC", "d");
        s = s.replace("CD", "e");
        s = s.replace("CM", "f");
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            result += value(chars[i]);
        }
        return result;
    }

    public static int value(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            case 'a':
                return 4;
            case 'b':
                return 9;
            case 'c':
                return 40;
            case 'd':
                return 90;
            case 'e':
                return 400;
            case 'f':
                return 900;
            default:
                return 0;
        }


    }


}
