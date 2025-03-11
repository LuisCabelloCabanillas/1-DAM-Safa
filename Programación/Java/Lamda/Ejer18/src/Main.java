import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Luis");
        lista.add("Maria");
        lista.add("Ana");

        lista.forEach(System.out::println);
    }
}
