abstract class Empleado{
    String nombre;
    Double salarioBase;

    public Empleado(String nombre, Double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    abstract void calcularSalario();
}