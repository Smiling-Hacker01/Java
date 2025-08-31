//ques is to calculate the factorial of a number
public class Ques1 {
    public static int calcFactorial(int n){
        if (n == 0) {
            return 1;
        }
        int factorial = n * calcFactorial(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        int number = 5; // Change this to test different numbers
        int result = calcFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
