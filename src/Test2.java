public class Test2 {
    //递归1-10
    public static void main(String[] args) {
        System.out.println(plus(4));
    }

    public static int plus(int x) {
        if (x == 1) {
            return 1;
        } else if (x == 2) {
            return 2;
        } else {
            return (plus(x - 1) + plus(x - 2));
        }
    }

}
