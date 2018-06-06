
public class Pokemon{
    String name;
    Integer health;
    String type;
    static int numOfPokemon = 0;
    public Pokemon(){
        this.name = "";
        this.health = 10;
        this.type = "";
        numOfPokemon++;
    }

    public String getName(){
        return this.name;
    }

    public Integer getHealth(){
        return this.health;
    }

    public String getType(){
        return this.type;
    }

    public void setName(String name){
        this.name = name;

    }

    public void setHealth(Integer health){
        this.health = health;

    }

    public void setType(String type){
        this.type = type;

    }
    public void printAll(){
        System.out.println("");
        System.out.println("Name: ");
        System.out.print(this.name);
        System.out.println("");
        System.out.println("Health: ");
        System.out.print(this.health);
        System.out.println("");
        System.out.println("Type: ");
        System.out.print(this.type);
        System.out.println("");
    }
}