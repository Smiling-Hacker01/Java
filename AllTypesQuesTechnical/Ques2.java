//code is to reverse a string without using a built in function
public class Ques2 {
    public static void reverseString(String str, String newStr, int index){
        if (index < 0) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);
        reverseString(str, newStr+currentChar, index-1);
    }
    //main function
    public static void main(String[] args){
       reverseString("vishal", "", "vishal".length()-1);
    }
}
