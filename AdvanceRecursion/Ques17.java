//ques is to print the numericas of roman numbers 
import java.util.*;
public class Ques17 {
    public static int romanToInt(String s){
        HashMap<Character, Integer> map = new HashMap<>();
           map.put('I', 1);
           map.put('V', 5);
           map.put('X', 10);
           map.put('L', 50);
           map.put('C', 100);
           map.put('D', 500);
           map.put('M', 1000);
        
           int total = 0;
           for(int i = 0; i < s.length(); i++){
              int currrentChar = map.get(s.charAt(i));
              if (i+1 < s.length() && currrentChar < map.get(s.charAt(i + 1)) ) {
                 total -= currrentChar;
              }else{
                total += currrentChar;
              }
           }
           return total;
    }
    //main function 
    public static void main(String[] args){
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XI"));
        System.out.println(romanToInt("L"));
        System.out.println(romanToInt("LV"));
    }
}
