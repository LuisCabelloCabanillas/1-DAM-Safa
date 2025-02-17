import java.util.HashSet;

public class Act13_3 {
    public static void main(String[] args) {
        HashSet<Producto> productos=new HashSet<>();

        Producto producto1 = new Producto(1,"Manzana");
        Producto producto2 = new Producto(2,"Pera");
        Producto producto3 = new Producto(3,"Banana");

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    System.out.println("Prosuctos en el HasSet: ");
    for (Producto producto: productos) {
        System.out.println(producto);
    }
    System.out.println("Cantidad de productos: " + productos.size());
    }
}
