import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Act15_3 {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Ángela",8);
        Alumno a2 = new Alumno("Diego",7);
        Alumno a3 = new Alumno("Aarón",9);
        Alumno a4 = new Alumno("Eva",9);
        Alumno a5 = new Alumno("Rita",10);
        Alumno a6 = new Alumno("Desiderio",6);
        Alumno a7 = new Alumno("Paca",7);
        Alumno a8 = new Alumno("Pepa",9);

        List<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(a1);alumnos.add(a2);alumnos.add(a3);alumnos.add(a4);
        alumnos.add(a5);alumnos.add(a6);alumnos.add(a7);alumnos.add(a8);
        Map<Integer, List<String>> mapa = new TreeMap();

        for (Alumno a : alumnos) {
           List<String> listaAlumnos = (List<String>) mapa.get(a.getNota());
           if (listaAlumnos == null) {
               listaAlumnos = new ArrayList<>();
           }
           listaAlumnos.add(a.getNombre());
           mapa.put(a.getNota(), listaAlumnos);
        }
        System.out.println(mapa);
    }
}
