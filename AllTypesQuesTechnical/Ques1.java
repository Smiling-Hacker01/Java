//to check if the number is prime or  handling all the edge cases
public class Ques1{
    public static boolean isPrime(int num){
       if (num <= 1) {
          return false;
       }
       if (num <= 3) {
         return true;
       }
       if (num % 2 == 0 || num % 3 == 0) {
           return false;
       }
       for(int i = 5 ; i < Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
       }
       return true;
    }
    //main function
    public static void main(String[] args){
        System.out.println(isPrime(4));
    }
}