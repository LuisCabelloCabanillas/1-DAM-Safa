public interface Cancion {
    public String getnombre();
    public String getinterprete();
    public Integer getduracion();
    public Fecha getfechaLanzamiento();
    public String getgenero();
    public Integer getnumRepros();
    public void setnumRepros(Integer numRepros);
    public Double getcalificacion();
    public void setcalificacion(Double calificacion);
    public Boolean getreproduccion();
    public void setreproduccion(Boolean reproduccion);
}
