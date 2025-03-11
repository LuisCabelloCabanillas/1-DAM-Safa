import java.util.function.Function;

public class Calculadora {
    public static void main(String[] args) {
        Function<Integer, Integer> cuadrado = Calculadora::cuadrado;
        int resultado = cuadrado.apply(5);
        System.out.println(resultado);
    }

    static int cuadrado(int x) {
        return x * x;
    }
}
