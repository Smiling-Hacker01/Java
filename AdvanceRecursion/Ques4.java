//Ques is to  claculate the x^n where stack height is logn
public class Ques4 {
     public static int calcPowerLog(int x, int n){
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            int halfpower = calcPowerLog(x, n/2);
            return halfpower * halfpower;
        }
        return x * calcPowerLog(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2; // Base
        int n = 3; // Exponent
        int result = calcPowerLog(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }
}
