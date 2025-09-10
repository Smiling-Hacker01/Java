//Sort an element of an array using the bubble sort technique and without using a third variable
public class Ques1 {
    public static void main(String[] args){
        int[] array = {90,80,70,60,50};
        //bubble sort implementation
        //time complexity O(n^2) because in second loop we ingnore costant
        for(int i = 0; i < array.length-1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]) {
                    array[j] = array[j] ^ array[j+1];
                    array[j+1] = array[j] ^ array[j+1];
                    array[j] = array[j] ^ array[j+1];
                }
            }
        }
        //to print an sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
