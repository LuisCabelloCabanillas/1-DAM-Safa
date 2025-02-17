import java.util.ArrayList;

public class Act4_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }

        numeros.removeIf(numero -> numero % 2 != 0);

        System.out.println("Lista después del filtrado (solo pares):");
        System.out.println(numeros);
    }
}
