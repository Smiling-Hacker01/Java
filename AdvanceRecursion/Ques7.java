//Ques is to find the first and last occurence of a character in a string
public class Ques7 {
      public static void firstLastOccurence(String str, int length,int index, int start, int end,char elem){
        if (index == length) {
            if (start != -1) {
                System.out.println("Element first occurance " + start);
                System.out.println("Element last occurance " + end);
                return;
            }
            else{
                System.out.println("Element not found");
            }
               return;
        }
         if (str.charAt(index) == elem) {
                if (start == -1) {
                    start = index;
                }
                end = index;
            }
            index++;
            firstLastOccurence(str, length, index, start, end, elem);
    }
    public static void main(String[] args) {
        String str = "Hello";
        char elem = 'l';
        firstLastOccurence(str, str.length(), 0, -1, -1, elem);
    }
}
