import java.util.Scanner;

public class Act11 {
        public static int calcularFactorial(int n) {
            if (n == 0) {
                return 1;
            }
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            return factorial;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            int resultado = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }
}
        public static long calcularFactorial(int numero) {
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }

        public static void main(String[] args) {
            int numero = 5;
            long resultado = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }
