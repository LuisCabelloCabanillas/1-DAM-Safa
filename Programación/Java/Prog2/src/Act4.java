public class Act4 {
    public static void main(String[] args) {
        int a = 2;
        if (a>0) {
            System.out.println(a + " es un número positivo");
        } else if (a<0) {
            System.out.println(a + " es un numero negativo");
        }else
            System.out.println(a + " es 0");

        for (int b=0;b<10;b++) {
            System.out.println(b);
        }
        /*Modifica el programa para que use un bucle while en lugar de for.*/
        int c=0;
        while (c < 10) {
            System.out.println(c);
            c++;
        }
    }
}
