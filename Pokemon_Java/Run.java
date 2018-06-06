
public class Run{
    public static void main(String[] args){
        Pokedex battlefield = new Pokedex();
        Pokemon squirtle = battlefield.createPokemon("Squirtle",25,"Water");
        Pokemon magneton = battlefield.createPokemon("Magneton",40,"Electric/Steel");
        System.out.println("Number of Pokemon on the field: ");
        System.out.print(Pokemon.numOfPokemon);
        battlefield.attackPokemon(magneton);
        battlefield.attackPokemon(squirtle);
        battlefield.attackPokemon(magneton);
        battlefield.attackPokemon(squirtle);
        battlefield.attackPokemon(magneton);
        battlefield.attackPokemon(squirtle);
        System.out.println("");
        System.out.println("Squirtle has fainted.");
        System.out.println("Magneton has won the battle!");
    }
}