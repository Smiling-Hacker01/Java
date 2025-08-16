public class Bit{
    public static void main(String[] args){
        //ques-1 Get the 3rd Bit (position = 2) of a number n. (n = 0101);
        int n = 5; //(Decimal value of n which is 0101)
        int position = 2;
        int bitMask = 1 << position;
        int getBit = bitMask & n ;
        System.out.println(getBit);
        // set
         int setPos = 1;
         int setBit = 1 << setPos;
         int finalBit = setBit | n ;
         System.out.println(finalBit);
         //Clear
         int clearPos = 2;
         int clearBit = 1 << clearPos;
         int notOPerator = ~clearBit;
         int finalClear = notOPerator & n;
         System.out.println(finalClear);
         // update
         
    }
} 