//code is to find wether the given string is plaindrome or not
public class StringPalindrome {
    public static boolean ispalindrome(String s, int index){
       if(index >= s.length() /2) return true;
       if(s.charAt(index) != s.charAt(s.length()-index - 1)) return false;
       index++;
       return  ispalindrome(s, index);
    }
    //main function
    public static void main(String[] args) {
        String s = "babbab";
        boolean result = ispalindrome(s, 0);
        System.out.println("Is the given String Palindrome? " + result);
    }
}
