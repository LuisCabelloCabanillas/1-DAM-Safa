import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Act10_3 {
    public static void main(String[] args) {
        ArrayList<Act10_3> personas = new ArrayList<Act10_3>();
        personas.add(new Act10_3("Jose", 20));
        personas.add(new Act10_3("Julie", 25));
        personas.add(new Act10_3("Julio", 30));
        personas.add(new Act10_3("Mateo", 10));
        personas.add(new Act10_3("Marco", 16));

        personas.sort(new Comparator<Act10_3>() {
            public int compare(Act10_3 o1, Act10_3 o2) {
                return o1.getEdad().compareTo(o2.getEdad());
            }
        });

        System.out.println("Las personas ordenadas por edad: ");
        for (Act10_3 persona : personas) {
            System.out.println(persona);
        }
    }

    private String nombre;
    private Integer edad;

    public Act10_3(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getEdad() {
        return edad;
    }

    public String toString() {
        return "Nombre: " + getNombre() + ", Edad: " + getEdad();
    }
}
