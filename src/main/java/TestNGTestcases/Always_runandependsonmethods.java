package TestNGTestcases;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Always_runandependsonmethods 
{
   @Test
   public void method1() 
   {
      System.out.println("Method 1");
      // Failing test explicitly
      Assert.fail();
   }
   // alwaysRun attribute will override dependsOnMethods if dependent method is failed or skipped
   @Test(dependsOnMethods = "method1", alwaysRun=true)
   public void method2() 
   {
      System.out.println("Method 2");
   }
   // alwaysRun attribute will override dependsOnMethods if dependent method is failed or skipped
   @Test(dependsOnMethods = "method2", alwaysRun=true)
   public void method3() 
   {
      System.out.println("Method 3");
   }
}