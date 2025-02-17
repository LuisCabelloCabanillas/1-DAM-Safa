public class Act2_11_2 {
    public static void main(String[] args) {
        int prueba = 2112;
        String numeroStr =String.valueOf(prueba);
        StringBuilder sb=new StringBuilder(numeroStr);
        sb.reverse();
        String numeroStrInvert = sb.toString();
        System.out.println(numeroStr+" - "+ numeroStrInvert);
        String salida= "";
        salida=numeroStrInvert;

        for (char c : salida.toCharArray()) {
            salida=c + salida;
        }
        System.out.println(salida);

        String salida2= "";
        for (int i = 0; i <numeroStr.length(); i++) {
            salida2 = salida2 + numeroStr.charAt(i);
        }
    }
}
