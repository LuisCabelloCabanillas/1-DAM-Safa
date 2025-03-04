package poblacion;

/***/
public class PoblacionImpl implements Poblacion {
    private String nombre;
    private Integer numHabitantes;
    private Double superficie;
    private Integer numTrabajadores;
    private Integer numEmpleados;
    private Festividad festivo;

    public PoblacionImpl(String fnombre, Integer fnumHabitantes, Double fsuperficie, Integer fnumTrabajadores, Integer fnumEmpleados, Festividad ffestivo) {
        nombre = fnombre;
        numHabitantes = fnumHabitantes;
        superficie = fsuperficie;
        numTrabajadores = fnumTrabajadores;
        numEmpleados = fnumEmpleados;
        festivo = ffestivo;
    }

    public void setNumHabitantes(Integer fnumHabitantes) { numHabitantes = fnumHabitantes; }
    public void setNumTrabajadores(Integer fnumTrabajadores) { numTrabajadores = fnumTrabajadores; }
    public void setNumEmpleados(Integer fnumEmpleados) { numEmpleados = fnumEmpleados; }
    public void setFestividades(Festividad ffestivo) { festivo = ffestivo; }

    public String getNombre() { return nombre; }
    public Integer getNumHabitantes() { return numHabitantes; }
    public Double getSuperficie() { return superficie; }
    public Integer getNumTrabajadores() { return numTrabajadores; }
    public Integer getNumEmpleados() { return numEmpleados; }
    public Festividad getFestividades() { return festivo; }

    public Double calcPorDesempleado() {
        return 100 - ((double) getNumTrabajadores() / (double) getNumEmpleados()) * 100;
    }

    public Double calcDensPoblacion() {
        return getNumHabitantes() / getSuperficie();
    }

    public String toString() {
        return getNombre() + " posee una densidad de población de " + calcDensPoblacion() + " hab/km2. Una de sus fiestas más famosas es " + getFestividades() + ".";
    }
}
