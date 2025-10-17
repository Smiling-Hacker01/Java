//code is to orint the nth term of the Ap 
import java.util.Scanner;
public class Ques1{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of terms you want to print");
      int n = sc.nextInt();
      for(int i = 2; i <= 3*(n-1); i+=3){
            System.out.print(i + "->");
      }
      sc.close();
    }
}