import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Biblioteca {
    private String nombre;
    private String ubicacion;
    private List<Libro> libros;

    public Biblioteca(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.libros = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public List<Libro> getLibros() {
        return libros;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }
    public void eliminarLibro(int id) {
        this.libros.removeIf(libro -> libro.getId() == id);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Centro","Madrid");

        Libro libro1 = new Libro(1,"El principito","Antoine de Saint-Exupéry", LocalDate.of(1943,4,6 ) ,"Novela");
        Libro libro2 = new Libro(2, "Cien años de soledad", "Gabriel García Márquez", LocalDate.of(1967, 6, 5), "Novela");
        Libro libro3 = new Libro(3, "La casa de los espíritus", "Isabel Allende", LocalDate.of(1982, 5, 8), "Ficción");
        Libro libro4 = new Libro(4, "1984", "George Orwell", LocalDate.of(1949, 6, 8), "Ciencia Ficción");
        Libro libro5 = new Libro(5, "Fahrenheit 451", "Ray Bradbury", LocalDate.of(1953, 10, 19), "Ciencia Ficción");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);

        ListIterator<Libro> it = biblioteca.libros.listIterator();

        while (it.hasNext()) {
            Libro libro = it.next();
            if (libro.getGenero().equals("Novela")) {
                System.out.println(libro);
            }
        }
        System.out.println(biblioteca.libros.toString());

    }
}







