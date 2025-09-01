//code to print the Ascii Values of a every string Character
public class Ques15 {
    public static void printAscii(String str){
        if (str.length() <= 0) {
            System.out.println("String is empty");
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            System.err.println("The ASCII value of " + currChar + " is " + (int)currChar);
        }
        return;
    }
    public static void main(String[] args){
        String str = "Vishal";
        printAscii(str);
    }
}
