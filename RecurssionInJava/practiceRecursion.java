public class practiceRecursion{
    //first program to print sum of N natural numbers
    public static int SumN(int num){
        if(num == 1){
            return 1;
        }
        return num + SumN(num -1);
    }
    int printNum(int n){
        if(n == 0){
            return 0;
        }
        System.out.println(n);
       return printNum(n-1);
    }
    public static void main(String[] args){
    //    System.out.println(SumN(10));
    practiceRecursion obj = new practiceRecursion();
    System.out.println(obj.printNum(10));
    }
}