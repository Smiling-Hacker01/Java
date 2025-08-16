// Ques1 -Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
public class Strings{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of names you want to enter :");
     int size = sc.nextInt();
     int totalLength = 0;
     String studentNames[] = new String[size];
     System.out.println("Enter students names :");
     sc.nextLine();
     for(int i = 0; i < size; i++){
        studentNames[i] = sc.nextLine();
     }
     System.out.println("You have entered following Students names :");
     for(int i = 0; i < size; i++){
        System.out.println(studentNames[i]);
        totalLength += studentNames[i].length();
     }
     System.out.println(String.format("The combine length of all the names you entered is %d",totalLength));
     sc.close();
    }
}

//Ques 2 - Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

class ques2{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of names you want to enter :");
      int Size = sc.nextInt();
      String names[] = new String[Size];
      sc.nextLine();
      System.out.println("Enter any names or strings you want to enter:");
      for(int i = 0; i < Size; i++){
         names[i] = sc.nextLine();
      }
      System.out.println("Original Strings You entered :");
      for(int j = 0; j < Size; j++){
         System.out.println(names[j]);
      }
      System.out.println("Strings after changing a letter (e) with (i) :");
      String changeNames[] = new String[Size];
      for(int k = 0; k < Size; k++){
         changeNames[k] = names[k].replace('e', 'i');
      }
      for(int n = 0; n < Size; n++){
         System.out.println(changeNames[n]);
      }
      sc.close();
   }
}

//ques 3 - Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

class ques3{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Email, demo email - abcx@gmail.com");
      String userEmail = sc.nextLine();
      String userName = "" ;
      for(int i = 0; i < userEmail.length(); i++){
         if(userEmail.charAt(i) == '@'){
            break;
         }
         else{
            userName += userEmail.charAt(i);
         }
      }
      System.out.println(String.format("Your username for our Oragnozation is : %s", userName));
      sc.close();
   }
}