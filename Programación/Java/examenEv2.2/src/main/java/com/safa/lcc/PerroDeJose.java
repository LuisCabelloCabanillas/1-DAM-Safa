package com.safa.lcc;

import com.joey.utils.Perro;
import com.joey.utils.RazaPerro;

import java.time.LocalDate;


public class PerroDeJose extends Perro {

    private String paseadoPor;

    public PerroDeJose(String nombre, RazaPerro raza, LocalDate fechaNacimiento) {
        super(nombre, raza, fechaNacimiento);
        this.paseadoPor=getPaseadoPor();
    }

    public String getPaseadoPor(){
        return paseadoPor;
    }

    public PerroDeJose(Perro perro) {
        super(perro);
    }

    @Override
    public String toString() {
        return super.toString()+"Paseado por: " + getPaseadoPor() + "\n";
    }
}
