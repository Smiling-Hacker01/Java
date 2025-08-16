public class practice {
    void towerOfHanoi(int n,String start, String Help, String Destination){
       if(n == 1){
        System.out.println("Transfer of Disk " + n + " from " + start + " to " + Destination);
        return;
       }
       towerOfHanoi(n-1, start, Destination, Help);
       System.out.println("Transfer of Disk " + n + " from " + start + " to " + Destination);
       towerOfHanoi(n-1, Help, start, Destination);
    }
    public static void main(String[] args){
    //  System.out.println("This is vishal Singh Kushwaha");
       practice obj = new practice();
       obj.towerOfHanoi(3, "start", "Helper", "Destination");
    }
}