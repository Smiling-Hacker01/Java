//ques is to find the factorial of a number using recursion
public class Ques5 {
    public static int factorial(int num){
         if (num <= 1) {
             return 1;
         }
         return num * factorial(num -1);
    }
    //main function
    public static void main(String[] args){
        int result = factorial(5);
        System.out.println(result);
    }
}
