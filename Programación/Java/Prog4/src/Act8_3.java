import java.util.ArrayList;

public class Act8_3 {
    private String nombre;
    private Integer edad;

    public Act8_3(String nombre, Integer edad) {
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
        ArrayList<Act8_3> personas = new ArrayList<Act8_3>();
        personas.add(new Act8_3("Jose", 20));
        personas.add(new Act8_3("Julie", 25));
        personas.add(new Act8_3("Julio", 30));

        System.out.println("Las personas son: ");
        for (Act8_3 persona : personas) {
            System.out.println(persona);
        }
    }

}
