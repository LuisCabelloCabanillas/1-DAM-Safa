package utilidades;

import modelos.Personas;

import java.time.LocalDate;
import java.time.Period;

public class UtilidadesPersona {
    public static boolean esNIFValido(String nif) {
        if (nif == null || nif.length() != 9) {
            return false;
        }
        
        char letraini= nif.charAt(0);
        String num;

        if (Character.isDigit(letraini)) {
           num = nif.substring(0, 8);
        } else if (letraini == 'X' || letraini == 'Y' || letraini == 'Z') {
            num = (letraini == 'X' ? "0" : letraini == 'Y' ? "1" : "2") + nif.substring(1, 8);
        } else {
            return false;
        }

        char letra = nif.charAt(8);

        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(num.charAt(i))) {
                return false;
            }
        }

        if (!Character.isLetter(letra)) {
            return false;
        }

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numero = Integer.parseInt(num);
        char letraCalculada = letras.charAt(numero%23);
        return Character.toUpperCase(letra) == letraCalculada;

    }

    public static boolean esNIFValido(Personas persona) {
        if (persona == null || persona.getNif() == null || persona.getNif().length() != 9) {
            return false;
        }
        return esNIFValido(persona.getNif());
    }

    public static int getEdad(Personas persona) {
        LocalDate fecha = LocalDate.now();
        LocalDate fechaNacimiento = persona.getFechaNacimiento();
        return Period.between(fechaNacimiento,fecha).getYears();
    }

    public static boolean esMayorEdad(Personas persona) {
        LocalDate fecha = LocalDate.now();
        LocalDate fechaNacimiento = persona.getFechaNacimiento();

        return Period.between(fechaNacimiento,fecha).getYears()>=18;
    }

    public static boolean esMenor25(Personas persona) {
        LocalDate fecha = LocalDate.now();
        LocalDate fechaNacimiento = persona.getFechaNacimiento();

        return Period.between(fechaNacimiento,fecha).getYears()>=18 && Period.between(fechaNacimiento,fecha).getYears()<25;
    }

}
