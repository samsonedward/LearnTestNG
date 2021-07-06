package ParameterizationTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*@Parameters annotation can be used for any of the @Before, @After, @Factory, and @Test annotated methods*/

public class ParametersThroughXML {
	/*
	 * We need to add Parameters annotation to read value from testng xml. Note here
	 * that attribute name passed in Parameters must be same as testng xml.
	 */

	@Parameters({ "confBeforeParameter" })

	@BeforeMethod
	public void configurationBeforeMethod(String confBeforeParameter) {
		System.out.println("Paramters for before configuration method: “+confBeforeParameter");
	}

	@Parameters({ "testParameters1", "testParameters2" })

	@Test
	public void testMethod(String testParameters1, String testParameters2) {
		System.out.println("Paramters one for test method: " + testParameters1);
		System.out.println("Paramters two for test method: " + testParameters2);
	}

	@Parameters({ "confAfterParameter" })
	@AfterMethod
	public void configurationAfterMethod(String confAfterParameter) {
		System.out.println("Paramters for after configuration method: " + confAfterParameter);
	}
}
