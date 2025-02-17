import java.util.Map;

class Pokemon {
    private String nombre;
    private String tipo;

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}

public class GuiaparaEjercicio {
    private Pokemon pokemon;
    private Map<String, String> debilidades; // Debilidades por tipo
    private String ataque; // Tipo de ataque del Pokémon

    public GuiaparaEjercicio(Pokemon pokemon, Map<String, String> debilidades, String ataque) {
        this.pokemon = pokemon;
        this.debilidades = debilidades;
        this.ataque = ataque;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public Map<String, String> getDebilidades() {
        return debilidades;
    }

    public String getAtaque() {
        return ataque;
    }


    public static Pokemon compararPokemon(GuiaparaEjercicio p1, GuiaparaEjercicio p2) {
        String tipoP1 = p1.getPokemon().getTipo(); // Tipo de Pokémon 1
        String ataqueP2 = p2.getAtaque();         // Ataque del Pokémon 2
        String tipoP2 = p2.getPokemon().getTipo(); // Tipo de Pokémon 2
        String ataqueP1 = p1.getAtaque();         // Ataque del Pokémon 1

        // Verificar si el ataque de p2 es efectivo contra p1
        if (p1.getDebilidades().get(tipoP1).equals(ataqueP2)) {
            return p1.getPokemon(); // Pokémon 1 es el más débil
        }

        // Verificar si el ataque de p1 es efectivo contra p2
        if (p2.getDebilidades().get(tipoP2).equals(ataqueP1)) {
            return p2.getPokemon(); // Pokémon 2 es el más débil
        }

        // Si ninguno es débil contra el ataque del otro, devolver null o cualquiera (no hay debilidad)
        return null; // No hay un Pokémon más débil
    }

    public static void main(String[] args) {
        // Definir las debilidades por tipo
        Map<String, String> debilidades = Map.of(
                "Fuego", "Agua",
                "Agua", "Planta",
                "Planta", "Fuego"
        );

        // Crear Pokémon con sus tipos
        Pokemon charmander = new Pokemon("Charmander", "Fuego");
        Pokemon squirtle = new Pokemon("Squirtle", "Agua");

        // Crear instancias de PokedexImpl
        GuiaparaEjercicio pokedexCharmander = new GuiaparaEjercicio(charmander, debilidades, "Fuego");
            GuiaparaEjercicio pokedexSquirtle = new GuiaparaEjercicio(squirtle, debilidades, "Agua");

        // Comparar los Pokémon
        Pokemon debil = GuiaparaEjercicio.compararPokemon(pokedexCharmander, pokedexSquirtle);

        // Imprimir el resultado
        if (debil != null) {
            System.out.println("El Pokémon más débil es: " + debil.getNombre());
        } else {
            System.out.println("Ninguno de los Pokémon es débil contra el otro.");
        }
    }
}
