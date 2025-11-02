//functions to check if the string is palindrome or not
public class Ques4 {
    public static String reverseString(String str, String newStr, int index){
        if (index < 0) {
            return newStr;
        }
        char currentChar = str.charAt(index);
        return reverseString(str, newStr+currentChar, index-1);
    }
    public static boolean ispalindrome(String str){
       String rev =  reverseString(str, "", str.length()-1);
       if (rev.equals(str)) {
          return true;
       }
       return false;
    }
    //main function
    public static void main(String[] args){
        String str = "abba";
       boolean result =  ispalindrome(str);
       System.out.println(result);
    }
}
