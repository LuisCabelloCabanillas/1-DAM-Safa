public class Calculadora implements OperacionesMatematicas {
    private int resultado;

    public void sumar(int a, int b) {
        resultado = a + b;
    }

    public void restar(int a, int b) {
        resultado = a - b;
    }

    public int getResultado() {
        return resultado;
    }
}
