package utilidades;

import modelos.Personas;
import modelos.Vehiculo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class UtilidadesVehiculo {
    public static int calculaEdad(Vehiculo vehiculo) {
        LocalDate fecha = LocalDate.now();
        LocalDate fechaInicio = vehiculo.getFechaMatriculacion();
        return Period.between(fechaInicio, fecha).getYears();
    }

    public static boolean validaFechaMatriculacion(LocalDate fecha){
        LocalDate fechaI = LocalDate.now();
        return fechaI.isAfter(fecha);
    }

    public static boolean esMatriculaValida(String mat) {
        if (mat == null || mat.length() < 7) {
            return false;
        }

        if (mat.length() == 7) {
            String numeros = mat.substring(0, 4);
            String letras = mat.substring(4, 7);
            String letrasInvalidas = "AEIOUÑQ";

            for (char c : numeros.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }

            for (char c : letras.toCharArray()) {
                if (!Character.isLetter(c) || letrasInvalidas.indexOf(c) != -1) {
                    return false;
                }
            }

            return true;
        }

        if (mat.length() == 8) {
            String siglas = mat.substring(0, 3);
            String numeros = mat.substring(3, 7);
            char ultimaLetra = mat.charAt(7);

            for (char c : siglas.toCharArray()) {
                if (!Character.isLetter(c)) {
                    return false;
                }
            }

            for (char c : numeros.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return Character.isLetter(ultimaLetra);
        }

        return false;
    }

    public static boolean esMatriculaValida(Vehiculo veh) {
        if (veh == null || veh.getMatricula() == null) {
            return false;
        }
        return esMatriculaValida(veh.getMatricula());
    }

    public static List<Vehiculo> getVehiculos(List<Vehiculo> vehiculos, Personas persona) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v.getDuenyoActual().equals(persona)) {
                resultado.add(v);
            }
        }
        return resultado;
    }
}
