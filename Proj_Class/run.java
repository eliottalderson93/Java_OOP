public class run {
    public static void main(String[] args) {
        Project blank = new Project();
        Project bill = new Project("Bill");
        Project jeff = new Project("Jeff", "My Nem JEff");
        blank.elevatorPitch();
        bill.elevatorPitch();
        jeff.elevatorPitch();
    }
}