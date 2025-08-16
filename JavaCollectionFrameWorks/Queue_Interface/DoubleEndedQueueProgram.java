import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Deque;
public class DoubleEndedQueueProgram {
    public static void main(String[] args){
        ArrayDeque<Integer> dq1 = new ArrayDeque<>();
        dq1.add(90);
        dq1.add(34);
        System.out.println(dq1);
        dq1.addFirst(67);
        System.out.println(dq1);
        dq1.addLast(56);
        System.out.println(dq1);
        dq1.removeFirst();
        System.out.println(dq1);
        dq1.removeLast();
        System.out.println(dq1);

        //linked representation of deque
        Deque<Integer> dq2 = new LinkedList<>();
        dq2.add(78);
        dq2.add(56);
        System.out.println(dq2);
        dq2.addFirst(67);
        System.out.println(dq2);
        dq2.addLast(23);
        System.out.println(dq2);
        System.out.println(dq2.peekFirst());
        System.out.println(dq2.peekLast());
        dq2.removeFirst();
        System.out.println(dq2);
        dq2.removeLast();
        System.out.println(dq2);
    }
}
