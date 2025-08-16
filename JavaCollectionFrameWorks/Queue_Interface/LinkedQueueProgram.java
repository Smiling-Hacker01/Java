package Queue_Interface;
import java.util.Queue;
import java.util.LinkedList;
public class LinkedQueueProgram {
    public static void main(String[] args){
        Queue<String> linkedQueue = new LinkedList<>();
        linkedQueue.offer("Vishal Singh Kushwaha");
        linkedQueue.offer("Abhishek Singh Rajawat");
        System.out.println(linkedQueue);
        System.out.println(linkedQueue.poll());
        linkedQueue.offer("Raghvendra Singh Kushwaha");
        linkedQueue.forEach(name -> System.out.println(name));
        System.out.println(linkedQueue.peek());
    }
}
