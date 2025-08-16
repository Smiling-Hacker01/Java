public class Recursion{
    //recursive function to print n-1 numbers
    void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    //recursion functions to print numbers from 1 to 5
    void numPrint(int num){
      if(num == 6){
        return;
      }
      System.out.println(num);
      numPrint(num + 1);
    }

    // to print sum of n natural numbers 
      int sumNatural(int num , int i , int sum){
         if(num == i){
            sum += num;
            System.out.println(num);
            return sum;
         }
         sum += num;
         System.out.println(num);
         return sumNatural(num + 1, i, sum);
      }
      // to print factorial of a number 
      int factorial(int num){
        if(num == 0 || num == 1){
           return 1;
        }
        return num * factorial(num - 1);
      }
      // to print fibinacci sequence till nth term
       void printFib(int start, int end, int num){
        if(num == 0){
          return;
        }
        int thirdnum = start + end;
         System.out.print(thirdnum + " ");
         printFib(end, thirdnum, num-1);
      } 
      //printing x^n(stack height == n)
      int calcPower(int x , int n){
        if(n == 0){
          return 1;
        }
        if(x == 0){
          return 0;
        }
       int powernm1 = calcPower(x , n-1);
       int numpower = x * powernm1;
       return numpower;
      }
//printing fibonaaci sequence using recursion
public static int fibNums(int num){
  if(num == 0){
     return 0;
  }
  else if(num == 1){
    return 1;
  }
  return fibNums(num-1) + fibNums(num-2);
}
    public static void main(String[] args){
        // int end = 1;
        int num = 10;
        // int start = 0;
        // int size = 5;
        // Recursion obj = new Recursion();
        //   obj.printNum(num);
      //  System.out.println("The factorial of a number through the help of recursion is : "+ obj.factorial(size));
      //  System.out.print("The Fibonacci sequence of a number till 5 is  0 1 ");
      //  obj.printFib(start, end, num-2);
      // System.out.println(obj.calcPower(5,4));
      System.out.println("Fibonacci sequence till " + num + " is: ");
      for(int i = 0; i < num; i++){
         System.out.println(fibNums(i));
      }

    }
}