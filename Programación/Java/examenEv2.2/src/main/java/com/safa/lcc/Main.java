package com.safa.lcc;

import com.joey.utils.NombreRazaPerro;
import com.joey.utils.Opcion;
import com.joey.utils.SoporteJoey;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){

    }

    /*Ejercicio 1*/

    public static void muestraOpcionesOrdenadas(){
        SoporteJoey ayuda = SoporteJoey.getInstance();
        List<Opcion> opciones= ayuda.getOpciones();

        opciones.stream().filter(n -> n.getPrecio() <200 && n.getDistancia()<50).sorted(Comparator.comparing(Opcion::getPuntuacion).reversed().thenComparing(Opcion::getPrecio)).forEach(n ->System.out.println(">> Puntuación: " + n.getPuntuacion() +"\n" + n));
    }

    /*Ejercicio 2*/

    /*
    public static Map<Integer,List<String>> creaMapaOpciones(){
        SoporteJoey ayuda = SoporteJoey.getInstance();
        List<Opcion> opciones= ayuda.getOpciones();

        return opciones.stream().collect(Collectors.groupingBy(String::getPuntuacion));
    }
    */

    /*Ejercicio 3*/

    public static boolean esDocumentoValido(String nombreDocumento){
        String expresion = "(Ley|Decreto|Reglamento|Orden) ([1-9]\\d{0,4})/(19[7-9]\\d|20\\d{2})( de .+)?$";
        Pattern patron = Pattern.compile(expresion);
        Matcher matcher = patron.matcher(nombreDocumento);
        return  matcher.matches();

    }

    /*Ejercicio 4*/
    List<PerroDeJose> perrosDeJose = Arrays.asList(
            new PerroDeJose("Cala",SoporteJoey.getInstance().getRazaPerroByName(NombreRazaPerro.MASTIN),null),
            new PerroDeJose("Chuli",SoporteJoey.getInstance().getRazaPerroByName(NombreRazaPerro.BEAGLE),null),
            new PerroDeJose("Lila",SoporteJoey.getInstance().getRazaPerroByName(NombreRazaPerro.YORKSHIRE_TERRIER),null)
    );

}
