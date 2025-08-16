import java.util.TreeSet;
public class TreeHashProgram {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(9);
        set.add(89);
        set.add(1);
        System.out.println(set);
        set.remove(89);;
        System.out.println(set);
        set.add(78);
        System.out.println(set);

        System.out.println(set.headSet(67)); //all elements less than
        System.out.println(set.tailSet(4)); //all elements grateer than
    }
}
