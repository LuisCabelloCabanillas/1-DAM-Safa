interface Operacion {
    int calcular(int a, int b);
}

public class Multiplicacion {

    public static void main(String[] args) {
        Operacion multiplicacion = (a, b) -> a * b ;
        System.out.println(multiplicacion.calcular(5, 10));
    }
}
