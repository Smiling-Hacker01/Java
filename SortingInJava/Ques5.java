//Ques is to implement the quick short algorithm in java
//time complexity average case O(n logn) and worst case O(n^2)
public class Ques5 {
    //function to partition the array
    public static int partition(int[]array, int low, int high){
        int pivot = array[high];
        int i = low-1;
        for(int j = low; j < high; j++){
            if (array[j] < pivot) {
                i++;
               int temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[high] = temp;
        return i;
    }
    //function to implement quick short
    public static void quickShort(int[]array, int low, int high){
        if (low < high) {
            int pidx = partition(array, low, high);
            quickShort(array, low, pidx-1);
            quickShort(array, pidx+1, high);
        }
    }
    //main function
    public static void main(String[] args){
        int[] array = {100,90,80,70,60,50};
        int n =  array.length-1;
        quickShort(array, 0, n);
        
        //to print an array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
