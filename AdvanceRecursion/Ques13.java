//Ques is to print the mobile sequence of a string
public class Ques13 {
    public static String mobile[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

     public static void printMobileSequence(String str, int index, String combinations){
        if (index == str.length()) {
            System.out.println(combinations);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = mobile[currChar - '0'];
        for(int i = 0; i < mapping.length(); i++){
            printMobileSequence(str, index+1, combinations + mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printMobileSequence(str, 0, "");
    }
}
