package modelos;

import java.time.LocalDate;
import java.util.Objects;
import com.aseguradora.utils.*;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    private TipoCombustible tipoCombustible ;
    private Traccion traccion ;
    private boolean esTodoTerreno;

    public enum TipoCombustible {gasolina,diesel,electrico, hibrido}

    public enum Traccion {delantera, trasera, integral}

    public Coche(Coche coche) {
        this.numeroPuertas = coche.getNumeroPuertas();
        this.tipoCombustible = coche.getTipoCombustible();
        this.traccion = coche.getTraccion();
        this.esTodoTerreno = false;
    }

    public Coche() {
        numeroPuertas = 0;
        tipoCombustible = TipoCombustible.gasolina;
        traccion = Traccion.delantera;
        esTodoTerreno = false;
    }

    public Coche(int id, String marca, String modelo, String matricula, LocalDate fechaMatriculacion, String color, Personas duenyoActual, int anyoMatriculacion, int numeroPuertas,
                 boolean esTodoTerreno, TipoCombustible tipoCombustible,Traccion traccion) {
        super(id, marca, modelo, matricula, fechaMatriculacion, color, duenyoActual,anyoMatriculacion);
        this.numeroPuertas = numeroPuertas;
        this.esTodoTerreno = esTodoTerreno;
        this.tipoCombustible = tipoCombustible;
        this.traccion = traccion;
    }

    public Coche(int id, Marca marca, Modelo modelo, String matricula, LocalDate fechaMatriculacion, String color, Personas duenyoActual, int anyoMatriculacion, int numeroPuertas,
                 boolean esTodoTerreno, TipoCombustible tipoCombustible,Traccion traccion) {
        super(id, marca, modelo, matricula, fechaMatriculacion, color, duenyoActual,anyoMatriculacion);
        this.numeroPuertas = numeroPuertas;
        this.esTodoTerreno = esTodoTerreno;
        this.tipoCombustible = tipoCombustible;
        this.traccion = traccion;
    }

    public Coche(int numeroPuertas, boolean esTodoTerreno, TipoCombustible tipoCombustible,Traccion traccion) {
        this.numeroPuertas = numeroPuertas;
        this.esTodoTerreno = esTodoTerreno;
        this.tipoCombustible = tipoCombustible;
        this.traccion = traccion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Traccion getTraccion() {
        return traccion;
    }

    public void setTraccion(Traccion traccion) {
        this.traccion = traccion;
    }

    public boolean isEsTodoTerreno() {
        return esTodoTerreno;
    }

    public void setEsTodoTerreno(boolean esTodoTerreno) {
        this.esTodoTerreno = esTodoTerreno;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numeroPuertas=" + numeroPuertas +
                ", tipoCombustible=" + tipoCombustible +
                ", traccion=" + traccion +
                ", esTodoTerreno=" + esTodoTerreno +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return numeroPuertas == coche.numeroPuertas && esTodoTerreno == coche.esTodoTerreno && tipoCombustible == coche.tipoCombustible && traccion == coche.traccion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroPuertas, tipoCombustible, traccion, esTodoTerreno);
    }
}
