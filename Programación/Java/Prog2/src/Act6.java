import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre+ ". Tienes " + edad +" años.");

        /*Pide al usuario dos números y muestra su suma.*/
        System.out.println("Introduzca un número entero para sumar: ");
        int suma1 = sc.nextInt();
        System.out.println("Introduzca el otro número entero para ser sumados: ");
        int suma2 = sc.nextInt();

        System.out.println("La suma de los dos números es: " +(suma1 + suma2));

    }
}
