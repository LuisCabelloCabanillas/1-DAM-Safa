public class Gerente extends Empleado {
    double bono;

    public Gerente(String nombre, Double salarioBase) {
        super(nombre, salarioBase);
    }

    void calcularSalario() {
        double salarioTotal = salarioBase + bono;
    }
}
