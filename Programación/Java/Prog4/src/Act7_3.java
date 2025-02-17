import java.util.ArrayList;
import java.util.HashMap;

public class Act7_3 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("mundo");
        palabras.add("hola");
        palabras.add("java");
        palabras.add("mundo");
        palabras.add("hola");

        HashMap<String, Integer> conteo = new HashMap<>();
        for (String palabra : palabras) {
            conteo.put(palabra, conteo.getOrDefault(palabra, 0) + 1);
        }

        System.out.println("Conteo de palabras:");
        for (String palabra : conteo.keySet()) {
            System.out.println(palabra + ": " + conteo.get(palabra));
        }
    }
}
