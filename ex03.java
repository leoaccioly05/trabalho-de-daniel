import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        System.out.println("Número de valores negativos: " + decide());
    }

    public static int decide() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            int n = scanner.nextInt();
            if (n < 0) {
                count++;
            }
        }
        return count;
    }
}