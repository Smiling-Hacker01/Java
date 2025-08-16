
// Printing the Butterfly Pattern
import java.util.*;

public class Advance{
    static Scanner sc = new  Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the Number of rows :");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= 2 *(n-i); k++){
                System.out.print(" ");
            }
            for(int m = 1; m <=i ; m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l = n; l >=1; l--){
            for(int o = l; o >= 1; o--){
                System.out.print("*");
            }
            for(int p = 2 * (n-l); p >=1; p--){
                System.out.print(" ");
            }
            for(int q = l; q >= 1; q--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Printing Solid Rhombus

class Rhombus{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= n; k++){
                System.out.print("*");
            }
            System.out.print("\n");
            }
            sc.close();
        }
    }

    // Printing the Pyramid

class Pyramid{
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
    System.out.print("Enter the number of rows :");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++){
        for(int k = 1; k <= n- i; k++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    sc.close();
   }
    }

    // Palindromic Pattern Or Pyramid 

    class PalindromicPyramid{
      static Scanner sc = new Scanner(System.in);
        public static void main(String[] args){
            System.out.print("Enter the number of rows:");
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n-i; j++){
                    System.out.print(" ");
                }
                for(int k = i; k >= 1; k--){
                    System.out.print(k);
                }
                for(int m = 2; m <= i; m++){
                    System.out.print(m);
                }
                System.out.print("\n");
            }
            sc.close();
        }
    }

    // Printing Diamond Pattern 

    class Diamond{
       static Scanner sc = new Scanner(System.in);
        public static void main(String[] args){
            System.out.println("Enter the size of Diamond:");
            int n = sc.nextInt();
            int number = 0;
            int sum ;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j<= n-i; j++){
                    System.out.print(" ");
                }
                 sum = number + i;
                for(int k = 1; k <= sum; k++){
                    System.out.print("*");
                }
                System.out.println();
                number++;
            }
           for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            sum = (number + i) - 1;
            for(int k = 1; k <= sum; k++){
                System.out.print("*");
            }
            System.out.println();
            number--;
           }
           sc.close();
        }
    }

    // Another sollution for Diamond Pattern

class Solutions {
   public static void main(String args[]) {
       int n = 5;


       //upper part
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }


       //lower part
       for(int i=n; i>=1; i--) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }   
}

