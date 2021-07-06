package TestNGTestcases;
import org.testng.Assert;
import org.testng.annotations.Test;
public class EnableAnnotation 
{
	
	//Timeout Attribute at Method Level//
	
	@Test(timeOut = 500,description="Simple TestNG Program")
	   public void timeTestOne() throws InterruptedException 
	   {
	      Thread.sleep(1000);
	      System.out.println("Time test method one");//Exceptions throws//
	     	   }
	   @Test(timeOut = 500)
	   public void timeTestTwo() throws InterruptedException 
	   {
	      Thread.sleep(400);
	      System.out.println("Time test method two");
	   }
	
	//Test Annotation //
	
   @Test(priority=0)
    public void methodfail() { 
      System.out.println("Fail Method");
    }
    @Test(dependsOnMethods="error",priority=2) 
    public void alwaysruntrue() { 
      System.out.println("Always run is true");
    }   
    @Test(enabled=true,priority=1)
   public void error()
    {
       System.out.println("Exception Occured");
    }
    
      @Test
    public void show()
    {
       System.out.println("Show Executed");
       Assert.assertFalse(2>5);
    }
    @Test(enabled=true)
    public void show1()
    {
       System.out.println("Show1 Executed");
       Assert.assertEquals("sam", "sam");   
    }
    @Test(dependsOnMethods="show1",alwaysRun=true) // There Is No Such Option For False
    public void show2()
    {
       System.out.println("Show2 Executed");
    }
}