import modelos.*;
import utilidades.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PruebaV5 {
    public static void main(String[] args) {
        Direccion direccion = new Direccion(1, "Fresa", 1, "Particola", "41230", "Castilblanco", "Sevilla", Direccion.TipoVia.calle);

        Personas tomador = new Personas(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18);
        Personas tomador2 = new Personas(2, "LUIS", "Pérez", "Gómez", "12345677Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18);
        Personas tomador3 = new Personas(3, "JESÚS", "MANUEL", "Gómez", "87654321Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18);

        Conductor conductor = new Conductor(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18, LocalDate.of(2007, 5, 15), 8, 1);
        Conductor conductor2 = new Conductor(2, "LUIS", "Pérez", "Gómez", "12345677Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18, LocalDate.of(2007, 5, 15), 8, 1);
        Conductor conductor3 = new Conductor(3, "JESÚS", "MANUEL", "Gómez", "87654321Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18, LocalDate.of(2007, 5, 15), 8, 1);

        Vehiculo vehiculo = new Vehiculo(1,"Toyota", "Corolla", "1234ABC", LocalDate.of(2018, 1, 1), "Rojo", tomador, 2018);
        Vehiculo vehiculo2 = new Vehiculo(2,"Ford", "Focus", "0366DFX", LocalDate.of(2008, 1, 5), "Azul", tomador2, 2006);
        Vehiculo vehiculo3 = new Vehiculo(3,"Hyundai", "Civic", "3214DFX", LocalDate.of(2020, 12, 9), "Rojo", tomador3, 2020);

        Cotizacion cotizado = new Cotizacion();
        cotizado.setId(1);
        cotizado.setCodigo(1);
        cotizado.setFechaCotizacion(LocalDate.now());
        cotizado.setFechaInicio(LocalDate.now());
        cotizado.setVehiculo(new Vehiculo(vehiculo));
        cotizado.setTomador(tomador);
        cotizado.setConductorPrincipal(conductor);
        cotizado.setConductoresOcasionales(List.of(conductor));
        cotizado.setTieneAparcamientoPrivado(true);
        cotizado.setNumSini5(1);
        cotizado.setPrecioTERC(1.0);
        cotizado.setPrecioTAMP(1.0);
        cotizado.setPrecioTRIE(1.0);
        cotizado.setModalidadElegida(Cotizacion.Modalidad.TERC);

        Cotizacion cotizado2 = new Cotizacion();
        cotizado2.setId(2);
        cotizado2.setCodigo(2);
        cotizado2.setFechaCotizacion(LocalDate.now());
        cotizado2.setFechaInicio(LocalDate.now());
        cotizado2.setVehiculo(new Vehiculo(vehiculo2));
        cotizado2.setTomador(tomador2);
        cotizado2.setConductorPrincipal(conductor2);
        cotizado2.setConductoresOcasionales(List.of(conductor2));
        cotizado2.setTieneAparcamientoPrivado(false);
        cotizado2.setNumSini5(2);
        cotizado2.setPrecioTERC(0.5);
        cotizado2.setPrecioTAMP(0.9);
        cotizado2.setPrecioTRIE(1.0);
        cotizado2.setModalidadElegida(Cotizacion.Modalidad.TRIE);

        Cotizacion cotizado3 = new Cotizacion();
        cotizado3.setId(3);
        cotizado3.setCodigo(3);
        cotizado3.setFechaCotizacion(LocalDate.now());
        cotizado3.setFechaInicio(LocalDate.now());
        cotizado3.setVehiculo(new Vehiculo(vehiculo3));
        cotizado3.setTomador(tomador3);
        cotizado3.setConductorPrincipal(conductor3);
        cotizado3.setConductoresOcasionales(List.of(conductor3));
        cotizado3.setTieneAparcamientoPrivado(true);
        cotizado3.setNumSini5(0);
        cotizado3.setPrecioTERC(0.5);
        cotizado3.setPrecioTAMP(0.3);
        cotizado3.setPrecioTRIE(2);
        cotizado3.setModalidadElegida(Cotizacion.Modalidad.TAMP);


        AnualidadPoliza anualidad1 = new AnualidadPoliza(1, AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", new Cotizacion(), AnualidadPoliza.ModoPago.IBAN, false, 100.0, 100.0, LocalDate.now(), LocalDate.now().plusYears(1), null);
        anualidad1.setTomador(tomador);
        anualidad1.setConductorPrincipal(conductor);

        AnualidadPoliza anualidad2 = new AnualidadPoliza(2, AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", new Cotizacion(), AnualidadPoliza.ModoPago.IBAN, false, 100.0, 100.0, LocalDate.now(), LocalDate.now().plusYears(1), null);
        anualidad2.setTomador(tomador2);
        anualidad2.setConductorPrincipal(conductor2);

        AnualidadPoliza anualidad3 = new AnualidadPoliza(3, AnualidadPoliza.EstadoPoliza.ANULADA, "Motivo de anulación", new Cotizacion(), AnualidadPoliza.ModoPago.IBAN, false, 100.0, 100.0, LocalDate.now(), LocalDate.now().plusYears(1), LocalDate.now().plusMonths(6));
        anualidad3.setTomador(tomador3);
        anualidad3.setConductorPrincipal(conductor3);


        Poliza poliza1 = new Poliza(1, List.of(anualidad1), AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", cotizado);
        Poliza poliza2 = new Poliza(2, List.of(anualidad2), AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", cotizado2);
        Poliza poliza3 = new Poliza(3, List.of(anualidad3), AnualidadPoliza.EstadoPoliza.ANULADA, "Motivo de anulación", cotizado3);

        Aseguradora aseguradora = new Aseguradora(1, "Aseguradora LUS", direccion, "123456789", new ArrayList<>());
        aseguradora.addPoliza(poliza1);
        aseguradora.addPoliza(poliza2);
        aseguradora.addPoliza(poliza3);

        System.out.println("Recuperar Polizas Activas: " + UtilidadesAseguradora.recuperarPolizaActivas(aseguradora));
        System.out.println("Recuperar Polizas por Tomador: " + UtilidadesAseguradora.recuperarPolizaPorTomador(aseguradora, "12345678Z"));
        System.out.println("Recuperar Polizas por Conductor: " + UtilidadesAseguradora.recuperarPolizaPorConductor(aseguradora, "87654321Z"));

    }
}
