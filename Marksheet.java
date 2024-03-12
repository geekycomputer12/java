import java.util.*;
class Marksheet
   {
      public static void main(String args[])
          {
             Scanner marks = new Scanner(System.in);

             System.out.println("Enter the marks of English");
             int English = marks.nextInt();

             System.out.println("Enter the marks of Maths");
             int Maths = marks.nextInt();

             System.out.println("Enter the marks of Computer");
             int Computer = marks.nextInt();

             System.out.println("Enter the marks of Sanskrit"); 
             int Sanskrit = marks.nextInt();

             System.out.println("Enter the marks of Hindi"); 
             int Hindi = marks.nextInt();

             int total = English + Maths + Hindi + Sanskrit + Computer;

             float percentage = total/5;

             System.out.println("Your Percentage is "+percentage);
              
             }
}