
public class VueloImpl {
    //1º Variables/atributos
    private String codVuelo;
    private String dest;
    private Double precio;
    private Integer numpla;
    private Integer numpasa;
    private date fecha;
    private Double recaudacion;
    private Persona piloto ;

    //2º Constructor
    //3º getters y setters
    public String getCodVuelo() {
        return codVuelo;
    }
    public String getdest() {
        return dest;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio1) {
        precio = precio1;
    }
    public Integer getNumpla() {
        return numpla;
    }
    public Integer getNumpasa() {
        return numpasa;
    }
    public void setNumpasa(Integer numpasa1) {
        numpasa = numpasa1;
    }
    public Date getFecha() {
        return fecha;
    }
    public Double getRecaudacion() {
        return recaudacion;
    }

    public Persona getpiloto() {
        return piloto;
    }

    public void setpiloto(Persona piloto1) {
        piloto = piloto1;
    }
    //4º otros metodos
    //5º toString
    public String toString() {
        return getCodVuelo() + "("+getdest()+")"+ "- "+ getpiloto()+ ", " + getFecha();
    }
}
