public class ArrayQueue {
    class queue{
         int front,rear,size;
         int[]array;
         queue(int n){
            this.size = n;
            array = new int[size];
            this.front = -1;
            this.rear = -1;
        }
        //function to check if queue is empty
        public boolean isEmpty(){
            return rear == -1;
        }
        //function to check if queue is full
        public boolean isFull(){
            return rear == size - 1;
        }
        //function to add elements to the queue
        public void add(int data){
           if (isFull()) {
            System.out.println("Queue is full");
            return;
           }
           if (front == -1) {
            front = 0;
           }
           rear++;
           array[rear] = data;
        }
        //function to remove elements from the queue
        public int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            if (front == -1) {
                front = 0;
            }
            int data = array[front];
            for(int i = front; i < rear; i++){
               array[i] = array[i+1];
            }
            rear--;
            if (rear < 0) {
                front = -1;
            }
            return data;
        }
        //function to get front element of the queue
        public int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return array[0];
        }
        //function to print the queue
        public void printQueue(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
    //main functiion
    public static void main(String[] args) {
        queue q = new ArrayQueue().new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.printQueue();
        System.out.println("Front element is: " + q.peek());
        q.remove();
        q.printQueue();
    }
}
