package modelos;
import java.time.LocalDate;
import java.util.List;

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

    public Cotizacion(int id, int codigo, LocalDate fechaCotizacion, LocalDate fechaInicio, Vehiculo vehiculo,
                      Personas tomador, Conductor conductorPrincipal, List<Conductor> conductoresOcasionales,
                      boolean tieneAparcamientoPrivado, int numSini5, double precioTERC, double precioTAMP, double precioTRIE,
                      Modalidad modalidadElegida) {
        this.id = id;
        this.codigo = codigo;
        this.fechaCotizacion = fechaCotizacion;
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

    public enum Modalidad {
        TERC, TAMP, TRIE
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
}
