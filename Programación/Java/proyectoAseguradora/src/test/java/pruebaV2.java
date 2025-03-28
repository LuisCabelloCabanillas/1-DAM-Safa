import com.aseguradora.utils.Marca;
import utilidades.UtilidadesPersona;
import modelos.*;
import utilidades.UtilidadesVehiculo;
import com.aseguradora.utils.*;
import java.time.LocalDate;

public class pruebaV2 {
    public static void main(String[] args) {
        Direccion direccion = new Direccion(1, "Fresa", 1, "Particola", "41230", "Castilblanco", "Sevilla", Direccion.TipoVia.calle );
        Personas persona = new Personas(1, "Juan", "Pérez", "Gómez", "12345678Z", LocalDate.of(2007, 5, 15), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com","698538847",18);
        Conductor conductor = new Conductor(2, "Luis", "Martínez", "López", "87654321B", LocalDate.of(1985, 8, 20), direccion, Personas.Sexo.MASCULINO, "España", "assdas@gmail.com","698538847",21, LocalDate.of(2005, 6, 10), 12, 5);
        Coche coche = new Coche(1, "Toyota", "Corolla", "1234ABC", LocalDate.of(2015, 3, 10), "Rojo", persona, 1999, 5, false, Coche.TipoCombustible.gasolina, Coche.Traccion.delantera);
        Moto moto = new Moto(2, "Yamaha", "YZF-R1", "5678DEF", LocalDate.of(2018, 7, 22), "Azul", persona, 1000, 100, false);
        Vehiculo vehiculo = new Vehiculo(1,"Ford" ,"Focus","0366DFX",LocalDate.of(2004,12,21),"Azul",null, 1998);

        System.out.println("El NIF es: ");
        System.out.println(UtilidadesPersona.esNIFValido("47563665X"));
        System.out.println(UtilidadesPersona.esNIFValido("X1234567L"));
        System.out.println(UtilidadesPersona.esNIFValido(persona));

        System.out.println("La edad de la persona es: " + UtilidadesPersona.getEdad(persona));

        System.out.println("¿La persona es mayor de edad? " + UtilidadesPersona.esMayorEdad(persona));

        System.out.println("¿La persona es mayor de edad y tiene menos de 25 años? " + UtilidadesPersona.esMenor25(persona));

        System.out.println(UtilidadesVehiculo.calculaEdad(vehiculo));

        System.out.println(UtilidadesVehiculo.validaFechaMatriculacion(LocalDate.of(2025,2,4)));

        System.out.println(UtilidadesVehiculo.esMatriculaValida(vehiculo));
        System.out.println(UtilidadesVehiculo.esMatriculaValida("0366DFF"));
    }
}
