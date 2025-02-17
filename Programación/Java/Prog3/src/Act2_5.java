import java.util.Scanner;

public class Act2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Cambio de Euro a Dolares");
        System.out.println("2. Cambio de Dolares a Euro");
        System.out.println("Ingrese que tipo de cambio de moneda quieres hacer(1-2): ");
        int tipoCambio = sc.nextInt();
        if (tipoCambio == 1) {
            System.out.println("Ingrese el valor de Euros que quieres cambiar: ");
            double Euros = sc.nextDouble();
            double cambiodolares = 1.1;
            double camb= cambiodolares * Euros;
            System.out.println("El cambio de Euros a dolares es " + camb+"$");
        }
        else if (tipoCambio == 2) {
            System.out.println("Ingrese el valor de Dolares que quieres cambiar: ");
            double Dolares = sc.nextDouble();
            double cambioeuros = 0.91;
            double cambi= cambioeuros* Dolares;
            System.out.println("El cambio de Euros a dolares es " + cambi+"€");
        }
    }
}
