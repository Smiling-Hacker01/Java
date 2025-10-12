//code is to reverse an array using recurssion
public class ReverseArrayRecursively {
    public static int[] reverseArray(int[]nums, int l, int r){
        if(l >= r) return nums;
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
       return reverseArray(nums, ++l, --r);
    }
    //function to print the array elements recursively 
    public static void printArray(int[]nums, int index){
       if(nums == null || nums.length == 0) return;
       if(index > nums.length-1) return;
       System.out.print(nums[index] + " => ");
       printArray(nums, ++index);
    }
    //function to reverse array using single variable 
    public static int[] reverseArraySingleVariable(int index, int[]nums){
        if(index == (nums.length/ 2) ) return nums;
         int temp = nums[index];
         nums[index] = nums[nums.length-index - 1];
         nums[nums.length-index - 1] = temp;
         return reverseArraySingleVariable(++index, nums);
    }
    //main function
    public static void main(String[] args) {
      int[]nums = {1,2,3,4,5};
      int[]reverseArray = reverseArraySingleVariable(0, nums);
      printArray(reverseArray, 0);
    }
}
