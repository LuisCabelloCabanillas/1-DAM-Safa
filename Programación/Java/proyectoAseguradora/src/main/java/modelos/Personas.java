package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Personas {
    private int idPersona;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private LocalDate fechaNacimiento;
    private Direccion direccion;
    private Sexo sexo;
    private String paisOrigen;
    private String email;
    private String telefono;
    private int edad;

    public enum Sexo { MASCULINO, FEMENINO, NA }

    public Personas(int idPersona, String nombre, String apellido1, String apellido2, String nif, LocalDate fechaNacimiento, Direccion direccion,
                    Sexo sexo, String paisOrigen, String email, String telefono, int edad) throws IllegalArgumentException {
        if (!validarNIF(nif)) {
            throw new IllegalArgumentException("NIF inválido");
        }
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.sexo = sexo;
        this.paisOrigen = paisOrigen;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
    }

    public Personas(Personas persona) {
        this.idPersona = persona.idPersona;
        this.nombre = persona.nombre;
        this.apellido1 = persona.apellido1;
        this.apellido2 = persona.apellido2;
        this.nif = persona.nif;
        this.fechaNacimiento = persona.fechaNacimiento;
        this.direccion = persona.direccion;
        this.sexo = persona.sexo;
        this.paisOrigen = persona.paisOrigen;
        this.email = persona.email;
        this.telefono = persona.telefono;
        this.edad = persona.edad;
    }

    public Personas() {
        idPersona = 1;
        nombre= "luis";
        apellido1= "Cabello";
        apellido2= "Cabanillas";
        nif= "47563665X";
        fechaNacimiento= LocalDate.now();
        direccion= null;
        sexo= Sexo.MASCULINO;
        paisOrigen= "Cabello";
        email= "Cabello@gmail.com";
        telefono= "123456";
        edad= 0;
    }



    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static boolean validarNIF(String nif) {
        return nif.matches("\\d{8}[A-Z]");
    }

    public static boolean puedeConducir(int edad){
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", nif='" + nif + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion=" + direccion +
                ", sexo=" + sexo +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Personas personas = (Personas) o;
        return idPersona == personas.idPersona && Objects.equals(nombre, personas.nombre) && Objects.equals(apellido1, personas.apellido1) && Objects.equals(apellido2, personas.apellido2) && Objects.equals(nif, personas.nif) && Objects.equals(fechaNacimiento, personas.fechaNacimiento) && Objects.equals(direccion, personas.direccion) && sexo == personas.sexo && Objects.equals(paisOrigen, personas.paisOrigen) && Objects.equals(email, personas.email) && Objects.equals(telefono, personas.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersona, nombre, apellido1, apellido2, nif, fechaNacimiento, direccion, sexo, paisOrigen, email, telefono);
    }
}