import com.aseguradora.utils.SoporteVehiculos;
import com.aseguradora.utils.Tarifa;
import modelos.*;
import utilidades.UtilidadesMultiplicadores;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class pruebaV4 {
    public static void main(String[] args) {
        Direccion direccion = new Direccion(1, "Fresa", 1, "Particola", "41230", "Castilblanco", "Sevilla", Direccion.TipoVia.calle);
        Personas tomador = new Personas(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18);
        Conductor conductor = new Conductor(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com", "698538847", 18, LocalDate.of(2007, 5, 15), 8, 1);
        AnualidadPoliza anualidad1 = new AnualidadPoliza(1, AnualidadPoliza.EstadoPoliza.VIGENTE, "No aplica", new Cotizacion(), AnualidadPoliza.ModoPago.IBAN, true, 100.0, 110.0, LocalDate.now(), LocalDate.now().plusYears(1), null);
        anualidad1.setTomador(tomador);
        anualidad1.setConductorPrincipal(conductor);
        Poliza poliza1 = new Poliza(1, List.of(anualidad1), AnualidadPoliza.EstadoPoliza.VIGENTE, null, new Cotizacion());
        Aseguradora aseguradora = new Aseguradora(1, "Aseguradora LUS", direccion, "123456789", new ArrayList<>());
        aseguradora.addPoliza(poliza1);
        System.out.println("Poliza de la persona contratada: \n" + poliza1);


        System.out.println("Numero de poliza: " + AnualidadPoliza.generadorNumeroPoliza());

        Direccion direccion1 = new Direccion(1, "Fresa", 1, "Particola", "41230", "Castilblanco", "Sevilla", Direccion.TipoVia.calle );
        Personas persona = new Personas(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion1, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com","698538847",18);
        Personas tomador1 = new Personas(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion1, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com","698538847",18);

        Cotizacion cotizado= new Cotizacion();
        cotizado.setTomador(tomador);

        System.out.println();
        UtilidadesMultiplicadores utilidades = new UtilidadesMultiplicadores(SoporteVehiculos.getInstance());

        try {
            Tarifa tarifa = utilidades.calcularTarifaExtendida("Toyota", "Corolla", 2018, "41001", false, false, true, 2);
            System.out.println("Tarifa calculada:");
            System.out.println("Precio TERC: " + tarifa.getPrecioTERC());
            System.out.println("Precio TAMP: " + tarifa.getPrecioTAMP());
            System.out.println("Precio TRIE: " + tarifa.getPrecioTRIE());
            System.out.println(tarifa);
        } catch (IllegalArgumentException e) {
            System.err.println("Error al calcular la tarifa: " + e.getMessage());
        }
    }
}