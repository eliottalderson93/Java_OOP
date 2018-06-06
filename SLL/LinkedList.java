public class LinkedList{ //classes are always pointers
    public Node head; //node pointer
    public LinkedList(){
        this.head = null; //node pointer
    }
    public LinkedList(int [] values){
        this.head = null; //node pointer
        for (int i = 0; i<values.length;i++){
            this.add(values[i]);
        }
    }
    public void add(int value) { //from platform
        Node newNode = new Node(value);
        if(this.head == null) { //head is a pointer
            this.head = newNode;
        } 
        else {
            Node runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void pop(){ //removes last node
        Node runner = this.head;
        Node detachNode = null;
        if (runner == null){
            System.out.println("Cannot pop off of an empty list");
            return;
        }
        if (runner.next == null){ //only one node
            detachNode = runner;
        }
        while(runner.next != null) { //goes to end of list //multiple nodes
            if (runner.next.next == null){
                detachNode = runner; //second to last node
            }
                runner = runner.next;
            }
        detachNode.next = null; //pops off last node //auto memory management
    }
    public void printValues(){ //prints all values
        Node runner = this.head;
            while(runner != null) { //goes to end of list
                System.out.println(runner.value);
                runner = runner.next;
            }
    }
    // public String getDesc(){
    //     //return this.desc;
    // }
    // public void changeName(String newName){ //to chain it requires String or LinkedList return
    //     //this.name = newName;
    // }
    // public void changeDesc(String newDesc){
    //     //this.desc = newDesc;
    // }
}
