import java.util.*;
default class A
{ 
   void a()
          {
            System.out.println("In a class A");
          }
}

public class B 
{
   void b()
          {
            System.out.println("In a class B");
          }
}

class calling
{
  public static void main(String args[])
      {
        A a1 = new A();
        a1.a();

        B b1 = new B();
        b1.b();
      } 
}

