package modelos;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Cotizacion {
    private int id;
    private int codigo;
    private LocalDate fechaCotizacion;
    private LocalDate fechaInicio;
    private Vehiculo vehiculo;
    private Personas tomador;
    private Conductor conductorPrincipal;
    private List<Conductor> conductoresOcasionales;
    private boolean tieneAparcamientoPrivado;
    private int numSini5;
    private double precioTERC;
    private double precioTAMP;
    private double precioTRIE;
    private Modalidad modalidadElegida;

    public enum Modalidad {
        TERC, TAMP, TRIE
    }

    public Cotizacion(int id, int codigo, LocalDate fechaCotizacion, LocalDate fechaInicio, Vehiculo vehiculo,
                      Personas tomador, Conductor conductorPrincipal, List<Conductor> conductoresOcasionales,
                      boolean tieneAparcamientoPrivado, int numSini5, double precioTERC, double precioTAMP, double precioTRIE,
                      Modalidad modalidadElegida) {
        this.id = id;
        this.codigo = codigo;
        this.fechaCotizacion = LocalDate.now();
        this.fechaInicio = fechaInicio;
        this.vehiculo = vehiculo;
        this.tomador = tomador;
        this.conductorPrincipal = conductorPrincipal;
        this.conductoresOcasionales = conductoresOcasionales;
        this.tieneAparcamientoPrivado = tieneAparcamientoPrivado;
        this.numSini5 = numSini5;
        this.precioTERC = precioTERC;
        this.precioTAMP = precioTAMP;
        this.precioTRIE = precioTRIE;
        this.modalidadElegida = modalidadElegida;
    }

    public Cotizacion(Cotizacion cotizado){
        this.id = cotizado.id;
        this.codigo = cotizado.codigo;
        this.fechaCotizacion = cotizado.fechaCotizacion;
        this.fechaInicio = cotizado.fechaInicio;
        this.vehiculo = cotizado.vehiculo;
        this.tomador = cotizado.tomador;
        this.conductorPrincipal = cotizado.conductorPrincipal;
        this.conductoresOcasionales = cotizado.conductoresOcasionales;
        this.tieneAparcamientoPrivado = cotizado.tieneAparcamientoPrivado;
        this.numSini5 = cotizado.numSini5;
        this.precioTERC = cotizado.precioTERC;
        this.precioTAMP = cotizado.precioTAMP;
        this.precioTRIE = cotizado.precioTRIE;
        this.modalidadElegida = cotizado.modalidadElegida;
    }

    public Cotizacion(){
        id = 1;
        codigo = 1;
        fechaCotizacion = LocalDate.now();
        fechaInicio = LocalDate.now();
        vehiculo = new Vehiculo();
        tomador = new Personas();
        conductorPrincipal = new Conductor();
        conductoresOcasionales = List.of(new Conductor());
        tieneAparcamientoPrivado = true;
        numSini5 = 1;
        precioTERC = 1.0;
        precioTAMP = 1.0;
        precioTRIE = 1.0;
        modalidadElegida = Modalidad.TERC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaCotizacion() {
        return fechaCotizacion;
    }

    public void setFechaCotizacion(LocalDate fechaCotizacion) {
        this.fechaCotizacion = fechaCotizacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
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

    public boolean isTieneAparcamientoPrivado() {
        return tieneAparcamientoPrivado;
    }

    public void setTieneAparcamientoPrivado(boolean tieneAparcamientoPrivado) {
        this.tieneAparcamientoPrivado = tieneAparcamientoPrivado;
    }

    public int getNumSini5() {
        return numSini5;
    }

    public void setNumSini5(int numSini5) {
        this.numSini5 = numSini5;
    }

    public double getPrecioTERC() {
        return precioTERC;
    }

    public void setPrecioTERC(double precioTERC) {
        this.precioTERC = precioTERC;
    }

    public double getPrecioTAMP() {
        return precioTAMP;
    }

    public void setPrecioTAMP(double precioTAMP) {
        this.precioTAMP = precioTAMP;
    }

    public double getPrecioTRIE() {
        return precioTRIE;
    }

    public void setPrecioTRIE(double precioTRIE) {
        this.precioTRIE = precioTRIE;
    }

    public Modalidad getModalidadElegida() {
        return modalidadElegida;
    }

    public void setModalidadElegida(Modalidad modalidadElegida) {
        this.modalidadElegida = modalidadElegida;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cotizacion that = (Cotizacion) o;
        return id == that.id && codigo == that.codigo && tieneAparcamientoPrivado == that.tieneAparcamientoPrivado && numSini5 == that.numSini5 && Double.compare(precioTERC, that.precioTERC) == 0 && Double.compare(precioTAMP, that.precioTAMP) == 0 && Double.compare(precioTRIE, that.precioTRIE) == 0 && Objects.equals(fechaCotizacion, that.fechaCotizacion) && Objects.equals(fechaInicio, that.fechaInicio) && Objects.equals(vehiculo, that.vehiculo) && Objects.equals(tomador, that.tomador) && Objects.equals(conductorPrincipal, that.conductorPrincipal) && Objects.equals(conductoresOcasionales, that.conductoresOcasionales) && modalidadElegida == that.modalidadElegida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, fechaCotizacion, fechaInicio, vehiculo, tomador, conductorPrincipal, conductoresOcasionales, tieneAparcamientoPrivado, numSini5, precioTERC, precioTAMP, precioTRIE, modalidadElegida);
    }

    @Override
    public String toString() {
        return "Cotizacion{" +
                "id=" + id +
                ", codigo=" + codigo +
                ", fechaCotizacion=" + fechaCotizacion +
                ", fechaInicio=" + fechaInicio +
                ", vehiculo=" + vehiculo +
                ", tomador=" + tomador +
                ", conductorPrincipal=" + conductorPrincipal +
                ", conductoresOcasionales=" + conductoresOcasionales +
                ", tieneAparcamientoPrivado=" + tieneAparcamientoPrivado +
                ", numSini5=" + numSini5 +
                ", precioTERC=" + precioTERC +
                ", precioTAMP=" + precioTAMP +
                ", precioTRIE=" + precioTRIE +
                ", modalidadElegida=" + modalidadElegida +
                '}';
    }
}
