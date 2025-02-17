public class Act5 {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int resultado = sumar(2, 6);
        System.out.println("La suma es: " + resultado);
        /*    if (esPar(resultado)) {
            System.out.println("El número " + resultado + " es par.");
        }else
            System.out.println("El numero " + resultado + " no es par.");
    */
        System.out.println("El numero " + resultado + " es " + (esPar(resultado)?"":"im")+"par");
    }


    public static boolean esPar(int a) {
        boolean salida = false;
        if (a % 2 == 0) {
            salida = true;
        } else {
            salida = false;
        }
        return salida;
    }
}
