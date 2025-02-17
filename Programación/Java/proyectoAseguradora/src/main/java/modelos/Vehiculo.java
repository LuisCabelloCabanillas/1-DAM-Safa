package modelos;


import com.aseguradora.utils.*;
import utilidades.UtilidadesVehiculo;

import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;

public class Vehiculo {
    private int id;
    private Marca marca;
    private Modelo modelo;
    private String matricula;
    private LocalDate fechaMatriculacion;
    private String color;
    private Personas duenyoActual;
    private int anyoMatriculacion;


    public Vehiculo(int id, String marca, String modelo, String matricula, LocalDate fechaMatriculacion, String color, Personas duenyoActual, int anyoMatriculacion) {

        this.id = id;
        if (SoporteVehiculos.getInstance().esMarcaValida(marca)){
            this.marca = SoporteVehiculos.getInstance().getMarcaByName(marca);
        }else{
            throw new IllegalArgumentException("Marca o Modelo inválidos");
        }
        if (SoporteVehiculos.getInstance().esModeloValido(marca, modelo)){
            this.modelo = this.marca.getModelo(modelo);
        }

        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.color = color;
        this.duenyoActual = duenyoActual;
        this.anyoMatriculacion = anyoMatriculacion;
    }

    public Vehiculo(int id, Marca marca, Modelo modelo, String matricula, LocalDate fechaMatriculacion, String color, Personas duenyoActual, int anyoMatriculacion) {
        if (!SoporteVehiculos.getInstance().getMarcasCochesList().contains(marca) ||
                !marca.getModelos().contains(modelo)) {
            throw new IllegalArgumentException("Marca o Modelo inválidos");
        }
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.color = color;
        this.duenyoActual = duenyoActual;
        this.anyoMatriculacion = anyoMatriculacion;
    }
    public Vehiculo(Vehiculo vehiculo){
        this.id = vehiculo.getId();
        this.marca =vehiculo.getMarca();
        this.modelo = vehiculo.getModelo();
        this.matricula = vehiculo.getMatricula();
        this.fechaMatriculacion = vehiculo.getFechaMatriculacion();
        this.color = vehiculo.getColor();
        this.duenyoActual = vehiculo.getDuenyoActual();
        this.anyoMatriculacion= vehiculo.getAnyoMatriculacion();
    }

    public Vehiculo() {
        id= 0;
        marca = null;
        modelo = null;
        matricula = "No identificado";
        fechaMatriculacion = LocalDate.now();
        color = "No identificado";
        duenyoActual = null;
        anyoMatriculacion = 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Personas getDuenyoActual() {
        return duenyoActual;
    }

    public void setDuenyoActual(Personas duenyoActual) {
        this.duenyoActual = duenyoActual;
    }

    public int getAnyoMatriculacion() {
        return anyoMatriculacion;
    }

    public void setAnyoMatriculacion(int anyoMatriculacion) {
        this.anyoMatriculacion = anyoMatriculacion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", color='" + color + '\'' +
                ", duenyoActual=" + duenyoActual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return id == vehiculo.id && Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo) && Objects.equals(matricula, vehiculo.matricula) && Objects.equals(fechaMatriculacion, vehiculo.fechaMatriculacion) && Objects.equals(color, vehiculo.color) && Objects.equals(duenyoActual, vehiculo.duenyoActual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marca, modelo, matricula, fechaMatriculacion, color, duenyoActual);
    }
}
