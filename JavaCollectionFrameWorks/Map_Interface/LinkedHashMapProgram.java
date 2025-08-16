import java.util.LinkedHashMap;
//keeps the order same in which the data is inserted
public class LinkedHashMapProgram {
    public static void main(String[] args){
        LinkedHashMap<String, String> hs1 = new LinkedHashMap<>();
        hs1.put("Name1", "Vishal Singh Kushwaha");
        hs1.put("Name2", "Raghvendra Singh Kushwaha");
        hs1.put("Name3", "Jeetendra Singh Kushwaha");
        System.out.println(hs1);
        System.out.println(hs1.keySet());
        System.out.println(hs1.values());
        hs1.remove("Name3", "Jeetendra Singh Kushwaha");
        System.out.println(hs1);
        hs1.replace("Name2", "Raghvendra Singh Kushwaha", "Aman Mansoori");
        System.out.println(hs1);
    }
}
