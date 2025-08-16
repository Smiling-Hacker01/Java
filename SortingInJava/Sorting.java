import java.util.*;

public class Sorting{
    static Scanner sc = new Scanner(System.in);
    public static void insertionSort(){
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the Elements of an Array:");
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        } 
        System.out.println("Array before Insertion Sort :");
        for(int j = 0; j < size; j++){
            System.out.print(array[j] + " ");
        }
        // Insertion Sort
        for(int i = 1; i < size; i++){
            int currentElement = array[i];
            int j = i -1;
            while(j >= 0 && currentElement < array[j] ){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = currentElement;
        }
        System.out.println("\nArray after Insertion Sort :");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void selectionSort(){
        System.out.println("Enter the Size of an Array");
        int size = sc.nextInt();
        int newArray[]  = new int[size];
        System.out.println("Enter the Elements of an Array");
        for(int i = 0; i < size; i++){
            newArray[i] = sc.nextInt();
        }
       System.out.println("Array before Selection Sort :");
       for(int j = 0; j < size ; j++){
        System.out.println(newArray[j]);
       }
       // Selection Sort
       for(int i = 0; i < size ; i++){
        int smallestEle = i;
        for(int j = i + 1; j < size; j++){
            if(newArray[smallestEle] > newArray[j]){
              smallestEle = j;
            }
        }
        int temp = newArray[i];
        newArray[i] = newArray[smallestEle];
        newArray[smallestEle] = temp;
       }
       System.out.println("Array after Selection Sort:");
       for(int i = 0; i < size; i++){
        System.out.println(newArray[i]);
       }
    }
      
    public static void bubbleSort(){
        System.out.println("Enter the Size of an array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the Elements of an Array :");
        for(int i = 0; i < size -1; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array before Sorting");
        for(int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
        //bublle sort
        boolean flag;
        for(int k = 0; k < size-1; k++){
            flag = false;
        for(int j = 0; j < size - 1; j++ ){
            if(array[j] > array[j + 1]){
              int temp = array[j];
               array[j] = array[j + 1];
               array[j + 1] = temp;
               flag = true;
            }
        }
        if(!flag){
                System.out.println("Array Sorted in " + (k) + " Passes, No more swapping needed!");
                break;
            }
        }
          System.out.println("Array after bubble sort");
        for(int i = 0; i < size; i++){
          System.out.println(array[i]);
           }
    }
  public static void main(String[] args){
    //  bubbleSort();
    // selectionSort();
    insertionSort();
    sc.close();
  }
}
