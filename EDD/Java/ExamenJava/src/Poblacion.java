public interface Poblacion {
    String getNombre();
    int getNumeroHabitantes();
    void setNumeroHabitantes(int numeroHabitantes);
    double getSuperficie();
    int getPersonasTrabajando();
    void setPersonasTrabajando(int personasTrabajando);
    int getNumPersonasEmpleadas();
    void setNumPersonasEmpleadas(int numPersonasEmpleadas);
    Festividad getFestividad();
    void setFestividad(Festividad festividad);
    double getPorcentajeDesempleo();
    double getDensidadPoblacion();
}
