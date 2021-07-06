package TestNGTestcases;
import org.testng.annotations.Test;

/*1) $’ has the highest priority.
  2)Capital alphabets will be second priority.
  3)Underscore will have third priority.
   4)Small letter alphabets will be the fourth priority.*/

public class Highandlowpriorty 
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
