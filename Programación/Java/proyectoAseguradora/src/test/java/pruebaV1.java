import com.aseguradora.utils.Marca;
import modelos.*;
import utilidades.UtilidadesPersona;

import java.time.LocalDate;

public class pruebaV1 {
    public static void main(String[] args) {
        Direccion direccion = new Direccion(1, "Fresa", 1, "Particola", "41230", "Castilblanco", "Sevilla", Direccion.TipoVia.calle );
        System.out.println(direccion.getId());
        Personas persona = new Personas(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com","698538847",18);
        System.out.println(persona.getNombre());
        Conductor conductor = new Conductor(2, "Luis", "Martínez", "López", "87654321B", LocalDate.of(1985, 8, 20), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com","698538847",21, LocalDate.of(2005, 6, 10), 12, 5);
        System.out.println(conductor.getFechaCarnet());
        Coche coche = new Coche(1,"Ford", "Focus", "1234ABC", LocalDate.of(2015, 3, 10), "Rojo", persona, 2000, 5, false, Coche.TipoCombustible.gasolina, Coche.Traccion.delantera);
        System.out.println(coche.getTraccion());
        Moto moto = new Moto(2, "Yamaha", "YZF-R1", "5678DEF", LocalDate.of(2018, 7, 22), "Azul", persona,2012, 1000, false);
        System.out.println(moto.getCilindradaCC());
    }
}
