import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEjer {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
            nombres.add("Ana");
            nombres.add("Luis");
            nombres.add("Alberto");
            nombres.add("Maria");

            Predicate<String> comienzoLetra = s -> s.startsWith("A");

            List<String> nombresConA = new ArrayList<>();
            for (String nombre : nombres) {
                if (comienzoLetra.test(nombre)) {
                    nombresConA.add(nombre);
                }
            }
            System.out.println(nombresConA);
    }
}
