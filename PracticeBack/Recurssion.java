// code is to solve some basics of recursion and backtracking
public class Recurssion {
  // function to print name 5 times
  public static void printName(String s, int counter){
     if(counter == 5) return;
     System.out.println(s);
     counter++;
     printName(s, counter);
  }
  //print linearly from 1 to n
  public static void printLinearly(int n, int count){
     if(count == n) return;
     count++;
     System.out.print(count + " ");
     printLinearly(n, count);
  }
  //print from n to 1
  public static void printReverse(int n){
    if(n <= 0) return;
    System.out.print(n + " ");
    printReverse(n-1);
  }
 // print linearly from 1 to n by backtrack
 public static void printLinearlyBackTrack(int n){
       if(n <= 0) return;
       printLinearlyBackTrack(n-1);
       System.out.print(n + " ");
 }
 //print from n to 1 by backtrack 
 public static void printBackBackTrack(int n, int i){
    if(i == n) return;
    i++;
    printBackBackTrack(n, i);
    System.out.print(i + " ");
 }
 //function to print the summation of first n natural numbers
 public static int sumOfNaturals(int n, int sum){
    if(n < 1) return sum;
    sum += n;
    return sumOfNaturals(n-1, sum);
 }
 //function to print the summation of number without the extra parameter sum this type is also called functional recursion
 public static int returnSum(int n){
    if(n == 0) return 0;
     return n + returnSum(n - 1);
 }
 //function to find the factorial of a number 
 public static int factorial(int n){
    if( n == 1) return n;
    
     return n * factorial(n-1);
 }
  //main function
  public static void main(String[] args) {
    //   printName("Vishal", 0);
    //   printLinearly(5, 0);
    //   printReverse(5);
    //   printLinearlyBackTrack(5);
    // printBackBackTrack(5, 0);
   //System.out.print(sumOfNaturals(3, 0));
     System.out.println(returnSum(3));
     System.out.println(factorial(5));
  }
}