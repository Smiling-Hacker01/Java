import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the sequence");
        int n = sc.nextInt();
        int decreaser = n;
        for(int i = 1; i <= n; i++){
            if(i < decreaser){
                System.out.print(i + "->" + decreaser + "->");
                decreaser--;
            } else if(i == decreaser){
                System.out.print(i); // middle element
            }
        }
        sc.close();
    }
}
