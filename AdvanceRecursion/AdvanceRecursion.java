import java.util.HashSet;
import java.util.ArrayList;
public class AdvanceRecursion {
    public static boolean[] map = new boolean[26];
    public static String mobile[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    //Recursive function to print factorial of a number
    public static int calcFactorial(int n){
        if (n == 0) {
            return 1;
        }
        int factorial = n * calcFactorial(n-1);
        return factorial;
    }
    //funcrion to print fibonnaci sequence till nth terem
    public static void printFibonaaci(int a, int b, int i, int n){
        if(i == n){
            return;
        }
       int c = a+b;
       System.out.print(c + " ");
       i++;
      printFibonaaci(b, c, i, n);

    }
    //function to calculate x^n where stach height == n;
    public static int calcPower(int x, int n){
        if (n == 0) {
            return 1;
        }
        return x * calcPower(x, n-1);
    }
    //function to calculate x^n where stack height == log n;
    public static int calcPowerLog(int x, int n){
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            int halfpower = calcPowerLog(x, n/2);
            return halfpower * halfpower;
        }
        return x * calcPowerLog(x, n-1);
    }
    //Function to solve tower of hanoi problem
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n == 1) {
            System.out.println("Transfer of disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
            System.out.println("Transfer of disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    //function to reverse a string
    public static void revString(String str, int index){
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index) + " ");
        revString(str, index-1);
    }
    //function to print the first and last occurence of a char in a string
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
    //check if array is sorted[Strictly increasing]
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
    //function to move all x to the end of the string
    public static String moveX(String str,int index,int count){
        if (index == str.length()) {
            StringBuilder sb = new StringBuilder();
            for(int i =0; i<count; i++){
                sb.append('x');
            }    
            return sb.toString();
        }
        char curr = str.charAt(index);
        if (curr == 'x') {
            return moveX(str, index+1, count+1);
        }
        else{
            return curr + moveX(str, index+1, count);
        }
    }
    //function to remove duplicates from a string
    public static void removeDuplicates(String str, int index, StringBuilder newStr){
        if (index == str.length()) {
            System.out.println(newStr.toString());
            return;
           }
        if (map[str.charAt(index) - 'a']) {
             removeDuplicates(str, index + 1, newStr);
        }
        else{
            map[str.charAt(index) - 'a'] = true;
            newStr.append(str.charAt(index));
            removeDuplicates(str, index + 1, newStr);
        }
    }
    //function to print the subsequemce of a string 
    public static void printSubsequence(String str, int index, String newStr){
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        //if wanted to be added in a string 
        char currChar = str.charAt(index);
        printSubsequence(str, index+1, newStr + currChar);

        //if didn't wanted to be added in a string
        printSubsequence(str, index + 1, newStr);
    }
    //function to print the unique subsequence of a string 
    public static void printUniqueSubSequence(String str, int index, String newStr, HashSet<String> set){
        if (index == str.length()) {
            if (set.contains(newStr)) {
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(index);
        //if wanted to add in a sequence
        printUniqueSubSequence(str, index+1, newStr + currChar, set);
        //if didn't wanted to add in a string
        printUniqueSubSequence(str, index + 1, newStr, set);
    }
    //function to print the mobile sequence of a string 
    public static void printMobileSequence(String str, int index, String combinations){
        if (index == str.length()) {
            System.out.println(combinations);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = mobile[currChar - '0'];
        for(int i = 0; i < mapping.length(); i++){
            printMobileSequence(str, index+1, combinations + mapping.charAt(i));
        }
    }
    //function to print permuttions of a string
    public static void printPermutations(String str , String newStr){
        if (str.length() == 0) {
            System.out.println(newStr);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);//A
            String remaining = str.substring(0,i) + str.substring(i + 1); // case runs for only remaining as the substring does not include laste index give so if it is (0, i) i.e (0, 0) so the A will not be included and the remaining part will be go as a substring same follows for others.
            printPermutations(remaining, newStr + currChar);
        } //time complexity is O(n!)
    }
        // function to count total paths in a maze to move from (0,0) to (n,m)
        public static int countPath(int i, int j, int n , int m){
            if (i == n || j == m) {
                return 0;
            }
            if (i == n-1 && j == m-1) {
                return 1;
            }
            int downPaths = countPath(i+1, j, n, m);
            int rightpaths = countPath(i, j+1, n, m);
            return downPaths + rightpaths;
        }
        //function is to place the tile of size 1*m in a floor of size n*m
        public static int placeTiles(int n, int m){
            if (n == m) {
                return 2;
            }
            if (n < m) {
                return 1;
            }
            //vertically Placement
            int vertically = placeTiles(n-m, m);
            //horizontal placement
            int horizontally = placeTiles(n-1, m);

            return vertically + horizontally;

        }
        //function to get the number of ways in which we can invite n people to a party single or in pairs
        public static int invitePeople(int n){
            if (n <= 1) {
                return 1;
            }
            //if inviting single handles
          int singleInvites =  invitePeople(n-1);
            //if inviting in pairs
          int pairInvites = (n-1) * invitePeople(n-2);
          return singleInvites + pairInvites;
         } 
         //function to print all the subsets of a n natural numbers
         public static void printSubsets(int n, ArrayList<Integer> subset){
            if (n == 0) {
                System.out.println(subset);
                return;
            }
            //if wanted to come in a subset 
            subset.add(n);
            printSubsets(n-1, subset);
            //if didn't wanted to come in a subset
            subset.remove(subset.size()-1);
            printSubsets(n-1, subset);
         }
    public static void main(String[] args){
        // System.out.println(calcFactorial(5));
        // int a = 0;
        // int b = 1;
        // int n = 5;
        // int i = 1;
        // System.out.print(a + " " + b + " " );
        // printFibonaaci(a, b, i, n);
        // int x = 2;
        // int n = 3;
        // System.out.println(calcPower(x, n));
        //  System.out.println(calcPowerLog(x, n));
        // towerOfHanoi(n, "Src", "helper", "destination");
        // revString("Vishal", "Vishal".length() -1);
        // firstLastOccurence("abaacda", "abaacda".length(), 0, -1, -1, 'a');
        // int[] arr = {1,2,3,4,5,6,7,8};
        // System.out.println(isArraySorted(arr, 0));
    //   System.out.println(moveX("axbcxxd", 0, 0));;
    // removeDuplicates("abbaccda", 0, new StringBuilder());
    // HashSet<String> set = new HashSet<>();
    // printUniqueSubSequence("aaa", 0, "", set);
    // printMobileSequence("23", 0, "");
    //   printPermutations("abc", "");
    // int totalPaths = countPath(0, 0, 3, 3);
    // System.out.println(totalPaths);
    // int tileWays = placeTiles(4, 2);
    // System.out.println(tileWays);
    //  int totalways = invitePeople(4);
    //  System.out.println(totalways);
    printSubsets(3, new ArrayList<>());
    }
}