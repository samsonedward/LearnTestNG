package TestNGTestcases;

/*priority is set for the methods, then the execution will start from lowest to highest priority.
 negative, zero, or a positive value.  .*/
	
import org.testng.annotations.Test;
public class Priortylevel 
{
   // We can pass priority as negative value.
   @Test(priority=-1)
   public void NegativePrioirty()
   {
      System.out.println("Negative Prioirty");
   }
   // We can pass priority as default value zero.
   @Test(priority=0)
   public void ZerothPriority()
   {
      System.out.println("Zeroth Priority");
   }
   @Test(priority=1)
   public void PositivePriority()
   {
	   
      System.out.println("Positive Priority");
   }
   // It is not mandatory to pass priority in a order
   @Test(priority=100)
   public void SkippedPriority()
   {
      System.out.println("Skipped Priority");
   }
}