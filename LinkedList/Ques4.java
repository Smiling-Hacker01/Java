//Ques is to check wether the Linked List is a palindrome without using an extra space
public class Ques4 {
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
 public void addNode(int data){
    Node newNode = new Node(data);
    if (head == null) {
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
    if (head == null) {
        return;
    }
    Node current = head;
    while (current != null) {
        System.out.println(current.data + "-> ");
        current = current.next;
    }
    System.out.println("Null");
 }
 //override function
 public String toString(){
    StringBuilder sb = new StringBuilder();
    Node current = head;
    while (current != null) {
        sb.append(current.data).append("-> ");
        current = current.next;
    }
    sb.append("Null");
    return sb.toString();
 }
    //Another approach to find the middle hare and turtle approach
     public Node getMiddle(Node head){
        Node hare = head;
        Node turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
        }
    //function to check if the linked list is a palindrome
    public boolean isPalindrome(){
        if (head == null || head.next == null) {
            return true; 
        }
        // int size = 0;
        // Node current = head;
        // while(current != null){
        //     size++; 
        //     current = current.next;
        // }
        // Node midNode = head;
        // for(int i = 0; i < size/2 + 1; i++){
        //     midNode = midNode.next;
        // }
        //Another approach to find the middle hare and turtle approach
        Node midNode = getMiddle(head);
        Node second = midNode;
        Node first = head;
        Node prev = second;
        Node currentNode = second.next;
        Node nextNode = null;
        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = prev;

            prev = currentNode;
            currentNode = nextNode;
        }
        second.next = null;
        second = prev;
        while (second != null && first != null) {
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;

    }
    public static void main(String[] args){
        Ques4 list = new Ques4();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);
        System.out.println("Is palindrome: " + list.isPalindrome());
    }
    
}
