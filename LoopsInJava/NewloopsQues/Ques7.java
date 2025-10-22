public class Ques7{

//function to get the first positive number from an array 

 public static int getPositive(int[]nums){
    
   if(nums == null || nums.length == 0) return -1;
      
    int firstPositive = -1;
    
   for( int i = 0; i < nums.length; i++){
          
         if(nums[i] >= 0){
               firstPositive = nums[i];
               break;
            }
    
     }
    
     if( firstPositive >= 0){

        return firstPositive;
      }
  
    return -1;
    
}

//main function
 
public static void main(String[] args){
   int[]nums = {-1,-2,-3,-9,-7};
   int result = getPositive(nums);
   if(result >= 0){
      System.out.println("The first positive number of the array is " + result);

     }else{
       System.out.println("No Positive element is found " + result);
      }

}


}