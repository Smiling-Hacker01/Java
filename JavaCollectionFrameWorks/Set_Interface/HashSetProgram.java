import java.util.HashSet;
public class HashSetProgram{
    public static void main(String[] args){
        HashSet<Integer> hash = new HashSet<>();
        hash.add(78);
        hash.add(56);
        hash.add(56);
        System.out.println(hash);
        System.out.println(hash.clone());
        hash.remove(56);
        hash.add(667);
        System.out.println(hash);
        System.out.println(hash.contains(78));
        for (Integer num : hash) {
            System.out.println(num);
        }

    }
}