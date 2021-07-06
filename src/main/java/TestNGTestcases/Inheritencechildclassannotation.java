package TestNGTestcases;
import org.testng.annotations.Test;
@Test
class superCLass 
{
}

/*@test on class level for the super class and the child class is extending the super class 
but there is no @test annotation in child class.However,child class methods are automatically annotated by @test method*/

public class Inheritencechildclassannotation extends superCLass 
{
   public void m1()
   {
      System.out.println("M1");
   }
   public void m2()
   {
      System.out.println("M2");
   }
   public void m3()
   {
      System.out.println("M3");
   }
   public void m4()
   {
      System.out.println("M4");
   }
}