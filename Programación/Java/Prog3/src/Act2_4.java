import java.util.Scanner;

public class Act2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra para saber si es palindroma o no: ");
        String s = sc.nextLine();
        String minusculas = s.toLowerCase();
        String reemplazo = minusculas.replaceAll(" ", "");
        StringBuilder inv = new StringBuilder(reemplazo);
        String palabra = inv.reverse().toString();

        if (reemplazo.equals(palabra)) {
            System.out.println("La palabra es palindroma");
        }else
            System.out.println("La palabra no es palindroma");
    }
}
