public class Hijo extends Personas {
    private Personas padre;
    private Personas madre;

    public Hijo(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Hijo(String nombre, String apellido, int edad, Personas padre, Personas madre) {
        super(nombre, apellido, edad);
        this.padre = padre;
        this.madre = madre;
    }
    public Personas setPadre() {
        return padre;
    }
    public Personas setMadre() {
        return madre;
    }
    public String toString() {
        String salida = super.toString();
        return salida +"\n \tPadre: "+ padre + "\n \tMadre: "+ madre;
    }
}

