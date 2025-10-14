//ques is to check wether if the strings are anagram or not
public class Ques7 {
    public static boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] freq = new int[26];
        for(int i = 0; i < str1.length(); i++){
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }
        for (int f : freq) {
            if (f != 0) {
              return false;   
            }
        }
        return true;
    }
    //main function
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silenp";
        boolean result = isAnagram(str1, str2);
        System.out.println(result);
    }
    
}
