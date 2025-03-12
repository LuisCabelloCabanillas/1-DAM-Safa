import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejer22 {
    public static void main(String[] args) {
        int num = 10;

        List<Integer> numerosPares =  new ArrayList<>();

        for (int i = 1; i <= num*2; i++) {
            if (i % 2 == 0) {
                numerosPares.add(i);
            }
        }

        IntStream.range(1, num*2+1).filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);

        List<Integer> primosCuadrados = numerosPares.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println(primosCuadrados);
    }
}
