import java.util.LinkedHashSet;
public class LinkedHashProgram {
    public static void main(String[] args){
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Vishal Singh Kushwaha");
        linkedSet.add("Raghvendra Singh Kushwaha");
        System.out.println(linkedSet);
        linkedSet.add("Ramananad Singh Kushwaha");
        System.out.println(linkedSet);
        linkedSet.add("Gyanendra Singh Kushwaha");
        System.out.println(linkedSet);
        linkedSet.forEach(name -> System.out.println(name));
    }
}
