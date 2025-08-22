public class ImpQuesLinkedList {
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
    //function to reverse a linked list
    public void reverseList(){
        if (head == null) {
            return;
        }
        if (head.next == null) {
            return;
        }
        Node prev = head;
        Node current = head.next;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            //Update
            prev = current;
            current = next;
        }
        head.next = null;
        head = prev;
    }
    //function to detect a cycle in a linked list
     public boolean isCycleExist(){
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }
        Node hare = head;
        Node turtle = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                return true;
            }
        }
        return false;
     }
     //function to create a cycle 
     public Node createCycle(Node head){
          if (head == null || head.next == null) {
              return null;
          }
          Node current = head;
         while (current.next != null) {
             current = current.next;
         }
         current.next = head.next;
         return head;
     }
     //functio to break cycle in  a linkedList
     public void breakCycle(){
        if (head == null || head.next == null) {
            return;
        }
        Node hare = head;
        Node turtle = head;
        boolean isCycle = false;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
               isCycle = true;
                break;
            }
        }
           if (isCycle) {
                turtle = head;
                while (hare.next != turtle.next) {
                    hare = hare.next;
                    turtle = turtle.next;
                }
                hare.next = null;
                System.out.println("Cycle broken at node: " + hare.data);
                return;
            }
     }
   //print list
   public void printlist(){
      if (head == null) {
        System.out.println("list is empty");
        return;
      }
      Node current = head;
      while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
      }
      System.out.println("Null");
   }
   //override function to print node data vlaue
   public String toString(){
     StringBuilder sb = new StringBuilder();
     Node current = head;
     while (current != null) {
       sb.append(current.data).append("-> ");
       current = current.next;  
     }
     sb.append("null");
     return sb.toString();
   }
   //main function
   public static void main(String[] args){
     ImpQuesLinkedList list = new ImpQuesLinkedList();
     list.addNode(1);
     list.addNode(2);
     list.addNode(3);
     list.printlist();
     list.reverseList();
     list.printlist();
     list.createCycle(list.head);
     System.out.println(list.isCycleExist());
     list.breakCycle();
     System.out.println(list.isCycleExist());
   }

}
