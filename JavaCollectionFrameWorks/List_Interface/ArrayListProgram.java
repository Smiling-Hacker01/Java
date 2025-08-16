import java.util.ArrayList;
import java.util.Collections;
public class ArrayListProgram{
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(0, 0);
        System.out.println(list);
        list.set(1, 1);
        list.set(2, 2);
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(2);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}