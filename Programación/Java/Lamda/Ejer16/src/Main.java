import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas =Arrays.asList(
                new Persona("Juan", 25),
                new Persona("Luis",20),
                new Persona("Maria",30),
                new Persona("Ana", 18));

        personas.sort(Comparator.comparing(Persona::getEdad));
        personas.forEach(p -> System.out.println(p.getNombre() + " " + p.getEdad()));
    }
}
