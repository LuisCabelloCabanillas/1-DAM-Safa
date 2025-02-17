import java.util.HashMap;
import java.util.Map;

public class Act12_3 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe",21);
        Persona p2 = new Persona("Diego",19);
        Persona p3 = new Persona("Andre",22);

        Map<Integer,Persona> mapa = new HashMap();
        mapa.put(1,p1);
        mapa.put(2,p2);
        mapa.put(3,p3);

        System.out.println(mapa);
    }
}
