import java.util.*;

public class oddEven {
 static Scanner sc = new Scanner(System.in);
    public static void main( String[] inputs){
      System.out.println("Enter a number:");
      int number = sc.nextInt();
      if(number % 2 == 0){
        System.out.println(number + " Is Even Number");
      }
      else{
        System.out.println(number + " IS Odd Number");
      }
      sc.close();
    }
}

class condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of A :");
        int A = sc.nextInt();
        System.out.println("Enter the value of B :");
        int B = sc.nextInt();
        if(A == B){
         System.out.println("A is Equal to B ( A == B)");
        }
        else if(A > B){
          System.out.println("A is Greater than B ( A > B)");
        }
        else if(A < B){
          System.out.println("B is Greater than A ( B > A)");
        } 
        sc.close();
  } 
}