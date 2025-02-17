import java.util.Scanner;
public class Act12 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa el primer número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int numero2 = scanner.nextInt();

            System.out.print("Ingresa el tercer número: ");
            int numero3 = scanner.nextInt();

            double promedio = (numero1 + numero2 + numero3) / 3.0;

            System.out.println("El promedio de los tres números es: " + promedio);
        }

}
