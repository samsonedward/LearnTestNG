package ParameterizationTestNG;
import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.Test;

public class ParametersAtMethodLevel {
	
	/*
	    * Two test methods accepting parameters/arguments
	    */
	 //  @Parameters({"testParameters1","testParameters2"})
	   @Test
	   public void testMethod1(String testParameters1, String testParameters2)
	   {
	      System.out.println("Paramters one for test method 1: "+testParameters1);
	      System.out.println("Paramters two for test method 1: "+testParameters2);
	   }

	 //  @Parameters({"testParameters3","testParameters4"})
	   @Test
	   public void testMethod2(String testParameters1, String testParameters2)
	   {
	      System.out.println("Paramters one for test method 2: "+testParameters1);
	      System.out.println("Paramters two for test method 2: "+testParameters2);
	   }

}
