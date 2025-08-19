public class ScratchLinkedList{
    Node Head ;
    private int size;
    
    ScratchLinkedList(){
        this.size = 0;
    }
     class Node{
           String data;
           Node next;

           Node(String data){ 
            this.data = data;
            this.next = null;
            size++;
           }
        }
        //add first function

        public void addFirst(String data){
            Node newNode = new Node(data);
            if(Head == null){
               Head = newNode;
               return;
            }
            newNode.next = Head;
            Head = newNode;
        }
       //Add last Function
        public void addLast(String data){
             Node newNode = new Node(data);
             if(Head == null){
               Head = newNode;
               return;
            }
            Node currentHead = Head;
            while (currentHead.next != null) {
                currentHead = currentHead.next;
            }
            currentHead.next = newNode;
        }
        //Add in the middle 
        public void addMiddle(int index, String data){
          if(index > size && index < 0){
             System.out.println("Invalid Index");
             return;
          }
          size++;
          Node newNode = new Node(data);
          if (Head == null || index == 0) {
              newNode.next = Head;
              Head = newNode;
              return;
          }
          Node curNode = Head;
          for (int i = 0; i < size; i++) {
             if (i == index) {
              Node nextNode = curNode.next;
              curNode.next = newNode;
              newNode.next = nextNode;
              break;
             }
             curNode = curNode.next;
          }

        }
        //Delete First Node
        public void deleteFirst(){
            if(Head == null){
              System.out.println("List is empty nothing to delete");
              return;
            }
            Head = Head.next;
            size--;
        }
        //Delete Last Node
        public void deleteLast(){
            if (Head == null) {
                System.out.println("List is empty nothing to print");
                return;
            }
            size--;
            if(Head.next == null){
               Head = null;
               System.out.println("Node deleted successfully");
               return;
            }
            Node secondLastNode = Head;
            Node lastNode = Head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondLastNode = secondLastNode.next;
            }
            secondLastNode.next = null;
            System.out.println("Node Deleted Successfully");
        }
        //search node in a list
        public void searchNode(String data){
          if(Head == null){
            System.out.println("List is empty");
          }
          Node currHead = Head;
          while (currHead != null) {
            if (currHead.data.equals(data)) {
                System.out.println("Node Found -> " + currHead.data);
                return;
            }
            currHead = currHead.next;
          }
          System.out.println("Node does not present in the list");
        }
        //delete from the middle
        public void deleteMiddle(String data){
           if(Head == null){
            System.out.println("List is empty");
          }
          else if (Head.data.equals(data)){
            Head = Head.next;
            size--;
            return;
          }
          Node curr = Head;
          Node prev = null;
          while (curr != null) {
            if (curr.data.equals(data)) {
                prev.next = curr.next;
                size--;
                System.out.println("Deleted Node -> " + curr.data);
                return;
            }
            prev = curr;
            curr = curr.next;
          }
          System.out.println("Node does not present in the list");
        }
        //reverse a linked list iterative way
        public void iterativeReverse(){
           if (Head == null || Head.next == null) {
              return;
           }
           Node prev = Head;
           Node curr = Head.next;
           Node next = null;
           while (curr != null) {
              next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
           }
           Head.next = null;
           Head = prev;
        }
        //reverse a linkedList recursive way
        public Node recursiveReverse(Node Head){
          if (Head == null || Head.next == null) {
            return Head ;
          }
          Node newHead = recursiveReverse(Head.next);
          Head.next.next = Head;
          Head.next = null;
          return newHead;
        }
        //Print Node 
        public void printList(){
            Node currentHead = Head;
            if(currentHead == null){
               System.out.println("List is empty. nothing to print");
               return;
            }
            while (currentHead != null) {
                System.out.print(currentHead.data + " -> ");
                currentHead = currentHead.next;
            }
            System.out.println("Null");
        }
        //method to get the size of a linked list
        public int getSize(){
            return size;
        }
    public static void main(String[] args){
        //now to make list first we have to create the object of our own class.

        ScratchLinkedList list = new ScratchLinkedList();
        
        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A");
        list.printList();
        list.addLast("E");
        list.addLast("F");
        list.addLast("G");
        list.printList();
        list.addMiddle(4,"D");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.searchNode("F");
        list.deleteMiddle("D");
        list.printList();
        System.out.println(list.getSize());
        // list.iterativeReverse();
        list.Head = list.recursiveReverse(list.Head);
        list.printList();
    }
}