//ques is to implement a queue using two stacks
import java.util.Stack;
public class Ques1Queue {
    static class queue{
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();
        //function to check if the queue is empty
        static public boolean isEmpty(){
            return stack1.isEmpty();
        }
        //function to add elements to the queue
        static public void add(int data){
            if (stack1.isEmpty()) {
                stack1.push(data);
                return;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(data);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        //function to delete element from a queue
        static public int remove(){
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.pop();
        }
        //function to peek element at queue
        static public int peek(){
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.peek();
        }
        //function to print elements of the stack
        static public void printQueue(){
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            // while (!stack1.isEmpty()) {
            //     System.out.println(stack2.push(stack1.pop()));
            // }
            // while (!stack2.isEmpty()) {          //In this approach we are modifing the original stack which is not a good thing
            //     stack1.push(stack2.pop());
            // }
            Stack<Integer> temp = new Stack<>();
            while (!stack1.isEmpty()){
                int val = stack1.pop();
                System.out.print(val + "->");
                temp.push(val);
            }
            System.out.println("null");
            while (!temp.isEmpty()){
                stack1.push(temp.pop());
            }
        } 
    }
    //main function
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.printQueue();
        System.out.println("Peek: " + q.peek());
        System.out.println("Remove: " + q.remove());
        q.printQueue();
    }

}
