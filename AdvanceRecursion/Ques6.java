//Ques is to reverse a string using recursion
public class Ques6 {
     public static void revString(String str, int index){
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index) + " ");
        revString(str, index-1);
    }
    public static void main(String[] args) {
        String str = "Hello";
        revString(str, str.length() - 1);
    }
}
