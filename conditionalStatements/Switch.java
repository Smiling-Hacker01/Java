import java.util.*;

public class Switch {
   static Scanner sc = new Scanner(System.in);
    public static void main( String[] args){
        System.out.println("Enter a Number Between 1 to 3  to get greetings :");
        System.out.println("1.Indian Greetings\n2.Western Greetings\n3.French Greetings\n4.Exit");
        int Num = sc.nextInt();
        switch(Num){
            case 1 : 
            System.out.println("Namaste! Doston");
            break;
            case 2 :
            System.out.println("Hello! Guys");
            break;
            case 3 :
            System.out.println("Bonjour! Haramkhor");
            break;
            case 4 :
            System.out.println("Exiting Program, Good Bye !");
            sc.close();
            return ;    
            default :
            System.out.println("Invalid Choice");    
        }
    }

}