package modelos;

import java.util.Objects;

public class Provincia {
    private String nombre;
    private String codigo;

    public Provincia() {}
    public Provincia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    public Provincia(Provincia p) {
        this.nombre = p.nombre;
        this.codigo = p.codigo;
    }

    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    @Override
    public String toString() { return nombre + " (" + codigo + ")"; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Provincia provincia = (Provincia) o;
        return Objects.equals(nombre, provincia.nombre) && Objects.equals(codigo, provincia.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo);
    }
}
