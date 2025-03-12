import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionEjer {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        Function<Integer, String> convertirLetra = num -> switch (num) {
            case 1 -> "uno";
            case 2 -> "dos";
            case 3 -> "tres";
            case 4 -> "cuatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "siete";
            case 8 -> "ocho";
            case 9 -> "nueve";
            case 10 -> "diez";
            default -> "no se puede convertir";
        };

        List<String> numerosLetras = new ArrayList<>();
        for (Integer num : numeros) {
            numerosLetras.add(convertirLetra.apply(num));
        }
        System.out.println(numerosLetras);
        }
}
