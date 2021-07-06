package TestNGTestcases;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Dependingmethods 
{
   @Test
   public void method1() 
   {
      System.out.println("Method 1");
      // Failing test explicitly
      Assert.fail();
   }
   // This method will run only if method1 is passed. If method1 is failed or
   // skipped, method2 will not run.
   @Test(dependsOnMethods = "method1")
   public void method2() 
   {
      System.out.println("Method 2");
   }
   // Since method1 will fail, so method2 will be skipped. Since method2 is skipped, method3 will also be skipped as
   // method3 is dependent on method2
   @Test(dependsOnMethods = "method2")
   public void method3() 
   {
      System.out.println("Method 3");
   }
}
