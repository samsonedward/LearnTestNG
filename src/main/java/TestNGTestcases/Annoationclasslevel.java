package TestNGTestcases;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/*@test annotation in class level then all the method of that class will be treated as @test annotated method by default.*/
@Test
public class Annoationclasslevel 
{
	@BeforeClass
public void m1() throws InterruptedException
   {
	   Thread.sleep(4000);
      System.out.println("M1");
   }
   public void m2() throws InterruptedException
   {
	   Thread.sleep(4000);
      System.out.println("M2");
   }
   public void m3() throws InterruptedException
   {
	   Thread.sleep(4000);
      System.out.println("M3");
   }
   
 @AfterClass
   public void m4() throws InterruptedException
   {
	   Thread.sleep(4000);
      System.out.println("M4");
   }
}
