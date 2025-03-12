import java.util.List;
import java.util.stream.Stream;

public class Ejer23 {
    public static void main(String[] args) {
        List<String> lista = List.of("Hola", "Adios", "Buenos dias", "Buenas noches", "Hasta luego", "Hasta mañana");

        Long listaFiltrada = lista.stream().map(s -> s.split(" ")).flatMap(s -> Stream.of(s)).count();

        System.out.println(listaFiltrada);


        List<String> listaFiltrada2 = lista.stream().map(s -> s.split(" ")).flatMap(s -> Stream.of(s)).toList();

        System.out.println(listaFiltrada2.stream().count());
    }
}
