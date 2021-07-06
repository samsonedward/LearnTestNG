package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

/*test execution should stop immediately is the assertions fail and will throw an assertion error. 
 * The test case also marked as failed when a hard condition fails.*/
public class HardAssertion 
{
	String className = "HardAssertion";

	@Test
	public void test_UsingHardAssertion()
	{
		Assert.assertTrue(true == true);

		/*
		 * Exception throws here java.lang.AssertionError: expected [HardAssertion] but
		 * found [HardAssert]
		 */

		Assert.assertEquals("HardAssert", "HardAssertion");

		Assert.assertEquals(className, "HardAssertion");

		System.out.println("Successfully passed!");
	}
}
