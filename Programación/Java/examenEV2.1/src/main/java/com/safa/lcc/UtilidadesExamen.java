package com.safa.lcc;

import com.examen.dam1.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;


public class UtilidadesExamen {
    public static String saludoSegunHora(List<String> listaNombres) {
        LocalTime horaActual = LocalTime.now();
        int horaExacta = horaActual.getHour();
        String Saludo;

        if (horaExacta >= 6 && horaExacta < 12) {
            Saludo= "Buenos días";
        } else if (horaExacta >= 12 && horaExacta < 18) {
            Saludo= "Buenas tardes";
        } else {
            Saludo = "Buenas noches";
        }
        String nombresUnidos = String.join(", ", listaNombres);
        return Saludo + ", " + nombresUnidos;
    }
    public static boolean validaNombreJugador(String nombre){
        String validacion = "^[A-Za-z][A-Za-z0-9._]{3,13}[A-Za-z0-9]$";
        return nombre.matches(validacion);
    }

    public static List<Autor> listAutoresVivos() {
        return SoporteHeroes.getInstance().getListaAutores().stream().filter(a -> a.getFechaDefuncion()== null).collect(Collectors.toList());
    }

    public static List<Obra> listObrasVivos(){
        List<Obra> obrasVivas = new ArrayList<>();
        return SoporteHeroes.getInstance().getListaObras().stream().filter(obra -> obra.getAutoria.stream()
                .allMatch(a -> a.getFechaDefuncion()== null)).collect(Collectors.toList());
    }

    public static List<Personaje> listPersonajesFemeninos(){
        List<Personaje> personajes = SoporteHeroes.getInstance().getListaPersonajes();
        Iterator<Personaje> iterado = personajes.iterator();
        while (iterado.hasNext()){
            if (iterado.next().getSexo() != Sexo.FEMENINO){
                iterado.remove();
            }
        }
        return personajes;
    }

    public static double getPorcentajeFemenino() {
        List<Personaje> personajes = SoporteHeroes.getInstance().getListaPersonajes();
        long total = personajes.size();
        long femeninos = personajes.stream().filter(Personaje::esFemenino).count();
        return total>0 ? (femeninos * 100.0/total):0;
    }
    public static void muestraNoHumanos(){
        List<Personaje> noHumanos = SoporteHeroes.getInstance().getListaPersonajes().stream()
                .filter( p -> p.getRaza()!= Raza.HUMANO).sorted(Comparator.comparing((Personaje p)-> p.getObra()
                        .getPrimeraPublicacion()).thenComparing(Personaje::getNombre)).collect(Collectors.toList());
        for (Personaje p : noHumanos){
            if (p.getNombreIdentidad()!= null){
                System.out.println(p.getNombreIdentidad()+ " ("+p.getNombre()+") - "+p.getObra().getNombre());
            }else{
                System.out.println(p.getNombre() + " - " +p.getObra().getNombre());
            }
        }
    }
}





















