import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejer27 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Juan", "Pedro", "Luis", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Lola", "Manuel","Monserrat");

        Arrays.stream(nombres.stream().collect(Collectors.joining(", ")).split(" ")).forEachOrdered(System.out::println);

    }
}
