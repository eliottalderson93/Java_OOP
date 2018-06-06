public interface PokemonInterface{
    Pokemon createPokemon(String name, Integer health, String type);
    void attackPokemon(Pokemon target);
    void pokemonInfo(Pokemon this_pokemon);

    

}