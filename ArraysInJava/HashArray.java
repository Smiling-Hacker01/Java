//ques is to find the maximum frequency of the given element
public class HashArray{
    //function is to find the maximum frequency of the each elemnt of an array if the given array could only contain elements till n. n is given 12
    public static int maxfreq(int[]nums, int k){
        if(nums.length < 0) return 0;
        int n = nums.length;
        int[]Hash = new int[13];
        for(int i = 0; i < n; i++){
              Hash[nums[i]]++;
        }
        return Hash[k];
    }
    //main function
    public static void main(String[] args) {
        int[]nums = {1,3,2,4,2,5,2,12};
        int k = 12;
        int result = maxfreq(nums, k);
        System.out.println("The max fre of an element " + k + " in an array is " + result);
    }
}