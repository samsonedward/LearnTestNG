package TestNGTestcases;

import org.testng.annotations.Test;

public class ignoreMissingDependencies {
	
	/*
	    * This test method depends on another test method named "Test1" which does not exist.
	    */
	   @Test(dependsOnMethods= {"Test1"})
	   public void Test2()
	   {
		   /*Exception throws depends on nonexistent method*/
		   
	      System.out.println("I am Test2");
	   }
	   	   
	   @Test(enabled= false)
	   
	   /*
	    * This test method depends on another test method named "Test1" which is not enabled.
	    * Setting ignoreMissingDependencies as true will make it soft dependency.
	    */
	   public void Test1()
	   {
	      System.out.println("I am Test1");
	      /* Exceptions occured  depending on method public void TestNGTestcases.ignoreMissingDependencies.Test1(), 
	      which is not annotated with @Test or not included*/
	   }

}

/*
 * This test method depends on another test method named "Test1" which is not enabled.
 * Setting ignoreMissingDependencies as true will make it soft dependency.
 */


