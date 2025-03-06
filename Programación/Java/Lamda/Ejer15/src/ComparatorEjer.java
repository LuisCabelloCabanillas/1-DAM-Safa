import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorEjer {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Comparator<Integer> comparador = (a, b) -> b - a;
        numeros.sort(comparador);

        System.out.println(numeros);
    }
}
