package TestNGTestcases;

import org.testng.annotations.Test;
public class InheritenceTestNGClass
{
   @Test
   public void $MethodOfSuper() 
   {
      System.out.println("Dollar Method of super class");
   }
  @Test
   public void AskSuperClass() 
   {
      System.out.println("Capital letter method of super class");
   }

public class PriorityExample extends InheritenceTestNGClass 
{
   @Test
   public void PrintMethod() 
   {
      System.out.println("Capital P method");
   }
   @Test
   public void printMethod()
   {
      System.out.println("Small P method");
   }
   @Test
   public void _Method() 
   {
      System.out.println("Underscore method");
   }
   @Test
   public void $Method() 
   {
      System.out.println("Dollar method");
   }
}

}
