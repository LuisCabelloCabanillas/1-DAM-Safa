import com.aseguradora.utils.SoporteVehiculos;
import com.aseguradora.utils.Tarifa;
import modelos.*;
import utilidades.UtilidadesMultiplicadores;

import java.time.LocalDate;

public class pruebaV4 {
    public static void main(String[] args) {
        /*System.out.println("Numero de poliza: " + AnualidadPoliza.generadorNumeroPoliza());*/
        /*System.out.println(AnualidadPoliza.formaDePago("anual"));*/
        /*Direccion direccion = new Direccion(1, "Fresa", 1, "Particola", "41230", "Castilblanco", "Sevilla", Direccion.TipoVia.calle );
        Personas persona = new Personas(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com","698538847",18);
        Personas tomador = new Personas(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com","698538847",18);

        Cotizacion cotizado= new Cotizacion();
        cotizado.setTomador(tomador);

        System.out.println();*/

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
