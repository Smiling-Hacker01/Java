//sort an array using insertion sort
public class Ques3 {
    public static void main(String[] args){
        int[] array = {100,90,80,70,60,50};
        for(int i = 1; i < array.length; i++){
            int current = array[i];
            int j = i-1;
            while (j >=0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        //to print an array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
