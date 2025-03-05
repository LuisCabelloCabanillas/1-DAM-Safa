abstract class Figura {
    abstract double calcularArea();
    void mostrarInfo(){
        System.out.println("Soy una figura");
    }
}

public class Triangulo {
    public void mostrarInfo(){
        System.out.println("Soy un triángulo");
    }
}
