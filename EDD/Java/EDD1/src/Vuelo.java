import java.util.Date;

public interface Vuelo {
    public String getCodVuelo();
    public String getdest();
    public Double getPrecio();
    public void setPrecio(Double precio1);
    public Integer getNumpla();
    public Integer getNumpasa();
    public void setNumpasa(Integer numpasa1);
    public Date getFecha();
    public Double getRecaudacion();
    public Persona getpiloto();
    public void setpiloto(Persona piloto1);
}