public class Act14_3 {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Producto producto1 = new Producto(1,"Manzana");
        Producto producto2 = new Producto(2,"Pera");
        Producto producto3 = new Producto(3,"Banana");

        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);

        tienda.listarProductos();

        tienda.eliminarProducto(producto2);
        tienda.listarProductos();
    }

}
