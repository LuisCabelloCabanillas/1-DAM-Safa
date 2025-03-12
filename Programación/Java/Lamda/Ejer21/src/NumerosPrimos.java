import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static javax.management.Query.or;

public class NumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> primos = numeros.stream().filter(n -> n > 1 && IntStream.rangeClosed(2,(int) Math.sqrt(n)).allMatch(coin -> n % coin !=0)).toList();

        System.out.println(primos);
    }
}
