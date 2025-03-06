import java.util.Random;
import java.util.function.Supplier;

public class SupplierEjer {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            String[] mensaje = {
                "Hola", "Bienvenido", "Saludos"} ;
            int aleatorio = new Random().nextInt(mensaje.length);
            return mensaje[aleatorio];
        };
        System.out.println(supplier.get());
    }
}
