public class ex04 {
    public static void main(String[] args) {
        int x = 2;
        int k = 3;
        System.out.println(power(x, k));
    }

    public static int power(int x, int k) {
        if (k == 0) {
            return 1;
        } else {
            return x * power(x, k - 1);
        }
    }
}