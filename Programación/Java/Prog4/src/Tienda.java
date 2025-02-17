import java.util.ArrayList;
import java.util.Iterator;

public class Tienda {
    private ArrayList<Producto> productos;
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }
    public void eliminarProducto(Producto producto) {
        Iterator<Producto> iterator = this.productos.iterator();
        while (iterator.hasNext()) {
            Producto productoAux = iterator.next();
            if (productoAux.getId() == producto.getId()) {
                iterator.remove();
                System.out.println("Producto eliminado: " + producto);
                return;
            }
        }
        System.out.println("Producto no encontrado: " + producto);
    }
    public void listarProductos() {
        if (this.productos.isEmpty()) {
            System.out.println("No hay productos");
        }else {
            System.out.println("Listado de productos: ");
            for (Producto producto : this.productos) {
                System.out.println(producto);
            }
        }
    }
}
