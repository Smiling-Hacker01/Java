//Tower of Hanoi
public class AdvanceRecursion{
     //function to solve tower of hanoi problem 
    public static void towerOfHanoi(int n, String src, String helper, String dest){
    if(n == 1){
        System.out.println("Transfer of Disk " + n + " From " + src + " To " + dest);
        return;
    }
    towerOfHanoi(n-1,src,dest,helper);
    System.out.println("Transfer of Disk " + n + " From " + src + " To " + dest);
    towerOfHanoi(n-1,helper,src,dest);
}

public static void reverseString(int index, String str){
    if(index < 0){
        return;
    }
    System.out.println(str.charAt(index));
    reverseString(index-1, str);
}

public static void firstLastOccurence(int first, int last, char element,int index, String str){
    if(str.isEmpty()){
        System.out.println("Error! String Not Found.");
        return;
    }

    if(index > str.length()- 1){
        if(first == -1){
            System.out.println("Element Not found!");
            return;
        }
     System.out.println("The first ocuurence of a character found at " + first + " Index.");
     System.out.println("The last ocurence of a character found at "+ last + " Index.");
        return;
    }

    if(str.charAt(index) == element){
        if(first == -1){
        first = index;
        }
        else{
            last = index;
        }
    }
firstLastOccurence(first,last,element,index+1,str);
}

public static boolean isSorted(int array[], int index){
    if(index >= array.length -1){
      return true;
    }
     if(array[index] >= array[index + 1]){
     return false;
   }
   return isSorted(array, index+1);
}

public static void moveX(int index, char element, int count, String str, String newStr){
    if(str.isEmpty()){
        System.out.println("String is Empty!");
        return;
    }
    if(index >= str.length()-1){
      for(int i = 0 ; i <= count; i++){
        newStr += element;
      }
      System.out.println("String after shifting the desired element to the end " + newStr);
      return;
    }
    if(str.charAt(index) == element){
        count++;
        moveX(index+1, element, count, str, newStr);
    }
    else{
        newStr += str.charAt(index);
        moveX(index+1, element, count, str, newStr);
    }

}
public static void removeDuplicates(int index, String str, boolean array[], String newStr){
    if(index > str.length()-1){
      System.out.println(newStr);
      return;
    }

char currentChar = str.charAt(index);
if(array[currentChar - 'a'] == true){
    removeDuplicates(index+1, str, array, newStr);
}
else{
    newStr += currentChar;
    array[currentChar - 'a'] = true;
    removeDuplicates(index+1, str, array, newStr);
}
}
public static void subsequence(int index, String str, String newStr){
    if(index > str.length() -1){
       System.out.println(newStr);
       return;
    }
    char currentChar = str.charAt(index);
    subsequence(index+1, str, newStr + currentChar);
    subsequence(index+1, str, newStr);
}
    public static void main(String[] args){
    //  String str = "abc";
    //  int n = str.length() - 1;
    //  char element = 'x';
    //  int array[] = {1,3,3,5,6};
    //  boolean flag;
    //  int index = 0;
    //  String removeX = "abcdxxx";
    //  boolean [] map = new boolean[26];
     towerOfHanoi(3,"Source","Helper","Destination");
    // reverseString(n, str);
    // System.out.println(n);
    // firstLastOccurence(-1,-1,element,0,str);
    // if(isSorted(array,index) == true){
    //     System.out.println("Array is Strictly Sorted");
    // }
    // else{
    //     System.out.println("Array is not Strictly Sorted");
    // }
    // moveX(0,element,0,removeX,"");
    // removeDuplicates(0,removeX,map,"");
    // subsequence(0,str,"");
    }
}