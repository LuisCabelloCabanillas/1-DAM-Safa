package modelos;

import java.util.Objects;

public class Direccion {
    private int id;
    private TipoVia tipoVia;
    private String nombreVia;
    private int numeroVia;
    private String restoDireccion;
    private String codigoPostal;
    private String localidad;
    private String provincia;

    public enum TipoVia {
        calle, avenida, plaza, plazoleta, callejon
    }

    public Direccion(int id, String nombreVia, int numeroVia, String restoDireccion, String codigoPostal, String localidad, String provincia, TipoVia tipoVia) {
        this.id = id;
        this.nombreVia = nombreVia;
        this.numeroVia = numeroVia;
        this.restoDireccion = restoDireccion;
        this.codigoPostal = codigoPostal;
        this.tipoVia = tipoVia;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public Direccion(Direccion direccion){
        this.id = direccion.id;
        this.nombreVia = direccion.nombreVia;
        this.numeroVia = direccion.numeroVia;
        this.restoDireccion = direccion.restoDireccion;
        this.codigoPostal = direccion.codigoPostal;
        this.tipoVia = direccion.tipoVia;
        this.localidad = direccion.localidad;
        this.provincia = direccion.provincia;
    }

    public Direccion() {
        id = 1;
        nombreVia = "No identificado";
        tipoVia = TipoVia.calle;
        numeroVia = 0;
        restoDireccion = "No identificado";
        codigoPostal = "No identificado";
        localidad = "No identificado";
        provincia = "No identificado";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public int getNumeroVia() {
        return numeroVia;
    }

    public void setNumeroVia(int numeroVia) {
        this.numeroVia = numeroVia;
    }

    public String getRestoDireccion() {
        return restoDireccion;
    }

    public void setRestoDireccion(String restoDireccion) {
        this.restoDireccion = restoDireccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public TipoVia getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(TipoVia tipoVia) {
        this.tipoVia = tipoVia;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", tipoVia=" + tipoVia +
                ", nombreVia='" + nombreVia + '\'' +
                ", numeroVia=" + numeroVia +
                ", restoDireccion='" + restoDireccion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return id == direccion.id && numeroVia == direccion.numeroVia && tipoVia == direccion.tipoVia && Objects.equals(nombreVia, direccion.nombreVia) && Objects.equals(restoDireccion, direccion.restoDireccion) && Objects.equals(codigoPostal, direccion.codigoPostal) && Objects.equals(localidad, direccion.localidad) && Objects.equals(provincia, direccion.provincia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoVia, nombreVia, numeroVia, restoDireccion, codigoPostal, localidad, provincia);
    }
}
