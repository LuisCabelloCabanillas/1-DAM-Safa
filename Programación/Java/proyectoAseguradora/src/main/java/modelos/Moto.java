package modelos;

import com.aseguradora.utils.*;

import java.time.LocalDate;
import java.util.Objects;

public class Moto extends Vehiculo {
    private int cilindradaCC;
    private boolean tieneSidecar;

    public Moto(int id, String marca, String modelo, String matricula, LocalDate fechaMatriculacion, String color, Personas duenyoActual,int anyoMatriculacion, int cilindradaCC, boolean tieneSidecar) {
        super(id, marca, modelo, matricula, fechaMatriculacion, color, duenyoActual, anyoMatriculacion);
        this.cilindradaCC = cilindradaCC;
        this.tieneSidecar = tieneSidecar;
    }

    public Moto(int id, Marca marca, Modelo modelo, String matricula, LocalDate fechaMatriculacion, String color, Personas duenyoActual,int anyoMatriculacion, int cilindradaCC, boolean tieneSidecar) {
        super(id, marca, modelo, matricula, fechaMatriculacion, color, duenyoActual, anyoMatriculacion);
        this.cilindradaCC = cilindradaCC;
        this.tieneSidecar = tieneSidecar;
    }

    public Moto() {
        this.cilindradaCC = 0;
        this.tieneSidecar = false;
    }

    public Moto(int cilindradaCC, boolean tieneSidecar) {
        this.cilindradaCC = cilindradaCC;
        this.tieneSidecar = tieneSidecar;
    }

    public Moto (Moto moto1) {
        cilindradaCC = 0;
        tieneSidecar = false;
    }

    public int getCilindradaCC() {
        return cilindradaCC;
    }

    public void setCilindradaCC(int cilindradaCC) {
        this.cilindradaCC = cilindradaCC;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradaCC=" + cilindradaCC +
                ", tieneSidecar=" + tieneSidecar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return cilindradaCC == moto.cilindradaCC && tieneSidecar == moto.tieneSidecar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cilindradaCC, tieneSidecar);
    }
}
