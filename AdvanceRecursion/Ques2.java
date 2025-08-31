//Ques is to orint the fibonaaci sereis till nth term 
public class Ques2 {
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
    public static void main(String[] args) {
        int n = 7; //number of terms
        int a = 0; //first term
        int b = 1; //second term
        System.out.print(a + " " + b + " "); //printing first two terms
        printFibonaaci(a, b, 0, n-2); //calling the function to print the rest of the terms
    }
}
