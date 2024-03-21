public class ex01 {
    public static void main(String[] args) {
        int a = 1, b = -3, c = 2;
        System.out.println(eq2Grau(a, b, c));
    }

    public static String eq2Grau(int a, int b, int c) {
        double delta = delta(a, b, c);
        if (delta < 0) {
            return "A equação não possui raízes reais.";
        } else if (delta == 0) {
            double x = -b / (2.0 * a);
            return "A equação possui uma raiz real: " + x;
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            return "A equação possui duas raízes reais: " + x1 + " e " + x2;
        }
    }

    public static double delta(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
}