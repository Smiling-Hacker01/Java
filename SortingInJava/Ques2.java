//ques is to srot an array using an selection sort without using a third variable
public class Ques2 {
    public static void main(String[] args){
        int[] array = {100,90,80,70,60,50};
        //selection sort
        for(int i = 0; i < array.length; i++){
            int smallest = i;
            for(int j = i+1; j < array.length; j++){
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            // array[i] = array[smallest] ^ array[i];
            // array[smallest] = array[smallest] ^ array[i];
            // array[i] = array[smallest] ^ array[i];
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        //to print an array
        for (int num : array) {
             System.out.print(num + " ");
        }
    }
}
