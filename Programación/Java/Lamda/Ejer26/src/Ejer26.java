import java.util.List;
import java.util.stream.Collectors;

public class Ejer26 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> listaNumerosImpares = listaNumeros.stream().filter(numero -> numero % 2 != 0).map(numero -> numero * numero).collect(Collectors.toList());

        System.out.println(listaNumerosImpares);
    }
}
