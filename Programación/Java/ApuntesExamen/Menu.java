import java.util.Scanner;
import java.time.LocalTime;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccion = 0;

        while (eleccion < 1 || eleccion > 5) {
            System.out.println("Seleccione un ejercicio (1-5):");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");

            if (scanner.hasNextInt()) {
                eleccion = scanner.nextInt();
                if (eleccion < 1 || eleccion > 5) {
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next();
            }
        }

        switch (eleccion) {
            case 1:
                System.out.println("Ejercicio 1");
                SaludoSegunHora();
                break;
            case 2:
                System.out.println("Ejercicio 2");

                break;
            case 3:
                System.out.println("Ejercicio 3");

                break;
            case 4:
                System.out.println("Ejercicio 4");

                break;
            case 5:
                System.out.println("Ejercicio 5");

                break;
        }
    }

    public static void SaludoSegunHora() {
        LocalTime horaActual = LocalTime.now();
        int horaExacta = horaActual.getHour();

        if (horaExacta >= 6 && horaExacta < 12) {
            System.out.println("Buenos días");
        } else if (horaExacta >= 12 && horaExacta < 18) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }
}