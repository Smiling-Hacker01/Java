//Ques 2 says Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
import java.util.Scanner;
import java.util.LinkedList;
public class Ques2 {
    static LinkedList<Integer> list = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    //taking elements from the user and adding in the list
    public void addNodes(int size){
     if (size > 50) {
        System.out.println("Invalid Size");
        return;
     }
     System.out.println("Please enter elements in b/w 1-50");
     int element;
     for (int i = 0; i < size; i++) {
        element = sc.nextInt();
        list.add(element);
     }
    }

    //Printing the current list
    public void printList(){
        if (list.isEmpty()) {
            System.out.println("Lsit is empty nothing to print.");
            return;
        }
        int i = 0;
        while (i < list.size()) {
            System.out.print(list.get(i) + " -> ");
            i++;
        }
        System.out.println("Null");
    }
    //deleting elements greater than 25
    public void deleteNode(){
        if (list.isEmpty()) {
            System.out.println("List is empty.Nothing to delete");
            return;
        }
       for (int i = 0; i < list.size(); i++) {
          while (list.get(i) > 25) {
            list.remove(i);
          }
       }
    }

    public static void main(String[] args){
     Ques2 list = new Ques2();
     System.out.println("Enter number of elements you want to enter; Allowed range(1-50) : ");
     int size = sc.nextInt();
     list.addNodes(size);
     list.printList();
     list.deleteNode();
     list.printList();
     sc.close();
    }
    
}
