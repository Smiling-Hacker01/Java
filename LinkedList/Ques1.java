//Ques is to Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

public class Ques1 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
           this.data = data;
           this.next = null;
        }
    }
    //function to add elements into the linked list
    public void addNode(int data){
       Node newNode = new Node(data);
       if (head == null) {
         head = newNode;
         return;
       }
       Node curNode = head;
       while (curNode.next != null) {
           curNode = curNode.next;
       }
       curNode.next = newNode;
    }

    //function to printNode
    public void printList(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }
    //function to find an element and print its index;
    public void findNode(int data){
        if (head == null) {
            System.out.println("Lsit is empty. No node present");
            return;
        }
        Node curNode = head;
        int index = 1;
        while (curNode != null) {
            if (curNode.data == data) {
                System.out.println("Element Found at Index : " + index);
                return;
            }
            curNode = curNode.next;
            index++;
        }
        System.out.println("Oh snap! Node didn't present in the list.");
    
    }

    public static void main(String[] args){
        Ques1 list = new Ques1();
        list.addNode(1);
        list.addNode(5);
        list.addNode(7);
        list.addNode(3);
        list.addNode(8);
        list.addNode(2);
        list.addNode(3);
        list.printList();
        list.findNode(7);
    }
}
