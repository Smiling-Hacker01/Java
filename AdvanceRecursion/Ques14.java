//code is to print the permutations of a string
public class Ques14 {
    public static void printPermutations(String str , String newStr){
        if (str.length() == 0) {
            System.out.println(newStr);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);//A
            String remaining = str.substring(0,i) + str.substring(i + 1); // case runs for only remaining as the substring does not include laste index give so if it is (0, i) i.e (0, 0) so the A will not be included and the remaining part will be go as a substring same follows for others.
            printPermutations(remaining, newStr + currChar);
        } //time complexity is O(n!)
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}
