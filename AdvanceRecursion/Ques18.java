//code is to find the missing number from an array
public class Ques18 {
   public static int missingNum(int[]array, int n){
      int totalSum = n*(n+1)/2;
      int actualSum = 0;
      for (int num : array) {
          actualSum += num;
      }
      return totalSum - actualSum;
   }
   //main function
   public static void main(String[] args){
     int[] array = {1,2,3,4,6};
     int result = missingNum(array, 6);
     System.out.println(result);
   }
}
