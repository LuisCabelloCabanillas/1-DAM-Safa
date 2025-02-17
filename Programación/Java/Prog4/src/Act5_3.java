import java.util.HashSet;

public class Act5_3 {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Elementos del conjunto:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
