//Ques is to solve the tower of hanoi problem
public class Ques5 {
     public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n == 1) {
            System.out.println("Transfer of disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
            System.out.println("Transfer of disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, "A", "B", "C");
    }
}
