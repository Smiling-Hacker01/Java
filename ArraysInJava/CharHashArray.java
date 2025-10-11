//code is to find the freq of given character in a string
public class CharHashArray {
    public static int maxFreq(String s, char c){
        if(s.length() < 0) return  0;
     // we have taken 25 because we assume the string will be in complete lower case or in complete upper case, we will have taken 256 if there is a mixup of an upper case and lower case string
     int[]Hash = new int[256]; // 25 for lowercase
     for(int i = 0; i < s.length(); i++){
          Hash[s.charAt(i) - 'A']++; //  ( char - 'a') if sure the string will be in a lower case
     }
     return  Hash[ c - 'A'];  // same (char - 'a') if sure of lower case string
    }
    //main function
    public static void main(String[] args) {
        String s = "Abaabcaddas";
        // String s = "AAABSCD";
        int result = maxFreq(s, 'A');
        System.out.println("The max freq of an character 'a' in a string is => " + result);
    }
}
