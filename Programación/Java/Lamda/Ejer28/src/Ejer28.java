import java.util.List;

public class Ejer28 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer numero=5;

        List<Integer> numerosMayores = listaNumeros.stream().filter(n -> n > numero).toList();

        System.out.println(numerosMayores);
    }
}
