public class PruebaClase {
    static final String CADENA_DOS= "2";
    public static void main(String[] args) {
        char a = 'a';
        String b = String.valueOf(a);
        String numero= "23";
        Integer numero2 = Integer.parseInt(numero);
        Long numero3 = Long.parseLong(numero);
        Float numero4 = Float.parseFloat(numero);
        Double numero5 = Double.parseDouble(numero);

        String cadenaDeTextoQueSirveParaX = "";
        System.out.println(Constante.NUMERO_DOS);
        System.out.println(Constante.getSaludoPorDefecto());

        Personas pers1 = new Personas("Pepe","Pérez",43);

        Personas pers2 = new Personas("Pepa","López");
        pers2.setEdad(45);
        Personas pers3 = new Personas("Pepe","Pérez",23);
        Personas pers4 = new Hijo("Emilio","Pérez",23,pers1,pers2);

        System.out.println(pers1.getNombre()+ " "+ pers1.getApellido()+", "+ pers1.getEdad());
        System.out.println(pers2);

        if (pers1.equals(pers2)){
            System.out.println("pers1 == pers2");
        } else if (pers1.equals(pers3)){
                System.out.println("pers1 == pers3");
        }else
                System.out.println("pers1 != pers3");
        System.out.println("Impreme el número: " + numero2+args[0]+args[1]);

        System.out.println(pers4);
    }
    
    public static int calculaSuma(int a, int b) {
        return a + b;
    }
}
