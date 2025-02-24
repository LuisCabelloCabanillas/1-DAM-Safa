import modelos.*;
import utilidades.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PruebaV5 {
    public static void main(String[] args) {
        Direccion direccion = new Direccion(1, "Fresa", 1, "Particola", "41230", "Castilblanco", "Sevilla", Direccion.TipoVia.calle);

        // Create a Personas instance for tomador
        Personas tomador = new Personas(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18);
        Personas tomador2 = new Personas(2, "LUIS", "Pérez", "Gómez", "12345677Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18);
        Personas tomador3 = new Personas(3, "JESÚS", "MANUEL", "Gómez", "87654321Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18);
        // Create a Conductor instance for conductor
        Conductor conductor = new Conductor(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18, LocalDate.of(2007, 5, 15), 8, 1);
        Conductor conductor2 = new Conductor(2, "LUIS", "Pérez", "Gómez", "12345677Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18, LocalDate.of(2007, 5, 15), 8, 1);
        Conductor conductor3 = new Conductor(3, "JESÚS", "MANUEL", "Gómez", "87654321Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18, LocalDate.of(2007, 5, 15), 8, 1);

        // Create three Poliza instances
        AnualidadPoliza anualidad1 = new AnualidadPoliza(1, AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", new Cotizacion(), AnualidadPoliza.ModoPago.IBAN, false, 100.0, 100.0, LocalDate.now(), LocalDate.now().plusYears(1), null);
        anualidad1.setTomador(tomador);
        anualidad1.setConductorPrincipal(conductor);

        AnualidadPoliza anualidad2 = new AnualidadPoliza(2, AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", new Cotizacion(), AnualidadPoliza.ModoPago.IBAN, false, 100.0, 100.0, LocalDate.now(), LocalDate.now().plusYears(1), null);
        anualidad2.setTomador(tomador2);
        anualidad2.setConductorPrincipal(conductor);

        AnualidadPoliza anualidad3 = new AnualidadPoliza(3, AnualidadPoliza.EstadoPoliza.ANULADA, "Motivo de anulación", new Cotizacion(), AnualidadPoliza.ModoPago.IBAN, false, 100.0, 100.0, LocalDate.now(), LocalDate.now().plusYears(1), LocalDate.now().plusMonths(6));
        anualidad3.setTomador(tomador3);
        anualidad3.setConductorPrincipal(conductor3);

        Poliza poliza1 = new Poliza(1, List.of(anualidad1), AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", new Cotizacion());
        Poliza poliza2 = new Poliza(2, List.of(anualidad2), AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", new Cotizacion());
        Poliza poliza3 = new Poliza(3, List.of(anualidad3), AnualidadPoliza.EstadoPoliza.ANULADA, "Motivo de anulación", new Cotizacion());

        // Create an Aseguradora instance and add the polizas
        Aseguradora aseguradora = new Aseguradora(1, "Aseguradora XYZ", direccion, "123456789", new ArrayList<>());
        aseguradora.addPoliza(poliza1);
        aseguradora.addPoliza(poliza2);
        aseguradora.addPoliza(poliza3);

        // Test the methods in UtilidadesAseguradora

        System.out.println("Recuperar Poliza POL001: " + UtilidadesAseguradora.recuperarPoliza(aseguradora, 1));
        System.out.println("Recuperar Polizas Activas: " + UtilidadesAseguradora.recuperarPolizaActivas(aseguradora));
        System.out.println("Recuperar Polizas por Tomador: " + UtilidadesAseguradora.recuperarPolizaPorTomador(aseguradora, "12345678Z"));
        System.out.println("Recuperar Polizas por Conductor: " + UtilidadesAseguradora.recuperarPolizaPorConductor(aseguradora, "87654321Z"));

    }
}
