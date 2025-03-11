import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejer30 {
    public static void main(String[] args) {

        List<String> lista = List.of("Jose", "Sara", "Jesus", "Marcos", "Luis", "Ana", "Maria", "Juan", "Pedro", "Pablo");

        Map<Character,List<String>> mapa = lista.stream().collect(Collectors.groupingBy(nombre -> nombre.charAt(0)));
        Map<String,List<String>> mapa2 = lista.stream().collect(Collectors.groupingBy(nombre -> nombre.substring(0,1)));
        Map<Integer,List<String>> mapa3 = lista.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer,List<String>> mapa4 = lista.stream().collect(Collectors.groupingBy(nombre -> nombre.length()));

        System.out.println(mapa);
        System.out.println(mapa2);
        System.out.println(mapa3);
        System.out.println(mapa4);
    }
}
