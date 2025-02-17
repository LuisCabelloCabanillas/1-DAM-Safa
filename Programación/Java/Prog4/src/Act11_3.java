import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Act11_3 {
    private String nombre;
    private Integer edad;

    public Act11_3(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getEdad() {
        return edad;
    }

    public static int compararPorNombre(Act11_3 p1, Act11_3 p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }

    public String toString() {
        return "Nombre: " + getNombre() + ", Edad: " + getEdad();
    }

    public static void main(String[] args) {
        ArrayList<Act11_3> personas = new ArrayList<Act11_3>();
        personas.add(new Act11_3("Jose", 20));
        personas.add(new Act11_3("Julie", 25));
        personas.add(new Act11_3("Julio", 30));
        personas.add(new Act11_3("Mateo", 10));
        personas.add(new Act11_3("Marco", 16));

        Scanner sc = new Scanner(System.in);
        String nombreBuscado = sc.nextLine();

        boolean encontrado = false;
        for (Act11_3 p : personas) {
            if (p.getNombre().equals(nombreBuscado)) {
                System.out.println("Persona encontrado " + p.getNombre());
                encontrado = true;
                break;
            }
        }
    }
}
