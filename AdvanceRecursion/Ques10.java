//Ques is to remove duplicated from a string
public class Ques10 {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int index, StringBuilder newStr){
        if (index == str.length()) {
            System.out.println(newStr.toString());
            return;
           }
        if (map[str.charAt(index) - 'a']) {
             removeDuplicates(str, index + 1, newStr);
        }
        else{
            map[str.charAt(index) - 'a'] = true;
            newStr.append(str.charAt(index));
            removeDuplicates(str, index + 1, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "Hello".toLowerCase();
        StringBuilder newStr = new StringBuilder();
        removeDuplicates(str, 0, newStr);
    }
}
