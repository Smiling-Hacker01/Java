//ques is to print the Ascii values of a String
public class Ques20 {
    public static void printAscii(String str){
        if (str.length() <= 0) {
            System.out.println("Strings is empty");
            return;
        }
        for (int i = 0 ; i < str.length(); i++) {
            System.out.println("Ascii calue of the current" + str.charAt(i) + " is " + (int)str.charAt(i));
        }
        return;
    }
    //main function
    public static void main(String[] args){
        printAscii("vishal");
    }
}
