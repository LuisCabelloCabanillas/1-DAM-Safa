package com.safa.lcc;

import com.safa.lcc.UtilidadesExamen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static com.safa.lcc.UtilidadesExamen.saludoSegunHora;
import static com.safa.lcc.UtilidadesExamen.validaNombreJugador;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccion = 0;

        while (eleccion < 1 || eleccion > 5) {
            System.out.println("Seleccione un ejercicio (1-5):");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");

            if (scanner.hasNextInt()) {
                eleccion = scanner.nextInt();
                if (eleccion < 1 || eleccion > 5) {
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next();
            }
        }

        switch (eleccion) {
            case 1:
                System.out.println("Ejercicio 1");
                System.out.println(UtilidadesExamen.saludoSegunHora(new ArrayList<>()));
                System.out.println(UtilidadesExamen.saludoSegunHora(List.of("Juan")));
                System.out.println(UtilidadesExamen.saludoSegunHora(List.of("Juan", "Nati","Vanesa")));
                break;
            case 2:
                System.out.println("Ejercicio 2");
                String[] nombresJugadores = {
                        "Juan1",
                        "Luis",
                        "Marquinhod.",
                        "QWERTYUIOPASDFGH",
                        "Marquinhod_",
                        "Marqui.nhod"
                };
                for (String nombre: nombresJugadores)
                    System.out.println(nombre+ " " + validaNombreJugador(nombre));
                break;
            case 3:
                System.out.println("Ejercicio 3");
                Producto pro1 = new Producto("Televisor","(TV-23X53_R)","3","estoy muy contento con las nuevas funcionalidades de esta smart-TV");

                Producto pro2 = new Producto("Movil","(MO-23X53_R)","4.5","estoy muy contento con las nuevas funcionalidades de este smartphone");


                break;
            case 4:
                System.out.println("Ejercicio 4");

                break;
            case 5:
                System.out.println("Ejercicio 5");

                break;
        }
    }
}
