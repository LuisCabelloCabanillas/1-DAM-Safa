import java.util.function.Supplier;

public class Libro {
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public static void main(String[] args) {
        Supplier<Libro> supplierDelLibro = Libro::new;
        Libro libro = supplierDelLibro.get();
        libro.setTitulo("El Quijote");
        System.out.println(libro.getTitulo());
    }
}
