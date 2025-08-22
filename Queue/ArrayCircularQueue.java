//ques is to implement a circular queue using arrays
public class ArrayCircularQueue {
    class queue{
        int size;
        int array[];
        int rear;
        int front;
        queue(int size){
            this.size = size;
            array = new int[size];
            front = -1;
            rear = -1;
        }
        //function to check if queue is empty
        public boolean isEmpty(){
            return front == -1;
        }
        //function to check if queue id full
        public boolean ifFull(){
            return (rear + 1) % size == front;
        }
        //function to add elements in a queue
        public void add(int data){
            if (ifFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear +1) % size;
            array[rear] = data;
            System.out.println("Inserted " + data);
        }
        //function to delete elements from a circular queue
        public void deleteElem(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return;
            }
            int data = array[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }else{
                front = (front + 1) % size;
            }
            System.out.println("element deleted " + data);
        }
        //function to view first element in a list
        public int peek(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return array[front];
        }
        //function to print list
        public void printQueue(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
           int i = front;
           while (true) {
            System.out.print(array[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i+1) % size;
           }
            System.out.println();
        }
    }
    //main function
    public static void main(String[] args){
        ArrayCircularQueue queue = new ArrayCircularQueue();
        queue circularQueue = queue.new queue(5);
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.add(4);
        circularQueue.add(5);
        circularQueue.printQueue();
        circularQueue.deleteElem();
        circularQueue.add(6);
        circularQueue.add(7);
        circularQueue.printQueue();
        System.out.println("Peek: " + circularQueue.peek());
    }
}
