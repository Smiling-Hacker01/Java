//code is to remove duplicates from an array
import java.util.*;
public class Ques19 {
   public static int[] removeDuplicates(int[] array){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : array){
            set.add(num);
        }
        int[] result = new int[set.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = set.removeFirst();
        }
         return result;
        }  
        //main function
        public static void main(String[] args){
            int[] array = {1,2,2,3,4,4,5};
            int[] result = removeDuplicates(array);
            System.out.println(Arrays.toString(result));
        }
}
