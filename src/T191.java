public class T191 {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        String s = "" + n;
        System.out.println(reverseBits(n));
    }

    public static int reverseBits(int n) {
        String s = "" + n;
        char[] c = s.toCharArray();
        int res = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '1') {
                res++;
            }
        }
        return res;
    }
}
