import java.util.ArrayList;
public class ArraylistStack {
    class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        //function to find if stack is empty
        public boolean isEmpty(){
            return list.isEmpty();
        }
        //function to push element to stack
        public void push(int data){
            list.add(data);
            return;
        }
        //function to pop element from stack
        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            return list.remove(list.size() -1);
        }
        //function to peek element from stack
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() -1);
        }
    }
    //main function
    public static void main(String[] args){
        ArraylistStack Stack = new ArraylistStack();
        Stack s = Stack.new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
