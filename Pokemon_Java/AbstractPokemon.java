public abstract class AbstractPokemon implements PokemonInterface{
    public Pokemon createPokemon(String name, Integer health, String type){
        Pokemon this_pokemon = new Pokemon();
        this_pokemon.setName(name);
        this_pokemon.setHealth(health);
        this_pokemon.setType(type);
        System.out.println("");
        System.out.println("---------CREATE--------");
        System.out.println("");
        this_pokemon.printAll();
        return this_pokemon;
    }
    public void attackPokemon(Pokemon target){
        System.out.println("");
        System.out.println("------ATTACKING------");
        System.out.println("Target: ");
        System.out.print(target.name);
        System.out.println("");
        System.out.print("Old Health: ");
        System.out.print(target.health);
        target.health = target.health - 10;
        System.out.println("");
        System.out.print("New Health: ");
        System.out.print(target.health);
        System.out.println("");
    }
}