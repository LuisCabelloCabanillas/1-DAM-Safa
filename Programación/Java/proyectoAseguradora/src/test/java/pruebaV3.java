import com.aseguradora.utils.*;
import modelos.*;
import utilidades.UtilidadesDireccion;

import java.time.LocalDate;


public class pruebaV3 {
    public static void main(String[] args) {
        try {
            Direccion direccion = new Direccion(1, "Fresa", 1, "Particola", "41230", "Castilblanco", "Sevilla", Direccion.TipoVia.calle );
            Personas persona = new Personas(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com","698538847",18);
            Conductor conductor = new Conductor(2, "Luis", "Martínez", "López", "87654321B", LocalDate.of(1985, 8, 20), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com","698538847",21, LocalDate.of(2005, 6, 10), 12, 5);
            Coche coche = new Coche(1, "Toyota", "Corolla", "1234ABC", LocalDate.of(2015, 3, 10), "Rojo", persona, 1999, 5, false, Coche.TipoCombustible.gasolina, Coche.Traccion.delantera);
            Moto moto = new Moto(2, "Yamaha", "YZF-R1", "5678DEF", LocalDate.of(2018, 7, 22), "Azul", persona, 1000, 100, false);
            Vehiculo vehiculo = new Vehiculo(1,"Ford" ,"Focus","0366DFX",LocalDate.of(2004,12,21),"Azul",null, 1998);
            Tarifa t = SoporteVehiculos.getInstance().calcularTarifa("Toyota", "Corolla", 2020);
            System.out.println("Tarifa generada: " + t);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        String cp = "41230";
        String provincia = "Sevilla";

        if (UtilidadesDireccion.esCPValido(cp, provincia)) {
            System.out.println("El código postal " + cp + " es válido para " + provincia);
        } else {
            System.out.println("El código postal " + cp + " NO es válido para " + provincia);
        }

        System.out.println(Personas.validarNIF("47563665X"));
        System.out.println(Conductor.puedeConducir(18));
    }
}
