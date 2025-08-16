import java.util.Vector;
public class VectorListProgram {
    public static void main(String[] args){
        Vector<Integer> list = new Vector<>();
        list.add(45);
        list.add(45);
        list.add(89);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.addFirst(45);
        System.out.println(list);
        list.removeAllElements();
        System.out.println(list);
    }
}
