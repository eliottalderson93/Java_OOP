public class Project{
    private String name;
    private String desc;
    public Project(){
        this.name = "";
        this.desc = "";
    }
    public Project(String Name){
        this.name = Name;
        this.desc = "";
    }
    public Project(String Name, String Desc){
        this.name = Name;
        this.desc = Desc;
    }
    public void elevatorPitch(){
        System.out.println(this.name + ":" + this.desc);
    }
    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.desc;
    }
    public void changeName(String newName){ //to chain it requires String or Project return
        this.name = newName;
    }
    public void changeDesc(String newDesc){
        this.desc = newDesc;
    }
}
