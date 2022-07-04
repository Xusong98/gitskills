package Group1;

public class T12 {
    public static void main(String[] args) {
        System.out.println(addBinary("101","10101"));
    }

    public static String addBinary(String a, String b) {
       /* String a1 = a.length() >= b.length() ? a : b;
        String b1 = a.length() < b.length() ? a : b;
        StringBuffer a2 = new StringBuffer();
        a2.append(b1);
        for (int i = b1.length(); i < a1.length(); i++) {
            a2 = a2.reverse().append("0");
        }*/
        boolean flag = true;
        int le = a.length();
        int w = Math.abs(a.length() - b.length());
        if (a.length() < b.length()) {
            flag = false;
            le = b.length();
        }


        //
        StringBuffer stringBuffer = new StringBuffer();
        int temp = 0;//进位
        for (int i = le-1; i >= 0; i--) {
            if (flag) {
                //a长
                char ac = a.charAt(i);
                char bc = i - w < 0 ? '0' : b.charAt(i - w);
                int[] ints = add(ac, bc,temp);
                temp = ints[1];
                stringBuffer.append(ints[0]);
            } else {
                char bc = b.charAt(i);
                char ac = i - w < 0 ? '0' : a.charAt(i - w);
                int[] ints = add(ac, bc,temp);
                temp = ints[1];
                stringBuffer.append(ints[0]);
            }
        }
        if(temp == 1){
            stringBuffer.append("1");
        }
        return stringBuffer.reverse().toString();
    }

    public static int[] add(char ac, char bc, int temp) {
        if (temp == 0) {
            if (ac == '1' && bc == '1') {
                return new int[]{0, 1};
            } else if (ac == '0' && bc == '0') {
                return new int[]{0, 0};
            } else {
                return new int[]{1, 0};
            }
        } else {
            if (ac == '1' && bc == '1') {
                return new int[]{1, 1};
            } else if (ac == '0' && bc == '0') {
                return new int[]{1, 0};
            } else {
                return new int[]{0, 1};
            }
        }
    }
}
