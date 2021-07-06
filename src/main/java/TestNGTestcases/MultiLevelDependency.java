package TestNGTestcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MultiLevelDependency 
{
   @BeforeTest
   public void launchBrowser()
   {
	   System.out.println("Chrome Browser Launched");
   }
   @Test
   public void loadFacebookURL()
   {
	   System.out.println("Facebook Loaded");
   }
   /*
    * registerOnFacebook depends on loadFacebookURL
    */
   @Test(dependsOnMethods = { "loadFacebookURL" })
   public void registerOnFacebook() {
       System.out.println("Facebook");
   }
   
   /*
    * postStatusOnFacebook depends on registerOnFacebook
    */
       
   @Test(dependsOnMethods = { "registerOnFacebook" })
   public void postStatusOnFacebook() {
       System.out.println("Post an status on Facebook");
   }

   
}
