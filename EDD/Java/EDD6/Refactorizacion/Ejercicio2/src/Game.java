public class Game {
    Player jugador;
    //Rename a la variable para mejorar la legibilidad

    public void movement(String m) {
        if (m.equalsIgnoreCase("Derecha")) {
            jugador.setX(jugador.getX() + 1);
        }
        if (m.equalsIgnoreCase("Izquierda")) {
            jugador.setX(jugador.getX() - 1);
        }
        if (m.equalsIgnoreCase("Arriba")) {
            jugador.setY(jugador.getY() - 1);
        }
        if (m.equalsIgnoreCase("Abajo")) {
            jugador.setY(jugador.getY() + 1);
        }
    }
}
