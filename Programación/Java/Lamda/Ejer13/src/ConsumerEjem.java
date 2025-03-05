import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEjem {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);


        Consumer<Integer> imprimir = num -> System.out.println("Doble del numero " + (num * 2));
        numeros.forEach(imprimir);
    }
}
