import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not");
        int num = sc.nextInt();
        boolean isPrime = true; // assume prime first

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++){ // check till sqrt(num)
                if (num % i == 0) {
                    isPrime = false;
                    break; // no need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is composite (not prime)");
        }
        sc.close();
    }
}
