import java.util.*;
class Masti{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your Name :"); 
   String name = sc.nextLine();
   System.out.println("Enter your Roll No :");
   int roll_No = sc.nextInt(); 
   System.out.println("Provide your marks :");
   System.out.println("Enter your DS marks :");
   int ds = sc.nextInt();
   System.out.println("Enter your ITOS marks :");
   int itos = sc.nextInt();
   System.out.println("Enter your MAths marks :");
   int maths = sc.nextInt();
   System.out.println("Enter your CS marks :");
   int cs = sc.nextInt();
   System.out.println("Enter your ITDB marks :");
   int itdb = sc.nextInt();   

   boolean hasFailed = false ;

   System.out.println("Student Name : " + name + "\n");
   System.out.println("Student Roll No : " + roll_No + "\n");
   
   if(ds < 27){
    System.out.println("You are Failed In DS by : " + (27 -ds) + " marks\n");
    hasFailed = true ;
   }
    if(itos < 27){
    System.out.println("You are Failed In ITOS by : "+ (27 - itos )+ " marks\n"); 
      hasFailed = true ;
   }
    if(maths < 27){
    System.out.println("You are Failed In MATHS by : "+ (27 - maths) + " marks\n"); 
      hasFailed = true ;
   }
    if(cs < 27){
    System.out.println("You are Failed In CS by : "+( 27 - cs )+ " marks\n"); 
      hasFailed = true ;
   } 
    if(itdb < 27){
    System.out.println("You are Failed In ITDB by : "+ (27 - itdb) + " marks\n"); 
      hasFailed = true ;
   }  
   else if(!hasFailed){
    System.out.println("You are Passed In All Subjects\n");
   }
   int total = ds + itos + maths + cs + itdb ;
   System.out.print("Total Marks Obtained : " + total + " Out of 500\n\n");
   double percentage = (total / 500.0) * 100 ;
   System.out.println("Percentage Obtained : " + percentage + "%");
   
   // Grades of Students
   
  if(percentage > 90){
  System.out.println("Outstanding Performance -- Grade (A+)");
  System.out.println("I'm So Proud Of You");
  }

 else if(percentage > 80 && percentage < 90){
    System.out.println("Excellent Performance -- Grade (A)");
     System.out.println("Wow!");
 }
 else if(percentage < 80 && percentage > 70){
    System.out.println("Very Good Performance -- Grade (B+)");
     System.out.println("Hurray!");
 } 
 else if(percentage > 60 && percentage < 70){
    System.out.println("Good Performance -- Grade (B)");
     System.out.println("You Can Do Better");
 } 
 else if(percentage > 50 && percentage < 60){
    System.out.println("Average Performance -- Grade (C)");
    System.out.println("You Can Do Better");
 }
 else if(percentage > 40 && percentage < 50){
    System.out.println("Poor Performance -- Grade (D)");
    System.out.println("You Need To Work Hard");
 } 
 else if(percentage > 30 && percentage < 40){
    System.out.println(" Very -Poor Performance -- Grade (E)");
    System.out.println("You Need To Work Hard");
 } 
 else if(percentage > 20 && percentage < 30){
    System.out.println("Worst performance  -- Grade (F)");
    System.out.println("You Need To Work Hard");
 } 
 else if(percentage < 20){
    System.out.println("Worst performance  -- Grade (G)");
    System.out.println("You are a Failure");
 } 
 sc.close();
}
}