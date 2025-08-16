import java.util.*;
public class Functions{
    public static void PrintMyName(){
            System.out.println("Vishal Singh Kushwaha");
        }
    
    public static int addition(int x, int y){
        int sum = x + y; 
        return sum;
    }
    public static int multiplication(int x, int y){
        int mul = x * y ;
        return mul;
    }
    public static void factorial(int num){
        if(num <= 0){
            System.out.println("Invalid Number!");
            return;
        }
        long factorial = 1;
        for(int i = num; i >= 1; i--){
             factorial *= i;
        }
        System.out.println("Factorial of a Number " +  num  + " is : " + factorial);
        return;
    }
    public static boolean primeNum(int num){
        if(num <= 1){
            return false ;
        }
        for(int i = 2 ; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false ;
            }
        }
        return true;
    }
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
       return false;
    }
    public static void printTable(int num){
        if(num <= 0){
          System.out.print("Invalid Number");
          return;
        }
        for(int i = 1; i <= 10 ; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
    while(true){ 
        System.out.println("\nEnter your Choice :");
        System.out.println("Enter 1 for Addition :");
        System.out.println("Enter 2 for Multiplication :");
        System.out.println("Enter 3 to find Factorial :");
        System.out.println("Enter 4 to Find if The number is prime or Not :");
        System.out.println("Enter 5 to Find if The NUmber is Even or Not : :");
        System.out.println("Enter 6 to Print a Table of a Number :");
        System.out.println("Enter 7 to Exit :");
        int choice = sc.nextInt();
        switch(choice){
        case 1 : 
             System.out.println("Enter the value of numbers to Add :");
             int num1 = sc.nextInt();
             int num2 = sc.nextInt();
             System.out.println("Addition of two numbers is :-" + addition(num1,num2)); 
              break;
        case 2:
             System.out.println("Enter the value of numbers to Multiply :");
             int num3 = sc.nextInt();
             int num4 = sc.nextInt();
             System.out.println("Multiplication of two numbers is :-" + multiplication(num3,num4));
              break; 
        case 3 :
             System.out.println("Enter a number to find it's factorial :");
             int num = sc.nextInt();
             factorial(num);
               break;
        case 4 :
             System.out.println("Enter a number to find if it is a Prime Number:");
             int number = sc.nextInt();
             if(!primeNum(number)){
                System.out.println( number + " is Not a Prime Number");
             }
             else{
                System.out.println( number + " is a Prime Number"); 
             } 
             break; 
        case 5 :
             System.out.println("Enter a number to find if it it's a Even Number:");
             int evenNum = sc.nextInt();
             if(!isEven(evenNum)){
                System.out.println( evenNum + " is Not a Even Number");
             }
             else{
                System.out.println( evenNum + " is a Even Number"); 
             } 
             break; 
        case 6 :
             System.out.println("Enter a number to print it's table :");
             int tableNUm = sc.nextInt();
             printTable(tableNUm);
               break;
        case 7 : 
             System.out.println("Exiting The Program...");
             sc.close();
              return ;
              
         default : System.out.println("Invalid Choice");              
      }
       }
    }
}