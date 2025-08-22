import java.util.Queue;
public class JCFQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        System.out.println("Removed element: " + queue.remove());
        System.out.println(queue);
        System.out.println("Front element: " + queue.peek());
        System.out.println(queue);
    }
}
