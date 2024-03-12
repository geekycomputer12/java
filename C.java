import java.util.*;
class C
   {  
       public static void main(String args[])
           {
                Scanner temp = new Scanner(System.in);
                System.out.println("Enter the value of temperature in fahrenheit");
                Float fahrenheit = temp.nextFloat();
                Float celsius = (5*(fahrenheit-32))/9;
                System.out.println("Temperature in celsius is " +celsius);
            }
}
                
   