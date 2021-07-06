package ParameterizationTestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParametersExampleAtClonstructor {

	// List of parameters
	   String p1;
	   String p2;
	   String p3;
	   String p4;
	   // Accept all parameters in Constructor from testng.xml
	   @Parameters({"confBeforeParameter","testParameters1","testParameters2","confAfterParameter"})
	   public ParametersExampleAtClonstructor(String s1, String s2, String s3, String s4)
	   {
	      // Initialize all parameters
	      System.out.println("in constructor");
	      p1=s1;
	      p2=s2;
	      p3=s3;
	      p4=s4;
	   }
	   // Use whatever parameters are needed in methods
	   // Note here I am not using any parameter in method signature and Parameters annotation
	   @BeforeMethod
	   public void configurationBeforeMethod()
	   {
	      System.out.println("Paramters for before configuration method: "+p1);
	   }
	   @Test
	   public void testMethod()
	   {
	      System.out.println("Paramters one for test method: "+p2);
	      System.out.println("Paramters two for test method: "+p3);
	   }
	   @AfterMethod
	   public void configurationAfterMethod()
	   {
	      System.out.println("Paramters for after configuration method: "+p4);
	   }

}
