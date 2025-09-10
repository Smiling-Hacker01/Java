public class Ques21{
    public static int countSubstring(String str){
         if (str.length() <= 0) {
            return -1;
         }
         int n = str.length();
         return n * (n+1)/2;
    }
    //main function
    public static void main(String[] args){
        int result = countSubstring("abc");
        if (result == -1) {
            System.out.println("Strings is empty");
        }
        else{
            System.out.println("number of substrings in a strings are " + result);
        }
    }
}