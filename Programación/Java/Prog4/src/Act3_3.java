import java.util.ArrayList;
import java.util.Collections;

public class Act3_3 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");
        frutas.add("Durazno");
        frutas.add("Kiwi");

        Collections.reverse(frutas);

        System.out.println("Frutas en orden inverso:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
