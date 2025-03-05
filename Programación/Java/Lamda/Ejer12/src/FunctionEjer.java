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

        Function<Integer, String> convertirLetra = num -> switch (num) {
            case 1 -> "uno";
            case 2 -> "dos";
            case 3 -> "tres";
            case 4 -> "cuatro";
            case 5 -> "cinco";
            default -> "Numero no valido";
        };
        List<String> numerosLetras = new ArrayList<>();
        for (Integer num : numeros) {
            numerosLetras.add(convertirLetra.apply(num));
        }
        System.out.println(numerosLetras);
        }
}
