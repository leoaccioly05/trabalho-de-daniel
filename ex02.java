import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("Número de valores negativos: " + contaNegativos());
    }

    public static int contaNegativos() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            int n = scanner.nextInt();
            if (n < 0) {
                contador++;
            }
        }
        return contador;
    }
}
