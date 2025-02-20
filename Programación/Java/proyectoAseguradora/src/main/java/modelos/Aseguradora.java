package modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aseguradora {
    private int id;
    private String nombre;
    private Direccion direccion;
    private String telefono;
    private List<Vehiculo> vehiculosAsegurados;
    private List<Poliza> listaPolizas;

    public Aseguradora(int id, String nombre, Direccion direccion,
                       String telefono, List<Vehiculo> vehiculosAsegurados) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.vehiculosAsegurados = vehiculosAsegurados;
        this.listaPolizas = new ArrayList<Poliza>();
    }

    public Aseguradora() {
        this.id = 0;
        this.nombre = "NO IDENTIFICADO";
        this.direccion = null;
        this.telefono = "NO IDENTIFICADO";
        this.vehiculosAsegurados = null;
    }

    public Aseguradora(Aseguradora aseguradora) {
        this.id = aseguradora.id;
        this.nombre = aseguradora.nombre;
        this.direccion = aseguradora.direccion;
        this.telefono = aseguradora.telefono;
        this.vehiculosAsegurados = new ArrayList<Vehiculo>();
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Vehiculo> getVehiculosAsegurados() {
        return vehiculosAsegurados;
    }

    public void setVehiculosAsegurados(List<Vehiculo> vehiculosAsegurados) {
        this.vehiculosAsegurados = vehiculosAsegurados;
    }

    public List<Poliza> getListaPolizas() {
        return listaPolizas;
    }
    public void setListaPolizas(List<Poliza> listaPolizas) {
        this.listaPolizas = listaPolizas;
    }

    public void addPoliza(Poliza poliza) {
        this.listaPolizas.add(poliza);
    }

    public void removePoliza(String poliza) {
        listaPolizas.removeIf(p -> p.getNumero().equals(poliza));
    }


    @Override
    public String toString() {
        return "Aseguradora{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                ", telefono='" + telefono + '\'' +
                ", vehiculosAsegurados=" + vehiculosAsegurados +
                ", listaPolizas=" + listaPolizas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aseguradora that = (Aseguradora) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(direccion, that.direccion) && Objects.equals(telefono, that.telefono) && Objects.equals(vehiculosAsegurados, that.vehiculosAsegurados) && Objects.equals(listaPolizas, that.listaPolizas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, direccion, telefono, vehiculosAsegurados);
    }
}
