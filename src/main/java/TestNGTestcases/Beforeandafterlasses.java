package TestNGTestcases;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class Beforeandafterlasses 
{
   @BeforeTest
   public void beforeTest0()
   {
      System.out.println("Class 2 Before Test");
   }
   @BeforeClass
   public void beforeClass2()
   {
      System.out.println("Class 2 Before Class");
   }
   @Test
   public void class2test1()
   {
      System.out.println("Class 2 Test1");
   }
   @AfterClass
   public void AfterClass()
   {
      System.out.println("Class 2 After Class");
   }
   @AfterTest
   public void aftertest()
   {
      System.out.println("Inside Class2 After Test");
   }
}
 


