abstract class Cocinero{
    public abstract void cocinar();

    abstract void prepararIngredientes();
    abstract void cocinarPlato();

    void servirPlato(){
        System.out.println("Sirviendo plato");
    }

}

public class CocineroJapones {
    public void cocinar(){
        prepararIngredientes();
        cocinarPlato();
        servirPlato();
    }

    void prepararIngredientes(){
        System.out.println("Preparando ingredientes japoneses");
    }

    void cocinarPlato(){
        System.out.println("Cocinando plato japones");
    }

    void servirPlato() {
        System.out.println("Sirviendo plato japones");
    }

    public static void main(String[] args) {
        CocineroJapones japones = new CocineroJapones();
        japones.cocinar();
    }
}
