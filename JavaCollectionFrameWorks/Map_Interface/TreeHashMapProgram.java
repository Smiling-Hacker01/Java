import java.util.TreeMap;

public class TreeHashMapProgram {
    public static void main(String[] args){
        TreeMap<String, Integer> tr1 = new TreeMap<>();
        tr1.put("Vishal Singh Kushwaha", 89);
        tr1.put("Jeetendra Singh Kushwaha", 67);
        tr1.put("NawabJade Khan", 65);
        tr1.put("Fatima hattori", 23);
        System.out.println(tr1);
        tr1.replace("NawabJade Khan", 65, 45);
        System.out.println(tr1);
        System.out.println(tr1.keySet());
        System.out.println(tr1.values());
    }
}
