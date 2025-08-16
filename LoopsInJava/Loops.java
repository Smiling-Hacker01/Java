// Program to print ( Hello World!) 100 times

import java.util.*;

public class Loops {

public static void main(String[] args ){

for(int i = 0; i < 100; i++){
  System.out.println("Hello World!");
}
}

}

// program to print Table of a User Defined Number

class Table{
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args){
        System.out.println("Enter A Number To Find its Table");
        int number = sc.nextInt();
        int i = 1;
        while(i <=10){
            System.out.println(number +" * " + i + " = " + number * i  );
            i++;
        }
        sc.close();
    }
}

// Program to perform (do-while) Loop

class Dowhile{

public static void main( String[] args){
    int i = 12;
   do{
    System.out.print("I will be the world best programmer\n");
   }while(i < 11);
}

}

// Program to print all even Numbers Till (N)

class Evennum {
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args){
        System.out.println("Enter a number to Find all even Numbers Until the Number");
        int number = sc.nextInt();
        
        for(int i = 0 ; i <= number; i++){
            if(i % 2 == 0){
              System.out.print(i + "\n");
            }
        }
        sc.close();
    }
}

// infinite Loop

class Ques2 {
    public static void main(String[] args){
        for(; ;){
            System.out.println("Vishal Kushwaha");
        }
    }
}

// ques 3

class Ques3{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int number ;
        do{
            System.out.println("1.Enter Your Marks");
            System.out.println("0.Exit the program");
            number = sc.nextInt();
            if(number == 1){
                System.out.println("Enter your Marks out of (100)");
                int marks = sc.nextInt();
                if(marks >= 90 && marks <= 100){
                    System.out.println("This is Good");
                }else if(marks >= 60 && marks <= 89){
                    System.out.println("This is Also Good");
                }else if(marks >= 0 && marks <= 59){
                    System.out.println("This is Good as Well");
                }else if(marks > 100 || marks < 0){
                    System.out.println("Invalid Marks");
                }
            }
            else{
                return ;
            } 
        }while(number != 0);
        sc.close();
    }
}

// ques number is prime or not ( i.e divisible by 1 and divisible by itself)

class PrimeNum{
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args ){
        System.out.println("Enter a Number to find Out Whether it is prime or not");
        int number = sc.nextInt();
       boolean isPrime = true ;
       if(number <= 1){
        System.out.println("Please provide a Number greater than 1");
       }
       for(int i=2; i * i <= number; i++){
        if(number % i == 0){
          isPrime = false;
          break;
        }
       }
       if(isPrime){
        System.out.println("Number is Prime");
       }
       else{
        System.out.println("Number is Not Prime");
       }
       sc.close();
    }
}