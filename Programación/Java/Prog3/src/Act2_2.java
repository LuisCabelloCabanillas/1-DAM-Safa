import java.util.Scanner;

public class Act2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para identificar si es primo o no: ");
        int a = sc.nextInt();
        if(esPrimo(a)){
            System.out.println("El numero es primo");
        }
        else{
            System.out.println("El numero no es primo");
        }

    }
    public static boolean esPrimo(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
