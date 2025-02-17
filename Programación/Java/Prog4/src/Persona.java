public class Persona implements Comparable{
    public int compareTo(Object o) {
        return getEdad()-((Persona)o).getEdad();
    }
    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
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
