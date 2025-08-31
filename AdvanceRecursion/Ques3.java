//ques is to print the x^n where stack height is equals to n
public class Ques3 {
      public static int calcPower(int x, int n){
        if (n == 0) {
            return 1;
        }
        return x * calcPower(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2; // Base
        int n = 3; // Exponent
        int result = calcPower(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }
}
