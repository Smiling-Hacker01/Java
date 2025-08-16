import java.util.PriorityQueue;
public class PriorityQueueProgram {
    public static void main(String[] args) {
        PriorityQueue<Integer> pr1 = new PriorityQueue<>();
        pr1.add(145);
        pr1.add(1);
        pr1.add(5);
        // System.out.println(pr1); // default priority (smallest first then random order).

        PriorityQueue<Integer> pr2 = new PriorityQueue<>((a, b) ->  a - b); //gives the next best element uses a heap(max, small) in backend
        pr2.add(145);
        pr2.add(1);
        pr2.add(5);
        // System.out.println(pr2);

        //Another example using classes
        PriorityQueue<students> pr3 = new PriorityQueue<>((a,b) ->  b.marks - a.marks);
        pr3.add(new students("Vishal Singh Kushwaha", 98));
        pr3.add(new students("Raghvendra Singh Kushwaha", 74));
        pr3.add(new students("Jeetendra Singh Kushwaha", 45));
        System.out.println(pr3.poll());
    }
}
//Another example of priorityQueue
class students{
    String name;
    int marks;
    students(String n, int m){
     this.name = n;
     this.marks = m;
    }
    public void printDetails(){
        System.out.println("Student name: " + name + "\n Marks Obtained : " + marks);
    }

    //Overridding toString() Function to print Studnet Information
    public String toString(){
        return name + "(" + marks + ")";
    }
}

