public class Main3D {
    public static void main(String[] args) {
        puntos3DImpl punto1 = new puntos3DImpl(2.0,3.0,1.0);
        puntos3DImpl punto2 = new puntos3DImpl(1.0,2.0,3.0);
        System.out.println(punto1);
        System.out.println(punto2);
        System.out.println(punto1.calcularDistancia(punto2));

        SegmentoImpl s1 = new SegmentoImpl(punto1, punto2);
        System.out.println(s1);
        System.out.println(s1.longitud());
    }
}