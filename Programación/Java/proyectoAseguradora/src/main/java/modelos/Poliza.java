package modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Poliza {
    private int id;
    private String numero;
    private List<AnualidadPoliza> anualidades;
    private AnualidadPoliza.EstadoPoliza estadoPoliza;
    private String motivoAnulacion;
    private Cotizacion ultimaCotizacionBase;
    private Personas tomador;
    private Conductor conductorPrincipal;
    private List<Conductor> conductoresOcasionales;
    private double precioModalidad;
    private double precioFinal;
    private LocalDate fechaInicioAnualidad;
    private LocalDate fechaFinAnualidad;
    private LocalDate fechaAnulacion;

    public Poliza(int id, List<AnualidadPoliza> anualidades, AnualidadPoliza.EstadoPoliza estadoPoliza, String motivoAnulacion, Cotizacion ultimaCotizacionBase) {
        this.id = id;
        this.numero = anualidades.getFirst().getNumero();
        this.anualidades = anualidades;
        this.estadoPoliza = estadoPoliza;
        this.motivoAnulacion = motivoAnulacion;
        this.ultimaCotizacionBase = ultimaCotizacionBase;
        this.tomador = anualidades.getFirst().getTomador();
        this.conductorPrincipal = anualidades.getFirst().getConductorPrincipal();
        this.conductoresOcasionales = anualidades.getFirst().getConductoresOcasionales();
        this.precioModalidad = anualidades.getFirst().getPrecioModalidad();
        this.precioFinal = anualidades.getFirst().getPrecioFinal();
        this.fechaInicioAnualidad = anualidades.getFirst().getFechaInicioAnualidad();
        this.fechaFinAnualidad = anualidades.getFirst().getFechaFinAnualidad();
        this.fechaAnulacion = anualidades.getFirst().getFechaAnulacion();
    }

    public Poliza () {
        id = 1;
        numero = "123456";
        anualidades = new ArrayList<>();
        estadoPoliza = AnualidadPoliza.EstadoPoliza.VIGENTE;
        motivoAnulacion = "No aplica";
        ultimaCotizacionBase = new Cotizacion();
        tomador = new Personas();
        conductorPrincipal = new Conductor();
        conductoresOcasionales = new ArrayList<>();
        precioModalidad = 0.0;
        precioFinal = 0.0;
        fechaInicioAnualidad = LocalDate.now();
        fechaFinAnualidad = LocalDate.now();
        fechaAnulacion = LocalDate.now();
    }

    public Poliza (Poliza poliza) {
        this.id = poliza.id;
        this.numero = poliza.numero;
        this.anualidades = poliza.anualidades;
        this.estadoPoliza = poliza.estadoPoliza;
        this.motivoAnulacion = poliza.motivoAnulacion;
        this.ultimaCotizacionBase = poliza.ultimaCotizacionBase;
        this.tomador = poliza.tomador;
        this.conductorPrincipal = poliza.conductorPrincipal;
        this.conductoresOcasionales = poliza.conductoresOcasionales;
        this.precioModalidad = poliza.precioModalidad;
        this.precioFinal = poliza.precioFinal;
        this.fechaInicioAnualidad = poliza.fechaInicioAnualidad;
        this.fechaFinAnualidad = poliza.fechaFinAnualidad;
        this.fechaAnulacion = poliza.fechaAnulacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<AnualidadPoliza> getAnualidades() {
        return anualidades;
    }

    public void setAnualidades(List<AnualidadPoliza> anualidades) {
        this.anualidades = anualidades;
    }

    public AnualidadPoliza.EstadoPoliza getEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(AnualidadPoliza.EstadoPoliza estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    public Cotizacion getUltimaCotizacionBase() {
        return ultimaCotizacionBase;
    }

    public void setUltimaCotizacionBase(Cotizacion ultimaCotizacionBase) {
        this.ultimaCotizacionBase = ultimaCotizacionBase;
    }

    public Personas getTomador() {
        return tomador;
    }

    public void setTomador(Personas tomador) {
        this.tomador = tomador;
    }

    public Conductor getConductorPrincipal() {
        return conductorPrincipal;
    }

    public void setConductorPrincipal(Conductor conductorPrincipal) {
        this.conductorPrincipal = conductorPrincipal;
    }

    public List<Conductor> getConductoresOcasionales() {
        return conductoresOcasionales;
    }

    public void setConductoresOcasionales(List<Conductor> conductoresOcasionales) {
        this.conductoresOcasionales = conductoresOcasionales;
    }

    public double getPrecioModalidad() {
        return precioModalidad;
    }

    public void setPrecioModalidad(double precioModalidad) {
        this.precioModalidad = precioModalidad;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public LocalDate getFechaInicioAnualidad() {
        return fechaInicioAnualidad;
    }

    public void setFechaInicioAnualidad(LocalDate fechaInicioAnualidad) {
        this.fechaInicioAnualidad = fechaInicioAnualidad;
    }

    public LocalDate getFechaFinAnualidad() {
        return fechaFinAnualidad;
    }

    public void setFechaFinAnualidad(LocalDate fechaFinAnualidad) {
        this.fechaFinAnualidad = fechaFinAnualidad;
    }

    public LocalDate getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(LocalDate fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public static String estadoPoliza(Poliza poliza) {
        String estadopoliza;
        if (poliza.getEstadoPoliza() == AnualidadPoliza.EstadoPoliza.VIGENTE) {
            estadopoliza= "Vigente";
        } else if (poliza.getEstadoPoliza() == AnualidadPoliza.EstadoPoliza.ANULADA) {
            estadopoliza= "Anulada";
        } else {
            estadopoliza = "No aplica";
        }
        return estadopoliza;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Poliza poliza = (Poliza) o;
        return id == poliza.id && Double.compare(precioModalidad, poliza.precioModalidad) == 0 && Double.compare(precioFinal, poliza.precioFinal) == 0 && Objects.equals(numero, poliza.numero) && Objects.equals(anualidades, poliza.anualidades) && estadoPoliza == poliza.estadoPoliza && Objects.equals(motivoAnulacion, poliza.motivoAnulacion) && Objects.equals(ultimaCotizacionBase, poliza.ultimaCotizacionBase) && Objects.equals(tomador, poliza.tomador) && Objects.equals(conductorPrincipal, poliza.conductorPrincipal) && Objects.equals(conductoresOcasionales, poliza.conductoresOcasionales) && Objects.equals(fechaInicioAnualidad, poliza.fechaInicioAnualidad) && Objects.equals(fechaFinAnualidad, poliza.fechaFinAnualidad) && Objects.equals(fechaAnulacion, poliza.fechaAnulacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, anualidades, estadoPoliza, motivoAnulacion, ultimaCotizacionBase, tomador, conductorPrincipal, conductoresOcasionales, precioModalidad, precioFinal, fechaInicioAnualidad, fechaFinAnualidad, fechaAnulacion);
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "id=" + id +
                ", numero='" + numero + '\n' +
                ", anualidades=" + anualidades +'\n' +
                ", estadoPoliza=" + estadoPoliza +'\n' +
                ", motivoAnulacion='" + motivoAnulacion + '\n' +
                ", ultimaCotizacionBase=" + ultimaCotizacionBase +'\n' +
                ", tomador=" + tomador +'\n' +
                ", conductorPrincipal=" + conductorPrincipal.getNombre()+" "+conductorPrincipal.getApellido1()+ " " +conductorPrincipal.getApellido2() +'\n' +
                ", conductoresOcasionales=" + conductoresOcasionales +'\n' +
                ", precioModalidad=" + precioModalidad +'\n' +
                ", precioFinal=" + precioFinal +'\n' +
                ", fechaInicioAnualidad=" + fechaInicioAnualidad +'\n' +
                ", fechaFinAnualidad=" + fechaFinAnualidad +'\n' +
                ", fechaAnulacion=" + fechaAnulacion +'\n' +
                '}';
    }

}


