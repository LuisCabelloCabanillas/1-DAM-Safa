public class Main {
    public static void main(String[] args) {
        Operacion operacion = (a,b) -> System.out.println(a*b);
        operacion.ejecutar(5,10);
    }
}