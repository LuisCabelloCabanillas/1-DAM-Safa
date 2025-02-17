import java.util.Scanner;

public class Act2_9 {
    public void generarTabla(int numero) {
        if (numero <= 10 && numero > 0) {
            System.out.println("\nTabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else
            System.out.println("El numero no puede ser mayor que 10 o menor que 0");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entre 1 y 10: ");
        int numero = scanner.nextInt();

        Act2_9 tablas = new Act2_9();
        tablas.generarTabla(numero);
    }
}
