//ques is to find the middle of a linked list in one pass
public class Ques6 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //function to add node in a list
    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    //function to print list
    public void printList(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    //override function of toString so that we can print list data;
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append("->");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
    //function to find a middle in a list in one pass
    public Node returnMiddle(){
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Node hare = head;
        Node turtle = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    //main method to test the code
    public static void main(String[] args) {
        Ques6 list = new Ques6();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        System.out.println("Linked List: " + list);
        Node middle = list.returnMiddle();
        System.out.println("Middle Element: " + (middle != null ? middle.data : "List is empty"));
    }
    
}
