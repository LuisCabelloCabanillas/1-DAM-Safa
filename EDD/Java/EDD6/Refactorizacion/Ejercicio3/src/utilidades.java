package documentacion;

import java.util.ArrayList;
import java.util.List;

public class utilidades {
    public static void main(String[] args) {
        Festividad festividad = new FestividadImpl("Abril", "Feria de Sevilla");
        Poblacion poblacion = new PoblacionImpl("Sevilla", 1945000, 140.8, 1000000, 152014, festividad);

        datosEmpresa("Manuel", poblacion);
        datosEmpresa("Rocio", poblacion);
    }


    public static void datosEmpresa(String cliente, Poblacion pob) {
        System.out.println("Datos del cliente\n=================");

        List<String> listaClientes = new ArrayList<>();
        listaClientes.add(cliente);

        System.out.println("Cliente: " + listaClientes);

        numHabitantesSevilla(pob);
    }

    private static void numHabitantesSevilla(Poblacion pob) {
        if (pob.getNombre().equals("Sevilla")) {
            System.out.println(pob.getNumHabitantes());
        }
    }

    /*
    * Extracción de metodo
    * Eliminación de código muerto y repeticiones
    * Tres rename en en la creacion de datos para mejorar la legibilidad
    */
}