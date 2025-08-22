//ques detecting a cycle in a lined list
public class Ques5 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //Adding element in a list
    public void addNode(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    //display function
    public void displayList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.println(current.data + "-> ");
            current = current.next;
        }
    }

    //override function
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
    
    //function to check wether the cycle exist in a linkedList
    public boolean isCycle(){
        Node hare = head;
        Node turtle = head;
        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare.equals(turtle)) {
                return true;
            }
        }
        return false;
    }

    //function to break cycle in a linkedList
    public void breakCycle(){
        Node hare = head;
        Node turtle = head;
        boolean cycleDetected = false;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare.equals(turtle)) {
                cycleDetected = true;
                break;
            }
        }
        if (cycleDetected) {
            turtle = head;
            while(hare.next != turtle.next){
                hare = hare.next;
                turtle = turtle.next;
            }
            hare.next = null;
            System.out.println("Cycle broken at node: " + hare.data);
        }
    }

    //main function
    public static void main(String[] args){
        Ques5 list = new Ques5();
        list.addNode("A");
        list.addNode("B");
        list.addNode("C");
        // Creating a cycle for testing
        list.head.next.next.next = list.head.next;
        if (list.isCycle()) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle detected");
        }
        list.breakCycle();
    }

}
