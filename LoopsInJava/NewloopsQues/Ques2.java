//to print all the positive terms till n
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to start with:");
        int n = sc.nextInt();
        for(int i = n; i >=0; i -= 4){
            System.out.print(i + "-> ");
        }
        sc.close();
    }
}
