public class Televisor extends Electrodomestico{

    public Televisor(String marca, String consumo) {
        super(marca, consumo);
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca + ", Consumo: " + consumo);
    }
}
