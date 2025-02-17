import java.util.Scanner;

public class Act2_1 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Introduzca la primera nota: ");
     double a = sc.nextInt();
     System.out.println("Introduzca la segunda nota: ");
     double b = sc.nextInt();
     System.out.println("Introduzca la tercera nota: ");
     double c = sc.nextInt();
     System.out.println("Introduzca la cuarta nota: ");
     double d = sc.nextInt();
     System.out.println("Introduzca la quinta nota: ");
     double e = sc.nextInt();

     double notamedia = (a+b+c+d+e)/5;

     if(notamedia>=5){
         System.out.println("El nota media es: "+notamedia+" por lo tanto estas aprobado");
     }else if(notamedia<5){
         System.out.println("La nota media es: "+notamedia+" por lo tanto no has aprobado");
     }


 }
}