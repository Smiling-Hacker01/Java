//code is to print the subsequence of a string
public class Ques11 {
    public static void printSubsequence(String str, int index, String newStr){
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        //if wanted to be added in a string 
        char currChar = str.charAt(index);
        printSubsequence(str, index+1, newStr + currChar);

        //if didn't wanted to be added in a string
        printSubsequence(str, index + 1, newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsequence(str, 0, "");
    }
}
