import java.util.LinkedList;
public class LinkedListProgram {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Java Programing Language");
        list.add("Python Programing Language");
        System.out.println(list);
        list.addFirst("C Programing Language");
        System.out.println(list);
        list.addLast("C++ Programing Language");
        System.out.println(list);
        System.out.println("First Element : " +  list.getFirst());
        System.out.println("Last Element : " +  list.getLast());
        list.remove(1);
        System.out.println(list);
    }
}
