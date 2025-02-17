import java.util.Random;

public class Act2_7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int suma;
        do {
            int randomNum = rand.nextInt(1,6)+1;
            int randomNum2 = rand.nextInt(1,6)+1;
            suma = randomNum+randomNum2;

            System.out.println("Primer dado: " + randomNum+ ", Segundo dado: " + randomNum2+ ", Suma: " + suma);
        }while (suma<7);
        System.out.println("La suma de los dados es mayor que 7");
    }
}
