import java.util.HashMap;
import java.util.Scanner;

public class Act6_3 {
    public static void main(String[] args) {
        HashMap<String, String> paisesCapitales = new HashMap<>();
        paisesCapitales.put("España", "Madrid");
        paisesCapitales.put("Francia", "París");
        paisesCapitales.put("Alemania", "Berlín");
        paisesCapitales.put("Italia", "Roma");
        paisesCapitales.put("Japón", "Tokio");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un país:");
        String pais = scanner.nextLine();

        String capital = paisesCapitales.get(pais);
        if (capital != null) {
            System.out.println("La capital de " + pais + " es " + capital);
        } else {
            System.out.println("País no encontrado en el mapa.");
        }
    }
}
