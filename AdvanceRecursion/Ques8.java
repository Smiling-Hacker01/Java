//Ques is to check if array is sorted strictly increasing
public class Ques8 {
     public static boolean isArraySorted(int arr[], int index){
        if (index == arr.length-1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            index++;
        }else{
            return false;
        }
        return isArraySorted(arr, index);

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        boolean result = isArraySorted(arr, 0);
        System.out.println("Is array sorted strictly increasing? " + result);
    }
}
