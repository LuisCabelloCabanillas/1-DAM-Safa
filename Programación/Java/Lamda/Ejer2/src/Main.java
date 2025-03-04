public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.sumar(5, 3);
        System.out.println("5 + 3 = " + calc.getResultado());
        calc.restar(5, 3);
        System.out.println("5 - 3 = " + calc.getResultado());
    }
}
