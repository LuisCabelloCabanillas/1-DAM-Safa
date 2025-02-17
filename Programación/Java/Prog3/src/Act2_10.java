import java.util.Scanner;

public class Act2_10 {
    public boolean esPerfecto(int numero) {
        if (numero < 1) {
            return false;
        }
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        Act2_10 perfecto = new Act2_10();
        if (perfecto.esPerfecto(numero)) {
            System.out.println("El número " + numero + " es un número perfecto.");
        } else {
            System.out.println("El número " + numero + " no es un número perfecto.");
        }
    }
}
