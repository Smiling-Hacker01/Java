import java.util.*;
class students{
    public static void main( String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Name");
    String name = sc.nextLine();
    System.out.println("Enter Your MAth's Marks");
    int maths = sc.nextInt();
    System.out.println("Enter Your D.S Marks");
    int DS = sc.nextInt();
    System.out.println("Enter Your ITOS Mark's");
    int ITOS = sc.nextInt();
    System.out.println("Enter Your ITDB Mark's");
    int ITDB = sc.nextInt();
    System.out.println("Your Total Marks :");
    int totalMArks = maths + DS + ITOS + ITDB ;
    System.out.println("Student Name : " + name);
    System.out.println(totalMArks);
    System.out.println("Percentage Obtained :");
    double Percentage = (totalMArks / 400.0) * 100 ;
    System.out.println(Percentage +"%");
    sc.close();
    }
}