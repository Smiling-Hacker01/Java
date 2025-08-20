public class ScratchStack {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Stack empty function
    public static boolean isEmpty(){
        return head == null;
    }
    //Push function
    public static void push(int data){
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return; 
        }
        newNode.next = head;
        head = newNode;
    }
    //pop function
    public static int pop(){
        if (isEmpty()) {
           return -1; 
        }
        int poppedData = head.data;
        head = head.next;
        return poppedData;
    }
    //peek function
    public static int peek(){
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    //main function
    public static void main(String[] args){
        ScratchStack stack = new ScratchStack();
        push(1);
        push(2);
        push(3);
        while (!isEmpty()) {
            System.out.println(peek());
            pop();
        }
        System.out.println("Top element is: " + peek());
        System.out.println("Popped element is: " + pop());
        System.out.println("Top element is: " + peek());
    }
    

}
