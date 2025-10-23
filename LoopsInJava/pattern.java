// to prnt a (*)  solid-rectangle
import java.util.*;

public class pattern{
    public static void main(String[] args){
     for(int i = 1; i <= 4; i++){
        for(int j = 1; j <= 5; j++){
            System.out.print("* ");
        }
        System.out.print("\n");
     }
    }
}

// to print a hollow rectangle

class  Hollowrec {
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args){
        System.out.println("Enter the Number of Rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the Number of Columns:");
        int col = sc.nextInt();
        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < col; j++ ){
                if(i == 0 || j == 0 || i == rows-1 || j == col-1){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

// to print half pyramid

class HalfPyramid{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int k = 0; k < rows; k++ ){
            for( int j = 0; j <= k; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

// inverted Half-pyramid

class InvertedHalf{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the Number of Rows:");
        int rows = sc.nextInt();
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
                
            }
            System.out.print("\n");
        }
        sc.close();
    }
}

// inverted half pyramid 180 degree rotated

class rotatedPyramid{
 static Scanner sc = new Scanner(System.in);
 public static void main(String[] args){
    System.out.println("Enter the Number of rows:");
    int rows = sc.nextInt();
    for(int i = 1; i <= rows; i++){
        for(int j = 1; j <= rows-i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
 }

}

// printing half pyramid numbers 

class NumPyramid{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the size of Pyramid :");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}

// inverted half number pyramid 

class InvertedNum{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Eneter the size of the pyramid:");
       int n = sc.nextInt();
       for(int i = n; i >= 1; i--){
        for(int j = 1; j <= i; j++){
            System.out.print(j + " ");
        }
        System.out.print("\n");
       }
       sc.close();
    }
}

// half Pyramid Number

class NextNum{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the size of pyramid :");
        int n = sc.nextInt();
        int number = 1;
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        sc.close();
    }
}

// 0-1 Pyramid 

class ZeroOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a pyramid :");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j =1; j<=i; j++){
                int sum = (i + j);
                if(sum % 2 == 0){
                  System.out.print(1 + " ");
                }
                else if(sum % 2 != 0){
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

// printing Rhombus
class Rhombus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the Size of Rhombus:");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n; i++){
            for(int k = 1; k <= n-i ; k++){
                System.out.print(" ");
            }
            for(int j =1; j <= n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// printing a number Pyramid

class MidNumPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a pyramid :");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= n - i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}

// printing a Increasing Number Pyramid

class IncPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the size of an Pyramid: \n");
        int n = sc.nextInt();
        int number = 0;
        for(int i = 1; i <= n; i++){
            int increase = i + number;
            for(int k = 1; k <= n-i ; k++){
                System.out.print("  ");
            }
            for(int j = 1; j <= increase; j++ ){
                System.out.print(j + " ");
            }
            number++;
            System.out.println();
        }
        sc.close();
    }
}

// printing a Palindromic Number Pyramid

   class PalPyramid {
   public static void main(String args[]) {
       int n = 5;
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print("  ");
           }


           //first part
           for(int j=i; j>=1; j--) {
               System.out.print(j + " ");
           }


           //second part
           for(int j=2; j<=i; j++) {
               System.out.print(j + " ");
           }
           System.out.println();
       }
   }   
}
