package com.safa.lcc;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private String codigo;
    private String puntuacion;
    private String comentario;

    public Producto(String nombre, String codigo, String puntuacion, String comentario) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    public Producto(){
        nombre = null;
        codigo = null;
        puntuacion = null;
        comentario = null;
    }

    public Producto(Producto producto){
        this.nombre= producto.nombre;
        this.codigo = producto.codigo;
        this.puntuacion = producto.puntuacion;
        this.comentario = producto.comentario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(nombre, producto.nombre) && Objects.equals(codigo, producto.codigo) && Objects.equals(puntuacion, producto.puntuacion) && Objects.equals(comentario, producto.comentario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo, puntuacion, comentario);
    }

    public int compareTo(Producto producto){
        int comparacion = nombre.compareTo(producto.nombre);
        return (comparacion!=0)?comparacion : nombre.compareTo(producto.nombre);
    }

    @Override
    public String toString() {
        return "Valoracion de: "+ nombre + " " + codigo +  "\n" +
                "\t\tPuntuacion: " + puntuacion + " estrellas" + "\n" +
                "\t\tComentario: " + comentario + ".";
    }


}
