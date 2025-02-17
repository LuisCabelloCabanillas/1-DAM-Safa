import java.util.Scanner;

public class Act8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la temperatura en Celsius: ");
        double a = sc.nextInt();
        System.out.println("La temperatura en Fahrenheit es de " + (a*9.0/5.0+32));

    }
}
