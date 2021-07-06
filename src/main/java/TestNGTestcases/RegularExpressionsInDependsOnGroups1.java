package TestNGTestcases;

import org.testng.annotations.Test;

public class RegularExpressionsInDependsOnGroups1 {


	// Test belong to Group registration
	   @Test(groups = "userAccess_registration", priority= 1)
	   public void signUp() 
	   {
	      System.out.println("Signed Up");
	   }
	   // Test belong to Group registrationStatus
	   @Test(groups = "userAccess_registrationStatus", priority= 2)
	   public void verifyRegistration() 
	   {
	      System.out.println("Registration Was successful");
	   }
	   // Tests belong to group login
	   @Test(groups = "userAccess_login", priority= 3)
	   public void logIn()
	   {
	      System.out.println("Logged In");
	   }
	   // Tests belong to group loginStatus
	   @Test(groups = "userAccess_loginStatus", priority= 4)
	   public void verifyLogIn() 
	   {
	      System.out.println("Log In was successful.");
	   }
	   // This test is dependent on all above groups. Since we have followed a naming pattern in group names, we can use regular expression with
	   // dependsOnGroups.
	   @Test(dependsOnGroups = { "userAccess_.*" })
	   public void purchaseSomething() 
	   {
	      System.out.println("purchased Something");
	   }
	   }
