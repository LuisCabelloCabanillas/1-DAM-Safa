import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PokemonImpl pokemon = new PokemonImpl("Bulbasur",
                "Planta/Veneno",0001,
                "Este Pokémon nace con una semilla en el lomo, que\n" +
                "brota con el paso del tiempo.", 0.7, 6.9, generoPokemon.Masculino ,"Follaje, 40" );
        System.out.println(pokemon);

        System.out.println("\n" + "Los pokemones que se van a comparar son Charmander y Bulbasur");
        Map<String, String> debilidades = Map.of(
                "Fuego", "Planta",
                "Planta", "Agua",
                "Agua", "Fuego"
        );

        Pokemon charmander = new Pokemon("Charmander", "Fuego");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Planta");

        PokedexImpl pokedexCharmander = new PokedexImpl(charmander, debilidades, "Llamarada");
        PokedexImpl pokedexBulbasaur = new PokedexImpl(bulbasaur, debilidades, "Latigazo");

        Pokemon debil = PokedexImpl.compararPokemons(pokedexCharmander, pokedexBulbasaur);

        if (debil != null) {
            System.out.println("El Pokémon en desventaja es: " + debil.getNombre());
        } else {
            System.out.println("No hay una clara desventaja entre los Pokémon.");
        }
    }
}