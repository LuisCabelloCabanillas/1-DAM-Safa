import java.util.ArrayList;

public class Act9_3 {
    private String nombre;
    private Integer edad;

    public Act9_3(String nombre, Integer edad) {
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

    public static void main(String[] args) {
        ArrayList<Act9_3> personas = new ArrayList<Act9_3>();
        personas.add(new Act9_3("Jose", 20));
        personas.add(new Act9_3("Julie", 25));
        personas.add(new Act9_3("Julio", 30));
        personas.add(new Act9_3("Mateo", 10));
        personas.add(new Act9_3("Marco", 16));

        System.out.println("Las personas son: ");
        for (Act9_3 persona : personas) {
            if (persona.getEdad()>=18)
                System.out.println(persona);
        }
    }
}
