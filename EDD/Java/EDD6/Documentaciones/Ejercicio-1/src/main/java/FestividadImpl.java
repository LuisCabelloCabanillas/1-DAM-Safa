package poblacion;

/**
 * La clase FestividadImpl representa el nombre y mes de una Festividad.
 */

public class FestividadImpl implements Festividad{
    private String mes;
    private String nombreFiesta;

    /**
     * Constructor de la clase FestividadImpl
     *
     * @param mes String del nombre del mes
     * @param nombreFiesta String del nombre de la Festividad
     */

    public FestividadImpl(String mes, String nombreFiesta) {
        this.mes = mes;
        this.nombreFiesta = nombreFiesta;
    }

    /**
     * Getters y Setters de la clase FestividadImpl*/

    public void setMes(String fmes) {mes = fmes;}
    public String getMes() {return mes;}
    public String getNombreFiesta() {return nombreFiesta;}
    public String toString() {return getNombreFiesta() + ", en " + getMes();}
}
