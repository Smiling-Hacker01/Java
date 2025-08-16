import java.util.*;
class basicArray{
    public static void main(String[] args){
        int age[] = {18,19,20}; // dynamic way of arrangin an array
        System.out.println("The Age of the Student's are :");
        for(int i = 0; i < age.length; i++){
            System.out.println(age[i]);
        }
    }
}

public class Array{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
       System.out.println("Eneter the size of an array :");
       int size = sc.nextInt();
       // two ways for defining a array
       int[] marks = new int[size];
       // 2
       // int marks[] = new int[size];
       System.out.println("Enter the elements of an Array :");
       for(int i = 0; i < size; i++){
        marks[i] = sc.nextInt();
       }
       System.out.println("The Elements of an Array are:");
      for(int i = 0; i < size; i++){
        System.out.println(marks[i]);
      }
      sc.close();
    }
}
class Sollutions{
//Ques 1 Take an array of names as input from the user and print them on the screen
    static Scanner sc = new Scanner(System.in); //global scanner for all the functions
       public static void main(String[] args){
        // printName();
        // MaxAndMin();
        isSorted();
        sc.close();
        
    }
    public static void printName(){
        System.out.println("Enter the number of names you want to enter :");
        int size = sc.nextInt();
        String names[] = new String[size];
        sc.nextLine();
        System.out.println("Enter the names :");
        for(int i = 0; i < size; i++){
            names[i] = sc.nextLine();
        }
        System.out.println("Insertion Completed! here's the output :");
        for(int i = 0; i < size; i++){
            System.out.println(names[i]);
        }
    }
//Ques 2 Find the maximum & minimum number in an array of integers.
    public static void maxAndmin(){
     System.out.println("Enter the size of an array");
     int size = sc.nextInt();
     sc.nextLine();
     int array[] = new int[size];
     System.out.println("Enter the elements of an array:");
     for(int i = 0; i < size; i++){
        array[i] = sc.nextInt();
     }
     System.out.println("Elements Inserted!\n");
     System.out.println("Elements of the integer array are :");
     for(int i = 0; i < size; i++){
        System.out.print(array[i] + " ");
     }
     System.out.println("\nThe MAximum Integer in array is : ");
     int number = 0;
     for(int i = 0; i < size; i++){
        if(number < array[i]){
            number = array[i];
        }
     }
     System.out.println(number);
     System.out.println("The Minimum Interger in an array are : ");
     int minNumber = array[0];
     for(int i = 1 ; i < size; i++){
       if(array[i] < minNumber){
        minNumber = array[i];
       }
     }
     System.out.print(minNumber);
    }
    // another way of solving ques 2
    public static void MaxAndMin(){
        System.out.println("Enter the Size of an Integer Array :");
        int size = sc.nextInt();
        int myarray[] = new int[size];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("MAx value an integer can hold is " + min + " Min Value an Integer can Hold is " + max);
        System.out.println("Enter the Elements of an array :");
        for(int i = 0; i < size; i++){
            myarray[i] = sc.nextInt();
        }
        // maximum element of the array
        for(int i = 0; i < size; i++){
            if(myarray[i] > max){
              max = myarray[i];
            }
        }
        System.out.println("Maximum Element in an array are: " + max);
        // minimum element of the myarray
        for(int i = 0; i < size; i++){
            if(myarray[i] < min){
                min = myarray[i];
            }
        }
        System.out.println("Minimum Element of the array are: " + min);
    }
//Ques-3 Take an array of numbers as input and check if it is an array sorted in ascending order.
  public static int isSorted(){
    System.out.println("Enter the size of an array :");
    int size = sc.nextInt();
    boolean isAscending = false;
    int array[] = new int[size];
    System.out.println("Enter the Elements of an array:");
    for(int i = 0; i < size; i++){
      array[i] = sc.nextInt();
    }
    System.out.println("Elements Inserted!");
    System.out.println("Elements of an array are :");
    for(int i = 0; i < size; i++){
        System.out.print(array[i] + " ");
    }
    // is Array in Ascending order ?
    for(int i = 0; i < array.length - 1; i++){
        if(array[i] < array[i+1]){
           isAscending = true;
        }
        else{
        isAscending = false;
        }
    }
    if(!isAscending){
        System.out.println("Array is not sorted in ascending order!");
    }
    else{
        System.out.println("Array is Sorted in ascending order!");
    }
    return 0;
  }
}

// Two- dimensional arrya or matrix 

class Matrics{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number of rows and columns of matrics");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int array[][] = new int[rows][cols];
        System.out.println("Enter the elements of matrics");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j<cols; j++){
               array[i][j] = sc.nextInt();
            }
        }
      // print the numbers of matrics

      System.out.println("The element in matrics are");
      for(int i = 0; i < rows; i++){
        for(int j=0; j < cols; j++){
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
      }
      // enter a number to search in a matrics 
      System.out.println("Enter an element to search in a matrics");
      int element = sc.nextInt();
      boolean isFound = false;
      for(int i = 0; i < rows; i++){
        for(int j= 0; j < cols; j++){
            if(array[i][j]== element){
                System.out.println("Element found at " + i + " " + j + " index of matrics");
                isFound = true;
                break;
            } 
        }
      }
      if(!isFound){
      System.out.println("Element is not present in a matrics!");
      }
      sc.close();
    }
}
//to print a transpose of a matrix

class TransposeMatrics{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number of rows of a matrics");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns of a matrics");
        int cols = sc.nextInt();
        int newArray[][] = new int[rows][cols];
        System.out.println("Enter the elements of an array");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                newArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("The ELemnt of Matrics are: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
       System.out.println("The transpose of above matrics is shown below ");
        // now printing the transpose of a matrics 

        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// to print a spiral order matrix 
class SpiralMatrics{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number of rows of a matrics");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns of a matrics");
        int m = sc.nextInt();
        int specialArray[][] = new int[n][m];
        System.out.println("Enter the Elements of a matrics ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
              specialArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("The forme matrics with above elements are described below :");
        for(int i = 0; i < n; i++){
            for(int j = 0 ;j < m; j++){
                System.out.print(specialArray[i][j] + " ");
            }
            System.out.println();
        }
        // printing the special matrics 
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
        System.out.println("Below is The Spiral Representation of a Matrics :");
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int col = colStart; col <= colEnd; col++ ){
               System.out.print(specialArray[rowStart][col] + " ");
            }
            rowStart++;
            for(int row = rowStart; row <= rowEnd; row++){
               System.out.print(specialArray[row][colEnd] + " ");
            }
            colEnd--;
            for(int col = colEnd; col >= colStart; col--){
               System.out.print(specialArray[rowEnd][col] + " ");
            }
            rowEnd--;
            for(int row = rowEnd; row >= rowStart; row--){
               System.out.print(specialArray[row][colStart] + " ");
            }
            colStart++;
        }
        sc.close();
    }
}

class stringBuilder{
    public static void main(String[] args){
        String str = "";
        System.out.println(str);
        for(int i = 0; i <= 10; i++){
            str += i;
        }
        StringBuilder sb = new StringBuilder("");
            for(int i = 0; i <= 10; i++ ){
               sb.append(i);
        }
            System.out.println(sb);
    }

}
