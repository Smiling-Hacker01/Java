//Ques is to Remoove nth node from the end of the linked list
public class Ques3 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //function to add elements in a linked list
    public void add(int data){
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
    //function to delete a Node from the nth position from the end
    public void deleteNthFromEnd(int n){
        if(head == null || n <= 0){
            return;
        }
        if(head.next == null && n == 1){
            head = null;
            return;
        }
        int size = 0;
        Node current = head;
        while(current != null){
           size++;
           current = current.next;
        }
        if(n > size){
           return;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        Node prevNode = head;
        for(int i = 1; i < size-n; i++){
            prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
    }
    //Display Function
    public void displayList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.println(current.data + "->");
            current = current.next;
        }
    }
    // override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append("->");
            current = current.next;
        }
        sb.append("Null");
        return sb.toString();
    }

    //main function
    public static void main(String[] args){
        Ques3 list = new Ques3();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: " + list);
        list.deleteNthFromEnd(2);
        System.out.println("After deleting 2nd node from end: " + list);
    }
}
