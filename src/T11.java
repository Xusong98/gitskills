public class T11 {
    public static void main(String[] args) {
        int[] a = {9,9,9,9};
        int[] b = plusOne(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }


    }

    public static int[] plusOne(int[] digits) {
        /*int value = 0;
        for (int i = 0; i < digits.length; i++) {
            value = value * 10 + digits[i];
        }
        value += 1;
        int[] result = new int[("" + value).length()];
        for (int i = result.length-1; i >= 0; i--) {
            result[i] = value % 10;
            value /= 10;
        }
        return result;*/
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
        }
        if (digits[0] == 10) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            result[1] = 0;
            for (int i = 2; i < digits.length; i++) {
                result[i] = digits[i-1];
            }
            return result;
        }
        return digits;

    }
}
