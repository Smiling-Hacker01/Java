//printing all the alphabets of a string with their ascii values 
import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string");
       String str = sc.nextLine();
       for(int i = 0; i < str.length(); i++){
        char currChar = str.charAt(i);
           System.out.println(currChar + "-> ASCII value -> " + (int)currChar);
       }
       sc.close();
    }
}
