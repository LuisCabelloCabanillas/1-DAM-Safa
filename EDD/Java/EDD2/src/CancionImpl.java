public class CancionImpl {
    private String nombre ;
    private String interprete ;
    private Integer duracion ;
    private Fecha fechaLanzamineto ;
    private String genero ;
    private Integer numRepros ;
    private Double calificacion ;
    private Boolean reproduccion;

    public CancionImpl(String nombre, String interprete) {
        this.nombre = nombre;
        this.interprete = interprete;
    }

    public String getnombre() {
        return nombre;
    }

    public String getinterprete() {
        return interprete;
    }

    public Integer getduracion() {
        return duracion;
    }

    public Fecha getfechaLanzamineto() {
        return fechaLanzamineto;
    }

    public String getgenero() {
        return genero;
    }

    public Integer getnumRepros() {
        return numRepros;
    }
    public void setnumRepros (Integer numRepros) {
        this.numRepros = numRepros;
    }

    public Double getcalificacion() {
        return calificacion;
    }
    public void setcalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Boolean getreproduccion() {
        return reproduccion;
    }
    public void setreproduccion(Boolean reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String toString() {
        return getnombre()+", "+getinterprete();
    }
}
