package TestNGTestcases;

 

import org.testng.annotations.Test;
public class Samepriorty 
{
   @Test(priority=1)
   public void M1withPriority()
   {
      System.out.println("M1withPriority");
   }
   // TestNG will assign priority as zero to this method
   @Test(priority=3)
   public void DuplicatePriorityMethod1()
   {
      System.out.println("DuplicatePriorityMethod1");
   }
   /*
    * There is tie between DuplicatePriorityMethod1 and DuplicatePriorityMethod2.
    * So TestNg will use here ASCII rule to decide which method to be run first.
    * Both methods have same name just before last character. Since '1' in DuplicatePriorityMethod1
    * will have lower ASCII then '2' in DuplicatePriorityMethod2. So DuplicatePriorityMethod1
    * will be run first followed by DuplicatePriorityMethod2.
    */
   @Test(priority=3)
   public void DuplicatePriorityMethod2()
   {
      System.out.println("DuplicatePriorityMethod2");
   }
   @Test(priority=2)
   public void M4withPriority()
   {
      System.out.println("M4withPriority");
   }
}
