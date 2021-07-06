package TestNGTestcases;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsonTest
{
   @Test
   public void login()
   {
      System.out.println("Login");
   }
   
   @Test(dependsOnMethods="login")
   public void search()
   {
      System.out.println("Search");
      Assert.assertEquals("sam", "sam");
      
   }
   
   @Test(dependsOnMethods="search")
   public void advsearch()
   {
      System.out.println("Adv Search");
   }
   
   @Test(dependsOnMethods="advsearch")
   public void logout()
   {
      System.out.println("Logout");
   }
}
