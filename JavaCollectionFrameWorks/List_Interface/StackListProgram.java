import java.util.Stack;
public class StackListProgram {
    public static void main(String[] args){
        Stack<String> list = new Stack<>();
        list.push("Vishal Singh Kushwaha");
        list.push("Ramanujan Singhania");
        list.push("Raghvendra Singh Kushwaha");
        System.out.println(list);
        String FirstElem = list.peek();
        System.out.println(FirstElem);
        System.out.println( "Removed element from the stack : " + list.pop());
        System.out.println(list.isEmpty());
        System.out.println(list.search("Aman mansoori"));
    }
}
