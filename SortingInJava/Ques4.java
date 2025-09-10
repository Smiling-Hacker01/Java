//implement merge sort algorithm in java
//time complexity O(n logn)
public class Ques4 {
    //function to conquer an array
    public static void conquer(int[]array, int mid, int si, int ei){
        //time complexity of conquer is O(n)
        int n = (ei - si) + 1;
       int[] merged = new int[n];
       int index1 = si;
       int index2 = mid +1;
       int x = 0;
       while(index1 <= index2 && index2 <= ei){
             if (array[index1] > array[index2]) {
                merged[x++] = array[index2++];
             }else{
                merged[x++] = array[index1++];
             }
       }
       while (index1 <= mid) {
          merged[x++] = array[index1++];
       }
       while (index2 <= ei) {
          merged[x++] = array[index2++];
       }
       //copying elements from merged array to original array
       for(int i = 0, j = si; i < merged.length; i++, j++){
          array[j] = merged[i];
       }
    }
    //function to divide an array
    public static void divide(int[]array, int si, int ei){
        //time complexity to divide is O(log n)
       if (si >= ei) {
         return;
       }
       int mid = si + (ei - si ) / 2;
       divide(array, si, mid);
       divide(array, mid+1, ei);
       conquer(array, mid, si, ei);
    }
    //main function
    public static void main(String[] args){
        int[] array = {100,90,80,70,60,50};
        divide(array, 0, array.length-1);
        //to print an array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
