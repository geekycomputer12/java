import java.util.*;
class identify_numbers
   {
      public static void main(String aargs[])
        {
          Scanner answer = new Scanner(System.in);
          System.out.println("Enter a Number : ");
          int number = answer.nextInt();

          if(number == 0 )
            {
                System.out.println("Given no is zero");
            }

          else if (number < 0)
            {
               System.out.println("Given no is Negative");
            } 
       

          else if (number > 0)
           {
               System.out.println("Given no is Positive");
           }
           
          else
           {
               System.out.println("Enter any Numbers");
           }
 }
}