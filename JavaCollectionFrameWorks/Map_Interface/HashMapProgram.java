import java.util.HashMap;
public class HashMapProgram{
    public static void main(String[] args){
        HashMap<String, Integer> hs1 = new HashMap<>();
        hs1.put("Vishal Singh Kushwaha", 98);
        hs1.put("Raghvendra Singh Kushwaha", 78);
        hs1.put("Jeetendra Singh Kushwaha", 34);
        System.out.println(hs1);
        System.out.println(hs1.keySet());
        System.out.println(hs1.values());
        hs1.put("", 78);
        System.out.println(hs1);
        hs1.put("", 67); //not allowed and couldn't be put on the data
        hs1.containsKey("Jeetu");
        hs1.containsValue(89);
    }
}