public class PoblacionImpl {
    private String nombre;
    private int numeroHabitantes;
    private double superficie;
    private int personasTrabajando;
    private int numPersonasEmpleadas;
    private FestividadImpl festividad;

    public PoblacionImpl(String nombre, int numeroHabitantes, double superficie, int personasTrabajando, int numPersonasEmpleadas, FestividadImpl festividad) {
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
        this.superficie = superficie;
        this.personasTrabajando = personasTrabajando;
        this.numPersonasEmpleadas = numPersonasEmpleadas;
        this.festividad = festividad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getPersonasTrabajando() {
        return personasTrabajando;
    }

    public void setPersonasTrabajando(int personasTrabajando) {
        this.personasTrabajando = personasTrabajando;
    }

    public int getNumPersonasEmpleadas() {
        return numPersonasEmpleadas;
    }

    public void setNumPersonasEmpleadas(int numPersonasEmpleadas) {
        this.numPersonasEmpleadas = numPersonasEmpleadas;
    }

    public FestividadImpl getFestividad() {
        return festividad;
    }

    public void setFestividad(FestividadImpl festividad) {
        this.festividad = festividad;
    }

    public double getPorcentajeDesempleo() {
        return ((double) (getNumeroHabitantes() - getNumPersonasEmpleadas()) / getNumeroHabitantes()) * 100;
    }

    public double getDensidadPoblacion() {
        return getNumeroHabitantes() / getSuperficie();
    }

    public String toString() {
        return getNombre() + " posee una densidad de población de " + getDensidadPoblacion() + " hab/km2. " +
                "Una de sus \nfiestas más famosas es " + getFestividad();
    }
}
