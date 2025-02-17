import java.util.Scanner;

public class Act10 {
    public static void main(String[] args) {
        System.out.println("Escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Escribe otro numero para comparar cual es mayor: ");
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(b + " es mayor");
        }else if (a == b) {
            System.out.println(a + " es igual que " + b);
        }else
            System.out.println(a + " es mayor");
    }
}
