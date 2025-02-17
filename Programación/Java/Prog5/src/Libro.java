import java.time.LocalDate;
import java.util.Objects;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
    private String genero;

    public Libro(int id, String titulo, String autor, LocalDate fechaPublicacion,
                 String genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return "Título: " + getTitulo() + ", Autor: " + getAutor() + ", Fecha: " + getFechaPublicacion()
                + ", Genero: " + getGenero();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj ) return true; {
            if (obj == null) return false; {
                Libro libro = (Libro) obj;
                return id == libro.id &&
                        Objects.equals(titulo, libro.titulo) &&
                        Objects.equals(autor, libro.autor) &&
                        Objects.equals(fechaPublicacion, libro.fechaPublicacion) &&
                        Objects.equals(genero, libro.genero);
            }
        }
    }

    public int compareTo(Libro libro) {
        return Integer.compare(id, libro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, autor, fechaPublicacion, genero);
    }
}
