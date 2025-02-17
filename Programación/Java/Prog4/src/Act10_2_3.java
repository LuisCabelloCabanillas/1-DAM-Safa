import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


public class Act10_2_3 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe",21);
        Persona p2 = new Persona("Diego",19);
        Persona p3 = new Persona("Andre",22);

        List<Persona> listapersonas = new ArrayList<Persona>();
        listapersonas.add(p1);
        listapersonas.add(p2);
        listapersonas.add(p3);

        Collections.sort(listapersonas);
        System.out.println(listapersonas);
    }
}
