package poblacion;

/**
 * La clase FestividadImpl representa el nombre y mes de una Festividad.
 * @author Luis
 * @version 1.0
 */

public class FestividadImpl implements Festividad{
    private String mes;
    private String nombreFiesta;

    /**
     * Constructor de la clase FestividadImpl le pasamos el mes y el nombre de la Festividad
     *
     * @param mes String del nombre del mes
     * @param nombreFiesta String del nombre de la Festividad
     */

    public FestividadImpl(String mes, String nombreFiesta) {
        this.mes = mes;
        this.nombreFiesta = nombreFiesta;
    }

    /**
     * Para modificar el mes
     * @param fmes String del nombre del mes
     */

    public void setMes(String fmes) {mes = fmes;}

    /**
     * Devuelve el mes
     * @return String del nombre del mes
     */

    public String getMes() {return mes;}

    /**
     * Devuelve el nombre de la fiesta
     * @return String del nombre de la fiesta
     */
    public String getNombreFiesta() {return nombreFiesta;}

    /**
     * Este es el metodo toString que devuelve el nombre de la fiesta y el mes
     * @return Strin el formate con el que mostramos la clase
     */

    public String toString() {return getNombreFiesta() + ", en " + getMes();}
}
