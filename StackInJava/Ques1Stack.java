//ques is to add element at the bottom of the stack
import java.util.Stack;

public class Ques1Stack {
    //function to add a element to the bottom of the stack
    public static void pushToBottom(Stack<Integer> stack, int data){
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushToBottom(stack, data);
        stack.push(top);
    }
   //main function
   public static void main(String[] args){
      Stack<Integer> stack = new Stack<>();
       stack.push(1);
       stack.push(2);
       stack.push(3);
       pushToBottom(stack, 4);
       while (!stack.isEmpty()) {
           System.out.println(stack.pop());
       }
   }
}
