//code is to build logic by printing different type of patterns
public class AllPatterns {
    //shape one
    public static void shapOne(int n){
          if(n == 0) return;
          for(int i = 0; i<n; i++){
              for(int j = 0; j<n; j++){
                 System.out.print("*");
              }
              System.out.println();
          }
    }
   //shape 2
   public static void shapeTwo(int n){
      if(n <= 0) return;
      for (int i = 0; i < n; i++) {
           for(int j = 0; j <= i; j++){
              System.out.print("* ");
           }
           System.out.println();
      }
   }

  //shape 3
   public static void shapeThree(int n){
      if(n <= 0) return;
      for (int i = 1; i <= n; i++) {
           for(int j = 1; j <= i; j++){
              System.out.print(j +" ");
           }
           System.out.println();
      }
   }
   //shape 4
      public static void shapeFour(int n){
      if(n <= 0) return;
      for (int i = 1; i <= n; i++) {
           for(int j = 1; j <= i; j++){
              System.out.print(i +" ");
           }
           System.out.println();
      }
   }
 //shape 5
     public static void shapeFive(int n){
      if(n <= 0) return;
      for (int i = n; i >= 0; i--) {
           for(int j = i; j >=0; j--){
              System.out.print("* ");
           }
           System.out.println();
      }
   }
   //shape 6
    public static void shapeSix(int n){
      if(n <= 0) return;
      for (int i = 0; i < n; i++) {
           for(int j = 1; j <= n-i; j++){
              System.out.print(j + " ");
           }
           System.out.println();
      }
   }
  //shape 7
   public static void shapeSeven(int n){
      if(n <= 0) return;
      for (int i = 0; i < n; i++) {
         for(int k = 0; k < n-i-1; k++){
               System.out.print(" ");
         }
           for(int j = 0; j <= 2*i; j++){
              System.out.print("*");
           }
         // for(int s = 0; s < n-i-1; s++){
         //     System.out.print(" ");      // to print space after the star but not needed usually code will still run
         // }
           System.out.println();
      }
   }

   //shape 8
   public static void shapeEight(int n){
      if(n <= 0) return;
      for(int i = n-1; i >= 0; i--){// outer loop from n-1 to 0 
          //space
          for(int k = 0; k < n-i-1; k++){
              System.out.print(" ");
          }
          //start
          for(int j = 0; j <= 2 *i; j++ ){
                System.out.print("*");
          }
          //space
          for(int s = 0; s < n-i-1; s++){
               System.out.print(" ");
          }
         System.out.println();
      }
   }

   //shape 9
   public static void shapeNine(int n){
      if(n <= 0) return;
      //upper part of the diamond
      for(int i = 0 ; i < n; i++){ // outer loop from i to n-1
         //space
         for(int j = 0; j < n-i-1; j++){
             System.out.print(" ");
         }
         //shape
         for(int k = 0; k <= 2*i; k++){
             System.out.print("*");
         }
         //space
         for(int l = 0; l < n-i-1; l++){
             System.out.print(" ");
         }
         System.out.println();
      }
      //lower part of the diamond
        for(int i = n-1; i >= 0; i--){// outer loop from n-1 to 0 
          //space
          for(int k = 0; k < n-i-1; k++){
              System.out.print(" ");
          }
          //start
          for(int j = 0; j <= 2 *i; j++ ){
                System.out.print("*");
          }
          //space
          for(int s = 0; s < n-i-1; s++){
               System.out.print(" ");
          }
         System.out.println();
      }
   }

   //shape 10
   public static void shapeTen(int n){
      if(n <= 0) return;
      for(int i = 1; i <= 2*n-1; i++){ // outer loop from 0 to 2n - 1
         int shape = i;
         if(i > n) shape = 2*n - i;
          for(int j = 1; j <= shape; j++){
             System.out.print("*");
          }
          System.out.println();
      }
     
   }
   //shape 11
   public static void shapeEleven(int n ){
      if(n <= 0) return;
      for(int i = 1; i <= n; i++){
           for(int j = i; j > 0; j--){
               if(j % 2 == 0) System.out.print(0 + " ");
               else{
                  System.out.print(1 + " ");
               }
           }
           System.out.println();
      }
   }
   //shape 12
   public static void shapeTwelve(int n){
      if(n <= 0) return;
      for(int i = 1; i <= n; i++){
          for(int j = 1; j <= i; j++){
               System.out.print(j);
          }
          for(int k = 1; k <= (n-i) + (n-i); k++ ){
               System.out.print(" ");
          }
          for(int l = i; l >= 1; l--){
              System.out.print(l);
          }
          System.out.println();
      }
   }
   //shape 13
   public static void shapeThirteen(int n){
      if(n <= 0) return;
      int count = 1;
      for(int i = 1; i <= n; i++){
         for(int j = 1; j <= i; j++){
             System.out.print( count + " ");
             count++;
         }
         System.out.println();
      }
   }
//shape 14 Diagonal square 
public static void shapeFourTeen(int n){
    int[][] mat = new int[n][n];
    int num = 1;
    for(int sum = 0; sum <= 2 * (n - 1); sum++){ // sum reprsents the sum arr[i][j] => (i+j)
          //for even diagonal
          if (sum % 2 == 0) {
             for(int i = 0; i < n; i++ ){
               int j = sum - i;
               if (j >= 0 && j<n) {
                  mat[i][j] = num++;
               }
             }
          }
          else{
            for(int i = n-1; i>=0; i--){
                int j = sum - i;
                if (j >= 0 && j < n) {
                   mat[i][j] = num++;
                }
            }
          }
    }
    //to print the matrix
    for(int i = 0; i < n; i++){
        for(int j = 0 ; j < n; j++){
             System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
}
    //main function
    public static void main(String[] args) {
        int n = 5;
        // shapOne(n);
        // shapeTwo(n);
        // shapeThree(n);
        // shapeFour(n);
        // shapeFive(n);
        // shapeSix(n);
        // shapeSeven(n);
       //  shapeEight(n);
      //  shapeNine(n);
      // shapeTen(n);
      // shapeEleven(n);
      // shapeTwelve(n);
      // shapeThirteen(n);
      shapeFourTeen(4);
    }
}
