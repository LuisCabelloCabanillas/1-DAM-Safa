package com.safa.lcc;

public class Main {
}

/*Validaciones con expresiones lambda
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexEjemplo {
    public static boolean comienzaConHola(String texto) {
        String regex = "^hola\\b.*"; // La frase debe comenzar con "hola"
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // Ignora mayúsculas y minúsculas
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String texto1 = "hola, ¿cómo estás?"; // Debe ser válido
        String texto2 = "Hola mundo!"; // Debe ser válido (mayúscula inicial)
        String texto3 = "Dije hola en la conversación."; // No válido, "hola" no está al inicio
        String texto4 = "holanda es un país"; // No válido, empieza con "holanda", no "hola"

        System.out.println(comienzaConHola(texto1)); // true
        System.out.println(comienzaConHola(texto2)); // true
        System.out.println(comienzaConHola(texto3)); // false
        System.out.println(comienzaConHola(texto4)); // false
    }
}
*/