import java.util.*;
public class StringBuilders{
   static Scanner sc = new Scanner(System.in);
    void reverseString(){
        StringBuilder toRev = new StringBuilder();
        toRev = new StringBuilder(sc.nextLine());
        for(int i=0; i < toRev.length()/2; i++ ){
            int startIndex = i;
            int endIndex = toRev.length()-1-i;
            char startChar = toRev.charAt(i);
            char endChar = toRev.charAt(toRev.length()-1-i);
            toRev.setCharAt(startIndex, endChar);
            toRev.setCharAt(endIndex, startChar);
        }
        System.out.println(toRev);
    }
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        System.out.println(sb.length());
        sb.replace(0,1, "H");
        System.out.println(sb);
        sb.insert(6,"Shri Ram ");
        System.out.println(sb);
        StringBuilders obj = new StringBuilders();
        obj.reverseString();
// creating a string builder object from string ( string --> StringBUilder)
String str = "vishal";
StringBuilder sbn = new StringBuilder(str);
System.out.println(sbn);
System.out.println(sbn.reverse()); // short way for reversing
if(sbn instanceof StringBuilder){
  System.out.println("It's a stringBuilder");
}
// StringBuilder to string
 str = sbn.toString();
System.out.println(str.getClass().getName());
System.out.println(sbn.getClass().getName());
System.out.println(sbn.getClass().getSimpleName());

// for checking primitive data types types
int num = 10;
System.out.println(((Object)num).getClass().getName());
System.out.println(((Object)num).getClass().getSimpleName());
sc.close();
    }
}

// some interview based questions on strings

class Sollutions{
    // ques-1 Reverse a String using StringBuilder
   static Scanner sc = new Scanner(System.in);
    public static void StringReverse(){
        System.out.println("Enter a String You want to reverse:");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i = 0; i < sb.length()/2; i++){
            int startIndex = i;
            int lastIndex = sb.length() - 1 - i;
            char firstChar = sb.charAt(i);
            char lastChar = sb.charAt(sb.length()-1-i);

            sb.setCharAt(startIndex, lastChar);
            sb.setCharAt(lastIndex, firstChar);
        }
        System.out.println(sb);
    }
    //ques-2 Remove vowels from a given string using StringBuilder
    public static void removeVowel(){
        System.out.println("Enter a String to remove vowels in it:");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder sbRemove = new StringBuilder("aeiouAEIOU");
        for(int i=0; i < sb.length(); i++){
            for(int j=0; j < sbRemove.length(); j++){
                if(sb.charAt(i) == sbRemove.charAt(j)){
                    sb.deleteCharAt(i);
                    i--;
                    break;
                }
            }
        }
        System.out.println(sb);
    }
    // ques-3 Find the first occurrence of a given character using StringBuilder
    public static void firstOccurence(){
        System.out.println("Enter a String :");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("Enter a char to find it's position in String :");
        // StringBuilder findChar = new StringBuilder(sc.next());
        char findChar = sc.next().charAt(0);
        for(int i=0; i < sb.length(); i++){
            if(sb.charAt(i) == findChar){
              System.out.println("CHaracter found at : " + (i + (1) )+ " Position");
              break;
            }
        }
    }
    public static void main(String[] args){
        // StringReverse();
        // removeVowel();
        firstOccurence();
        sc.close();
    }
}
 
