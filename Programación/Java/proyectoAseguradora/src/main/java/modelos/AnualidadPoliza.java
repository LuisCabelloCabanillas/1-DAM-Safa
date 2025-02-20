package modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static jdk.jfr.internal.test.DeprecatedMethods.counter;

public class AnualidadPoliza {
    private int id;
    private String numero;
    private EstadoPoliza estadoPoliza;
    private String motivoAnulacion;
    private Cotizacion cotizacionBase;
    private ModoPago modoPago;
    private boolean esPagoFraccionado;
    private Personas tomador;
    private Conductor conductorPrincipal;
    private List<Conductor> conductoresOcasionales;
    private double precioModalidad;
    private double precioFinal;
    private LocalDate fechaInicioAnualidad;
    private LocalDate fechaFinAnualidad;
    private LocalDate fechaAnulacion;

    public enum EstadoPoliza { VIGENTE, ANULADA, VENCIDA }
    public enum ModoPago { IBAN, TARJETA }

    public AnualidadPoliza(int id, EstadoPoliza estadoPoliza,
                           String motivoAnulacion, Cotizacion cotizacionBase,
                           ModoPago modoPago, boolean esPagoFraccionado,
                           double precioModalidad, double precioFinal,
                           LocalDate fechaInicioAnualidad,
                           LocalDate fechaFinAnualidad, LocalDate fechaAnulacion) {
        this.id = id;
        this.numero = generadorNumeroPoliza();
        this.estadoPoliza = estadoPoliza;
        this.motivoAnulacion = motivoAnulacion;
        this.cotizacionBase = cotizacionBase;
        this.modoPago = modoPago;
        this.esPagoFraccionado = esPagoFraccionado;
        this.tomador = new Personas(cotizacionBase.getTomador());
        this.conductorPrincipal = new Conductor(cotizacionBase.getConductorPrincipal());
        this.conductoresOcasionales = new ArrayList<>(cotizacionBase.getConductoresOcasionales());
        this.precioModalidad = precioModalidad;
        this.precioFinal = precioFinal;
        this.fechaInicioAnualidad = fechaInicioAnualidad;
        this.fechaFinAnualidad = fechaFinAnualidad;
        this.fechaAnulacion = fechaAnulacion;
    }

    public AnualidadPoliza(){
        id = 1;
        numero = "123456";
        estadoPoliza = EstadoPoliza.VIGENTE;
        motivoAnulacion = "No aplica";
        cotizacionBase = new Cotizacion();
        modoPago = ModoPago.IBAN;
        esPagoFraccionado = false;
        tomador = new Personas();
        conductorPrincipal = new Conductor();
        conductoresOcasionales = List.of(new Conductor());
        precioModalidad = 100.0;
        precioFinal = 100.0;
        fechaInicioAnualidad = LocalDate.now();
        fechaFinAnualidad = LocalDate.now().plusYears(1);
        fechaAnulacion = LocalDate.now().plusDays(1);
    }

    public AnualidadPoliza(AnualidadPoliza polizaAnual){
        this.id = polizaAnual.id;
        this.numero = polizaAnual.numero;
        this.estadoPoliza = polizaAnual.estadoPoliza;
        this.motivoAnulacion = polizaAnual.motivoAnulacion;
        this.cotizacionBase = polizaAnual.cotizacionBase;
        this.modoPago = polizaAnual.modoPago;
        this.esPagoFraccionado = polizaAnual.esPagoFraccionado;
        this.tomador = polizaAnual.tomador;
        this.conductorPrincipal = polizaAnual.conductorPrincipal;
        this.conductoresOcasionales = polizaAnual.conductoresOcasionales;
        this.precioModalidad = polizaAnual.precioModalidad;
        this.precioFinal = polizaAnual.precioFinal;
        this.fechaInicioAnualidad = polizaAnual.fechaInicioAnualidad;
        this.fechaFinAnualidad = polizaAnual.fechaFinAnualidad;
        this.fechaAnulacion = polizaAnual.fechaAnulacion;
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

    public EstadoPoliza getEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(EstadoPoliza estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    public Cotizacion getCotizacionBase() {
        return cotizacionBase;
    }

    public void setCotizacionBase(Cotizacion cotizacionBase) {
        this.cotizacionBase = cotizacionBase;
    }

    public ModoPago getModoPago() {
        return modoPago;
    }

    public void setModoPago(ModoPago modoPago) {
        this.modoPago = modoPago;
    }

    public boolean isEsPagoFraccionado() {
        return esPagoFraccionado;
    }

    public void setEsPagoFraccionado(boolean esPagoFraccionado) {
        this.esPagoFraccionado = esPagoFraccionado;
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

    private static final AtomicInteger contador = new AtomicInteger(0);

    public static String generadorNumeroPoliza() {
        int contado = contador.incrementAndGet();
        String numero = "LUS/" + LocalDate.now().getYear() + "/" + String.format("%06d", contado);
        return numero;
    }

    public static String formaDePago(String formaPago) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que forma de pago desea?");
        String formaDePagar = scanner.nextLine();
        String resultado;
        if (formaDePagar.equals(formaPago)) {
            resultado = "El pago será de 200€";
        }else if (formaDePagar.equals("mensual")){
            resultado = "El pago será de " + (200/2)*1.1 +" € cada 6 meses";
        }
        else {
            resultado = "No se puede pagar de esa forma";
        }
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AnualidadPoliza that = (AnualidadPoliza) o;
        return id == that.id && esPagoFraccionado == that.esPagoFraccionado && Double.compare(precioModalidad, that.precioModalidad) == 0 &&
                Double.compare(precioFinal, that.precioFinal) == 0 && Objects.equals(numero, that.numero) && estadoPoliza == that.estadoPoliza &&
                Objects.equals(motivoAnulacion, that.motivoAnulacion) && Objects.equals(cotizacionBase, that.cotizacionBase) && modoPago == that.modoPago &&
                Objects.equals(tomador, that.tomador) && Objects.equals(conductorPrincipal, that.conductorPrincipal) &&
                Objects.equals(conductoresOcasionales, that.conductoresOcasionales) && Objects.equals(fechaInicioAnualidad,
                that.fechaInicioAnualidad) && Objects.equals(fechaFinAnualidad, that.fechaFinAnualidad) && Objects.equals(fechaAnulacion, that.fechaAnulacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, estadoPoliza, motivoAnulacion, cotizacionBase, modoPago, esPagoFraccionado, tomador, conductorPrincipal, conductoresOcasionales, precioModalidad, precioFinal, fechaInicioAnualidad, fechaFinAnualidad, fechaAnulacion);
    }

    @Override
    public String toString() {
        return "AnualidadPoliza{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", estadoPoliza=" + estadoPoliza +
                ", motivoAnulacion='" + motivoAnulacion + '\'' +
                ", cotizacionBase=" + cotizacionBase +
                ", modoPago=" + modoPago +
                ", esPagoFraccionado=" + esPagoFraccionado +
                ", tomador=" + tomador +
                ", conductorPrincipal=" + conductorPrincipal +
                ", conductoresOcasionales=" + conductoresOcasionales +
                ", precioModalidad=" + precioModalidad +
                ", precioFinal=" + precioFinal +
                ", fechaInicioAnualidad=" + fechaInicioAnualidad +
                ", fechaFinAnualidad=" + fechaFinAnualidad +
                ", fechaAnulacion=" + fechaAnulacion +
                '}';
    }
}
