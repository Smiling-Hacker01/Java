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

        list.addFirst("Vishal Singh Kushwaha");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();
        list.addLast("and");
        list.addLast("he");
        list.addLast("is");
        list.addLast(" a Software Enginner");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.searchNode("is");
        list.deleteMiddle("and");
        list.printList();
        System.out.println(list.getSize());
    }
}