public class LinkedQueue {
    queue head = null;
    queue tail = null;
    class queue{
        int data;
        queue next;
        queue(int data){
            this.data = data;
            this.next = null;
        }
    }
    //function to add elements in a queue
    public void enqueue(int data){
        queue newNode = new queue(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    //function to remove elements from the queue
    public int dequee(){
        if (head == null) {
            System.out.println("queue is empty");
            return -1;
        }
        queue temp = head;
        if (head == tail) {
            tail = null;
            head = null;
        }
        head = head.next;
        return temp.data;
    }
    //function to peek through the first element of the queue
    public int peek(){
        if (head == null) {
            System.out.println("queue is empty");
            return -1;
        }
        return head.data;
    }
    //function to print list
    public void printQueue(){
        if (head == null) {
            System.out.println("queue is empty");
            return;
        }
        queue current = head;
        while (current != null) {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    //override function
    public String toString(){
        if (head == null){
            return "queue is empty";
        }
        StringBuilder sb = new StringBuilder();
        queue current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }
    //main function
    public static void main(String[] args){
        LinkedQueue q = new LinkedQueue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.peek());
        q.printQueue();
        q.dequee();
        System.out.println(q.peek());
        q.printQueue();
    }
}
