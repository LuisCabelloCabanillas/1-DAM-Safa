public class Act1_3 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Números impares del array:");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }
}
