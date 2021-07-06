package TestNGTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

/*parent method failed, the dependent method got skipped, but that time, 
we don’t know that the skipped method is a failed method or not in the test.*/

public class HardsoftDependency {
	
	/*HARD DEPEDENCY*/
	
	// Explicitly failing method on which Sanity is dependent
	   @Test
	   public void smoke()
	   {
	      System.out.println("Smoke Testing in Progress for Testing");
	      Assert.fail();
	   }
	   // Sanity  will not run as Smoke has failed. Test2 will be marked as skipped.
	   @Test(dependsOnMethods= {"smoke"})
	   public void Sanity()
	   {
	      System.out.println("I will not Run is the smoke is failed");
	   }
	   
	/*SOFT DEPENDENCY*/
	   
	   // Regression  will run as Smoke has failed. smoke  will be marked as skipped.
	   
	   @Test(dependsOnMethods= {"smoke"}, alwaysRun= true)
	   public void Regression()
	   {
	      System.out.println("I will Run is the smoke is failed");
	   }

}
