public class ExplicacionDebug {

    public static void main(String[] args) {
        String cadena = "a";
        System.out.println(cadena);
        do{
            cadena = cadena + "e";
        }while(cadena.length() < 5);
        System.out.println(cadena);
        do {
            cadena = cadena + "i";
        }while(cadena.length() < 3);
        System.out.println(cadena);
    }
    /*Para depurar este código en este IDE y poder analizar los valores de la variable en cada iteración de los bucles do-while,hay que seguir estos pasos:
    Primero debemos de colocar los puntos de interrupción, para ello haremos click en los margenes izquierdos
    donde querramos comprobar el código en este caso yo los voy a poner en:
    System.out.println(cadena) (línea 7)
    System.out.println(cadena) (línea 13)
    System.out.println(cadena) (línea 17)

    Como segundo paso iniciaremos el Debugger, para ejecutarlo pulsaremos el icono de insecto de la barra de arriba o pulsaremos Mayus+F9
    durante el proceso de debug se detendra en cada punto de interrupción que hayamos puesto pudiendo asi observar el estado de la variable

    Tercero se analizá la variable cadena en cada iteración
    Al inicio la cadena muestra "a".
    En el primer do-while (cadena.length() < 5):
    Se concatena "e" en cada iteración hata llegar a "aeeee" en la que se rompe el do-while

    En el segundo do-while (cadena.length() < 3):
    Como "aeeee" se le suma la i porque en la iteración lo añade pero una vez entra en el while este lo expulsa ya que la longitud es mayor que 3
    Se imprime "aeeeei".*/
    }
