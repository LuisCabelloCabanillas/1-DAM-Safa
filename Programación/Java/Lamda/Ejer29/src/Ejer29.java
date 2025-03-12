import java.util.List;
import java.util.stream.Collectors;

public class Ejer29 {
    public static void main(String[] args) {
        List<Persona> personas = List.of(
                new Persona("Juan", 25),
                new Persona("Pedro", 30),
                new Persona("Luis", 20)
        );

        List<String> nombres = personas.stream()
                .map(Persona::getNombre)
                .collect(Collectors.toList());

        System.out.println(nombres);
    }
}
