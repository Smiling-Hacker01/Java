import java.util.*;
public class DataTypes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b ;
        int mul = a * b ;
        int diff = a - b ;
        float division = (a + b) / (a - b);
        System.out.println(sum);
        System.out.println(diff);     
        System.out.println(mul);
        System.out.println(division);
        sc.close();
    }
} 
class ExtraPrimitiveDatatypes{
    public static void main(String[] args){
        byte eightBits = 123; // range -128 to 127
        System.out.println("For storing the small numbers " + eightBits);
        short sixteenBits = 20000; //range -32768 to 32767
        System.out.println( "For Storing the medium size numbers " + sixteenBits);
        int thirtyTwoBits = 44893; //range -2 billion to 2 billion
        System.out.println("For storing the large numbers " + thirtyTwoBits);
        long l = 1234567895758L; //range huge range +- 9 qunitillion; need to use the L suffix to tell the comiler its a long value;
        System.out.println("For storing very large numbers " + l);
    }
}