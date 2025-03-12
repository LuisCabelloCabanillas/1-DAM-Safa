import java.util.List;

public class Ejer25 {
    public static  void main(String[] args) {
        List<String> listaNombres = List.of("Juan", "Pedro", "Luis", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Lola", "Manuel","Monserrat");

        List<String> nombreMasLargo = listaNombres.stream().reduce((nombre1,nombre2)-> nombre1.length() > nombre2.length() ? nombre1 : nombre2).stream().toList();

        System.out.println(nombreMasLargo);
    }
}
