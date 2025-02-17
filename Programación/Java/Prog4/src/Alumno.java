public class Alumno {
    private String nombre;
    private Integer nota;

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getNota() {
        return nota;
    }
    public void setNota(Integer edad) {
        this.nota = edad;
    }


    public String toString() {
        return getNombre() + " nota: " + getNota();
    }
}
