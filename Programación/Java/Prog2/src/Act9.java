import java.util.Scanner;

public class Act9 {

    public static void main(String[] args) {
        double b= Math.PI;
        System.out.println("Introduzca el valor del radio: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.println("El valor del area es: " + b*(a*a));
    }
}
