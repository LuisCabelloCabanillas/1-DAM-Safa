import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejer22 {
    public static void main(String[] args) {
        int num = 10;

        List<Integer> numerosPares =  new ArrayList<>();

        for (int i = 1; i <= num*2; i++) {
            if (i % 2 == 0) {
                numerosPares.add(i);
            }
        }

        IntStream.range(1, num*2+1).filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);

        List<Integer> primosCuadrados = numerosPares.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println(primosCuadrados);

        generaCuadradoPares(4);
    }

    public static int generaCuadradoPares(Integer n){
        List<Integer> listaPares= new ArrayList<>();
        for (int i= 1; i<n; i++){
            listaPares.add(i*2);
        }

        ListIterator<Integer> iter = listaPares.listIterator();
        while (iter.hasNext()){
            Integer elem = iter.next();
            elem = elem*elem;
            iter.set(elem);
        }


        /*List<Integer> listaPares= new ArrayList<>();
        for (int i= 1; i<n; i++){
            listaPares.add(i*2);
        }

        Integer salida = listaPares.stream().map(a -> a*a).reduce((a,b) -> a+b).orElse(0);

        System.out.println(listaPares);
        System.out.println("Salida: " +salida);
        */
        System.out.println(listaPares);
        return 0;
    }
}
