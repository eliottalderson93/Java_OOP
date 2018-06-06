public class run {
    public static void main(String[] args) {
        int [] test = {1,2,3,4,5};
        LinkedList link = new LinkedList(test);
        LinkedList link2 = new LinkedList();
        link2.add(42);
        link2.printValues();
        link.printValues();
        link.pop();
        link.printValues();
    }
}