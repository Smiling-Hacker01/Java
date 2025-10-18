//code is to print the gp till nth term 
//a = 1, common ratio = 2
//formula = Tn = a.r^r-1
import java.util.Scanner;
public class Ques3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term you want GP to progress");
        int n = sc.nextInt();
        int a = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(a + "-> ");
            a *= 2;
        }
        sc.close();
    }
}