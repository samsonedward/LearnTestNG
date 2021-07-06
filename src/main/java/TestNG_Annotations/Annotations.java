package TestNG_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations  {

	String baseurl = "http://leafground.com/";
	String driverpath = "C:\\Users\\Samson Edward\\eclipse-workspace\\PlayGround_Testeaf\\drivers\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}

	@Test
	public void verifyHomepageTitle() {
		System.out.println("Test method");
		WebElement Edit = driver.findElement(By.linkText("Edit"));
		Edit.click();
		driver.findElement(By.id("email")).sendKeys("xzcxcxxzcx@gmail.com");

		/*WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("duck@gmail.com");*/

	}

	@AfterMethod
	public void run() {
		System.out.println(driver.getTitle());
		String expectedTitle = "TestLeaf - Selenium Playground";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterTest
	public void terminateBrowser() {
		driver.quit();
	}
}
