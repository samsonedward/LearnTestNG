package TestNGAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*assertion is stored in org.testng.asserts.Softassert and we need to use this type of assertion
 *  when we want to continue our execution even after the assertion got failed. 
 *  Soft assertions will not be throwing an error when the assertions got failed, 
 *  but it continues the execution to the next step*/

public class SoftAssertion
{
	SoftAssert softAssert = new SoftAssert();
	String className = "SoftAssertion";

	@Test
	public void test_UsingSoftAssertion() 
	{
		softAssert.assertTrue(true == true);
		softAssert.assertEquals("SoftAssert", "SoftAssertion");
		softAssert.assertEquals(className, "SoftAssertion");
		System.out.println("Last statement gets executed!");
		softAssert.assertAll();
	}
}