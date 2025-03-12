import java.util.List;
import java.util.stream.Collectors;

public class Ejer24 {
    public static void main(String[] args) {
        List<String> listaNombres = List.of("Juan", "Pedro", "Luis", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Lola", "Manuel","Juan", "Pedro", "Luis", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Lola", "Manuel");

        List<String> listaSinDupliEOrde = listaNombres.stream().distinct().sorted().collect(Collectors.toList());

        System.out.println(listaSinDupliEOrde);
    }
}
