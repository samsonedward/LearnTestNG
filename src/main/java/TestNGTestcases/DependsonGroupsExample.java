package TestNGTestcases;
import org.testng.annotations.Test;
public class DependsonGroupsExample

/*If you ware executing the entire suite or class, always the parent groups will execute first, and after that, only the dependent groups will be run.
If you are only running the dependent group, then also the parent groups executed first and later dependent group will be executed.
If in the parent group and test methods got failed, then the dependent group will not run, and it will mark as skipped.*/

{

// Test method belong to preSetupTestA
@Test(groups= {"preSetupTestA"})
public void methodA()
{
   System.out.println("MethodA");
}
//Test method belong to preSetupTestA
@Test(groups= {"preSetupTestA"})
public void methodB()
{
   System.out.println("MethodB");
}
// Test method belong to preSetupTestB
@Test(groups= {"preSetupTestB"})
public void methodC()
{
   System.out.println("MethodC");
}
// Test method belong to preSetupTestB
@Test(groups= {"preSetupTestB"})
public void methodD()
{
   System.out.println("MethodD");
}
// Test method which is dependent of other groups
@Test(dependsOnGroups = {"preSetupTestB", "preSetupTestA"})
public void finalTest()
{
   System.out.println("Final Test.");
}
}
