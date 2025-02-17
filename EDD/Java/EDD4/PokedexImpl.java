import java.util.HashMap;
import java.util.Map;

class PokemonImpl {
    private String nombre;
    private String tipo;
    private int pokedex;
    private String descripcion;
    private double Altura;
    private double peso;
    private generoPokemon genero;
    private String Ataque;

    public PokemonImpl(String nombre, String tipo, int pokedex,
                       String descripcion, double Altura, double peso, generoPokemon genero,
                       String Ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.pokedex = pokedex;
        this.descripcion = descripcion;
        this.Altura = Altura;
        this.peso = peso;
        this.Ataque = Ataque;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    public int getPokedex() {
        return pokedex;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getAltura() {
        return Altura;
    }
    public double getPeso() {
        return peso;
    }
    public generoPokemon getGenero() {
        return genero;
    }
    public String getAtaque() {
        return Ataque;
    }

    public String toString(){
        return "Nº " + getPokedex() + " - " + getNombre() + " - " + getDescripcion() + "\n Altura: "
                + getAltura() + "m \n Peso: " + getPeso() + "kg \n Genero: " + getGenero() + "\n Tipos: " + getTipo() + "\n Ataque: " + getAtaque();
    };
}

public class PokedexImpl {
    private Pokemon pokemon;
    private Map<String, String> debilidades;
    private String ataque;

    public PokedexImpl(Pokemon pokemon, Map<String, String> debilidades, String ataque) {
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

    public static Pokemon compararPokemons(PokedexImpl p1, PokedexImpl p2) {
        String tipo1 = p1.getPokemon().getTipo();
        String tipo2 = p2.getPokemon().getTipo();

        if (p1.getDebilidades().get(tipo2) != null && p1.getDebilidades().get(tipo2).equals(tipo1)) {
            return p1.getPokemon();
        }

        if (p2.getDebilidades().get(tipo1) != null && p2.getDebilidades().get(tipo1).equals(tipo2)) {
            return p2.getPokemon();
        }

        return null;
    }
}
