// code is to find the max freq of an array element using an hash map
import java.util.HashMap;
public class MaxFreqHashMap{
    public static int maxFreq(int[]nums, int k){
       if(nums.length < 0) return  0;
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
           if(!map.containsKey(nums[i])){
               map.put(nums[i] , 1);
           }
           else{
            map.replace(nums[i], map.get(nums[i]) + 1);
           }
       }

       return map.get(k);
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {1,2,4,1,3,1,4,12};
        int result = maxFreq(nums, 12);
        System.out.println("The max Freq of element k in an array is " + result);
    }
}