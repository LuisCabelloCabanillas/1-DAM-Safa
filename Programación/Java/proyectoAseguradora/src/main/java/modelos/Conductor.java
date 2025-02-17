package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Conductor extends Personas {
    private LocalDate fechaCarnet;
    private int puntosCarnet;
    private int anyosAsegurados;

    public Conductor(int idPersona, String nombre, String apellido1, String apellido2, String nif, LocalDate fechaNacimiento,
                     Direccion direccion, Sexo sexo, String paisOtigen, String email, String telefono,int edad, LocalDate fechaCarnet, int puntosCarnet, int anyosAsegurados) {
        super(idPersona, nombre, apellido1, apellido2, nif, fechaNacimiento, direccion, sexo, paisOtigen, email, telefono, edad);
        if (edad < 18) {
            throw new IllegalArgumentException("El conductor debe ser mayor de edad");
        }
        this.fechaCarnet = fechaCarnet;
        this.puntosCarnet = puntosCarnet;
        this.anyosAsegurados = anyosAsegurados;
    }

    public Conductor(LocalDate fechaCarnet, int puntosCarnet, int anyosAsegurados) {
        this.fechaCarnet = fechaCarnet;
        this.puntosCarnet = puntosCarnet;
        this.anyosAsegurados = anyosAsegurados;
    }

    public Conductor(Conductor conductor) {
        this.fechaCarnet = conductor.fechaCarnet;
        this.puntosCarnet = conductor.puntosCarnet;
        this.anyosAsegurados = conductor.anyosAsegurados;
    }

    public Conductor() {
        fechaCarnet = LocalDate.now();
        puntosCarnet = 8;
        anyosAsegurados = 1;
    }

    public LocalDate getFechaCarnet() {
        return fechaCarnet;
    }

    public void setFechaCarnet(LocalDate fechaCarnet) {
        this.fechaCarnet = fechaCarnet;
    }

    public int getPuntosCarnet() {
        return puntosCarnet;
    }

    public void setPuntosCarnet(int puntosCarnet) {
        this.puntosCarnet = puntosCarnet;
    }

    public int getAnyosAsegurados() {
        return anyosAsegurados;
    }

    public void setAnyosAsegurados(int anyosAsegurados) {
        this.anyosAsegurados = anyosAsegurados;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "fechaCarnet=" + getFechaCarnet() +
                ", puntosCarnet=" + getPuntosCarnet() +
                ", anyosAsegurados=" + getAnyosAsegurados() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Conductor conductor = (Conductor) o;
        return puntosCarnet == conductor.puntosCarnet && anyosAsegurados == conductor.anyosAsegurados && Objects.equals(fechaCarnet, conductor.fechaCarnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaCarnet, puntosCarnet, anyosAsegurados);
    }
}
