import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EjemploItereadores {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(6);
        listaEnteros.add(8);
        listaEnteros.add(9);
        listaEnteros.add(4);

        System.out.println(listaEnteros);

        //Iterator<Integer> it = listaEnteros.iterator();
        ListIterator<Integer> it = listaEnteros.listIterator();

        while (it.hasNext()) {
            int valor = it.next();
            if (valor%2 == 0) {
                it.remove();
                it.add(valor);
            }
        }
        System.out.println(listaEnteros);

        System.out.println(listaEnteros);

        for (int i=listaEnteros.size()-1;i>=0; i--) {
            listaEnteros.remove(i);
        }
        System.out.println(listaEnteros);
    }
}
