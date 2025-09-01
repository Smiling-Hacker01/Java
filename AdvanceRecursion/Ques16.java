//Ques is to check wether the string is anagram or not
public class Ques16 {
    public static boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams");
            return false;
        }
        int[] freq = new int[26];
        //to add char in array
        for(int i = 0; i < str1.length(); i++){
            freq[str1.charAt(i) - 'a']++;
        }
        //to subtract them from the array
        for(int i = 0; i < str2.length(); i++){
            freq[str2.charAt(i) - 'a']--;
        }
        //to check if the strings are anagram to each other
        for(int i = 0; i < freq.length; i++){
            if (freq[i] != 0) {
                System.out.println("Strings are not anaframs");
                return false;
            }
        }
        System.out.println("Strings are anagrams");
        return true;

    }

    //main function
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";
        isAnagram(str1, str2);
    }
}
