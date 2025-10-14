//code is to find the second largest elment in an array
public class Ques3 {
    public static int secondLargest(int[]array){
        if (array.length <= 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : array) {
            if (num > largest) {
                smallest = largest;
                largest = num;
            }else if(num > smallest && num != largest){
                smallest = num;
            }
        }
        if (smallest == Integer.MIN_VALUE) {
            return -1;
        }
        return smallest;
    }
    //main function
    public static void main(String[] args){
        int[]array = {12,45,65,34,67,87,76};
        int result = secondLargest(array);
        if (result == -1) {
            System.out.println("No second largest element in an array is present");
        }
        System.out.println(result);
    }
}
