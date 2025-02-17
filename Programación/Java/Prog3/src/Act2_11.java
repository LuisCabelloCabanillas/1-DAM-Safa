public class Act2_11 {
    public static void main(String[] args) {
        int numero =87378;
        int prueba = 7624312;
        System.out.println(prueba);
        if (prueba == invertirNumero(prueba)) {
            System.out.println("El numero es capicua");
        }else
            System.out.println("El numero no es capicua");
    }
    public static int invertirNumero(int a){
        int aux=a;
        int invertido=0;
        while(aux !=0){
            invertido= (10*invertido) + aux%10;
            aux=aux/10;
        }
        return invertido;
    }

}