//code is to print the nth fibonaaci term using recursion
public class FibonaaciRecursion {
   public static int returnFibonaaci(int n){
        if(n <= 1) return n;

        return returnFibonaaci(n-1) + returnFibonaaci(n-2);
   }

   //main function
   public static void main(String[] args){
    int n = 4;
    int result = returnFibonaaci(n);
    System.out.println("The nth fibonaaci term is => " + result);
   }
}