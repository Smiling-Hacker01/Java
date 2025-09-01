//Ques is to print the unique subsequence of a string
import java.util.HashSet;

public class Ques12 {
     public static void printUniqueSubSequence(String str, int index, String newStr, HashSet<String> set){
        if (index == str.length()) {
            if (set.contains(newStr)) {
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(index);
        //if wanted to add in a sequence
        printUniqueSubSequence(str, index+1, newStr + currChar, set);
        //if didn't wanted to add in a string
        printUniqueSubSequence(str, index + 1, newStr, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUniqueSubSequence(str, 0, "", set);
    }
}
