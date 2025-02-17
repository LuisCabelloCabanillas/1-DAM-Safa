import java.util.HashSet;
import java.util.Objects;

public class Producto {
    private int id;
    private String nombre;

    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int hashCode(){
        return Objects.hash(id);
    }

    public boolean equals(Object obj){
        if(this == obj) return true;{
            if(obj == null || getClass()!=obj.getClass()) return false;
            Producto producto = (Producto)obj;
            return id == producto.id;
        }
    }

    public String toString(){
        return "Producto{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
