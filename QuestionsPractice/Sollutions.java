import java.util.*;
public class Sollutions{
    static Scanner sc = new Scanner(System.in);
//Ques-1 Enter 3 numbers from the user & make a function to print their average.
    public static float average(int num1, int num2, int num3){
        float average = (num1 + num2 + num3) / (3);
        return average;
    }
//Ques-2 Write a function to print the sum of all odd numbers from 1 to n.
public static int oddSum(int num){
    int sum = 0;
    for(int i = 1; i <= num; i++){
        if(i % 2 != 0){
          sum += i;
        }
    }
    return sum;
}
// Ques-3 Write a function which takes in 2 numbers and returns the greater of those two
 public static int isGreater(int num1, int num2){
   if(num1 > num2){
     return num1;
   }
   else{
    return num2;
   }
 }
 //Ques-4 Write a function that takes in the radius as input and returns the circumference of a circle.
 public static double circumference(int radius){
    double circum = Math.round(2 * 3.14 * radius);
    return circum;
 }
 //Ques-5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
 public static void isAligible(int age){
    if(age >= 18){
        System.out.println("You are Eligible to vote");
    }
    else if(age <= 0){
        System.out.println("Invalid Age!");
    }
    else{
        System.out.println("You are UnderAge and not Eligible for voting");
    }
 }
// Ques-6 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
 public static void countNum(int limit){
    int positiveNum = 0;
    int negativeNum = 0;
    int zeroNums = 0;
    System.out.println("Enter a Numbers till limit");
    for(int i = 1; i <= limit; i++){
        int num = sc.nextInt();
        if(num < 0){
            negativeNum++;
        }
        else if(num == 0){
            zeroNums++;
        }
        else if(num > 0){
            positiveNum++;
        }
    }
    System.out.println("Total Negative Numbers Entered : " + negativeNum);
    System.out.println("Total Positive Numbers Entered : " + positiveNum);
    System.out.println("Total Zeroes Entered : " + zeroNums);
 }
//Ques-7 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
  public static int numPower(int num, int power){
     int result = 1 ;
     if(power == 0){
        return 1;
     }
    for(int i = 1; i <= power; i++){
        result *= num;
    }
     return result ;
     // simple way int result = Math.pow(num, power); return result;
  }
//Ques-8 Write a function that calculates the Greatest Common Divisor of 2 numbers. 
public static int gcd(int num1, int num2){
     while(num2 != 0){
        int temp = num2;
        num2 = num1 % num2;
        num1 = temp;
     }
     return num1;
}
//Ques-9 Write a program to print Fibonacci series of n terms where n is input by user :

public static void Fibonacci(int num){
 int lastPrev = 0;
 int pre = 1;
 System.out.print(lastPrev + " " + pre + " ");
 for(int i = 2; i < num; i++){
    int next = lastPrev + pre;
    System.out.print(next + " ");
    pre = next;
    lastPrev = pre;
 }
 System.out.println();
}
// while using recursive case
//public static int fibonacci(int n) {
//     if (n <= 1) {
//         return n; // Base case
//     }
//     return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
// }

// public static void main(String[] args) {
//     int n = 10;
//     for (int i = 0; i < n; i++) {
//         System.out.print(fibonacci(i) + " ");
//     }
// }
 // main function
    public static void main(String[] args){
        while(true){
        System.out.println("\nEnter your Choice");
        System.out.println("Enter 1 to Find Average of Three Numbers :");
        System.out.println("Enter 2 to Find Sum Of Odd Numbers till N");
        System.out.println("Enter 3 to Find The Greater Number :");
        System.out.println("Enter 4 to Find The Circumference of Circle :");
        System.out.println("Enter 5 to Find if you are eligible for voting :");
        System.out.println("Enter 6 to Find the count of total Positive, Negative and Zeroes Entered :");
        System.out.println("Enter 7 to Find the value of one number raised to the power of another :");
        System.out.println("Enter 8 to Calculate the GCD of the numbers :");
        System.out.println("Enter 9 to Find the fibonacci sequence of Number :");
        System.out.println("Enter 10 to Exit the Programe :");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter three numbers to find their Average : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int num3 = sc.nextInt();
                float average = average(num1,num2,num3);
                System.out.println("Average of three numbers are : " + average);
                break;
            case 2:
                System.out.println("Enter the value of N to find the Sum of all The odd numbers till N");
                int num = sc.nextInt();
                int sum = oddSum(num);
                System.out.println("The sum of all the odd Numbers is : " + sum);
                break;
            case 3:
                System.out.println("Enter two numbers to find which one is greater :");
                int FirstNum = sc.nextInt();
                int SecondNum = sc.nextInt();
                int result = isGreater(FirstNum, SecondNum);
                System.out.println("The Greater number is : " + result);
                break;
            case 4:
                System.out.println("Enter the radius of a circle :");
                int radius = sc.nextInt();
                double circleCircum  = circumference(radius);
                System.out.println("Circumferene of circle is : " + circleCircum);
                break;
            case 5:
                System.out.println("Enter your age as Per Aadhaar Card :");
                int age = sc.nextInt();
                isAligible(age);
                break;
            case 6:
                System.out.println("Enter a Limit till you want to enter number :");
                int NumLimit = sc.nextInt();
                countNum(NumLimit);
                break;
            case 7:
                System.out.println("Enter a number :");
                int newNumber = sc.nextInt();
                System.out.println("Enter a value of power rasied to the number :");
                int power = sc.nextInt();
                int powResult = numPower(newNumber, power);
                System.out.println("The value of Number raised to the power is : " + powResult);
                break;
            case 8:
                System.out.println("Enter the First number :");
                int firstNum = sc.nextInt();
                System.out.println("Enter the Second number :");
                int secondNum = sc.nextInt();
                int gcd = gcd(firstNum,secondNum);
                System.out.println("The GCD of "+ firstNum + " and " + secondNum + " is : " + gcd);
                break;
            case 9:
                System.out.println("Enter a number to find the fibonacci Sequence :");
                int fibNum = sc.nextInt();
                Fibonacci(fibNum);
                break;
            case 10:
                System.out.println("Exiting Programme...");
                sc.close();
                return;
            default:
                System.out.println("Invalid Choice");
        }
        }
    }
}