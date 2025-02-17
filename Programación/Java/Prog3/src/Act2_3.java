import java.util.Scanner;

public class Act2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        double b = sc.nextInt();
        System.out.println("Ingrese que operación quieres realizar(sumar,restar,multiplicar,dividir): ");
        String operacion = sc.next();
        if (operacion.equals("sumar")) {
            System.out.println(sumar(a,b));
        }
        else if (operacion.equals("restar")) {
            System.out.println(restar(a,b));
        }
        else if (operacion.equals("multiplicar")) {
            System.out.println(multiplicar(a,b));
        }
        else if (operacion.equals("dividir")) {
            if (b!=0) {
                System.out.println(dividir(a, b));
            }else{
                System.out.println("No se puede dividir");
            }
        }
    }
    public static double sumar(double a, double b) {
        return a + b;
    }
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
}
