package TestNGTestcases;

import org.testng.annotations.Test;
public class RegularExpressionsInDependsOnGroups 
{
	
// Test belong to Group registration
   @Test(groups = "registration", priority= 1)
   public void signUp()
   {
      System.out.println("Signed Up");
   }
   // Test belong to Group registrationStatus
   @Test(groups = "registrationStatus", priority= 2)
   public void verifyRegistration() 
   {
      System.out.println("Registration Was successful");
   }
   // Tests belong to group login
   @Test(groups = "login", priority= 3)
   public void logIn() 
   {
      System.out.println("Logged In");
   }
   // Tests belong to group loginStatus
   @Test(groups = "loginStatus", priority= 4)
   public void verifyLogIn() 
   {
      System.out.println("Log In was successful.");
   }
   // This test is dependent on all above groups. You need to mention all group names explicitly here.
   @Test(dependsOnGroups = { "registration", "login", "registrationStatus", "loginStatus" })
   public void purchaseSomething() 
   {
      System.out.println("purchased Something");
   }
   
	
}