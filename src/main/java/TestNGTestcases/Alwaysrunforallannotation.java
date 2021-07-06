package TestNGTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Alwaysrunforallannotation 
{
   @BeforeSuite
   //Before Suite would be Failes due to java.lang.AssertionError: null.
   /*Skips other configuration methods and test methods also*/
   
   public void beforeSuiteMethod()
   {
      System.out.println("beforeSuite");
      // We fail this method explicitly
      Assert.fail();
   }
   @BeforeTest
   public void beforeTestMethod()
   {
      System.out.println("beforeTest");
   }
   @BeforeClass
   public void beforeClassMethod()
   {
      System.out.println("beforeClass");
   }
   @BeforeMethod
   public void beforeMethodMethod()
   {
      System.out.println("beforeMethod");
   }
   @Test
   public void testMethod()
   {
      System.out.println("test");
   }
   @AfterSuite(alwaysRun=true)
   public void afterSuiteMethod()
   {
      System.out.println("afterSuite");
   }
   @AfterTest
   public void afterTestMethod()
   {
      System.out.println("afterTest");
   }
   @AfterClass
   public void afterClassMethod()
   {
      System.out.println("afterClass");
   }
   @AfterMethod
   public void afterMethodMethod()
   {
      System.out.println("afterMethod");
   }
}
