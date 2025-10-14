//code is to remove duplicates from an array
import java.util.LinkedHashSet;
public class Ques6 {
    public static int[] removeDuplicates(int[] array){
         if (array.length <= 0) {
            return array;
         }
         LinkedHashSet<Integer> set = new LinkedHashSet<>();
         for (int num : array) {
            set.add(num);
         }
         int[]newArray = new int[set.size()];
         int i = 0;
        for (int num : set) {
            newArray[i++] = num;
        }
         return newArray;
    }
    //main function
    public static void main(String[] args){
        int[]array = {1,2,2,3,4,5,5,5,6};
       int[]result =  removeDuplicates(array);
       for (int num : result) {
          System.out.print(num + " ");
       }
    }
}
