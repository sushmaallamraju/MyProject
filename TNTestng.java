package JenkinsMavenTest.JenkinsMavenTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNTestng {
		public String baseUrl = "http://newtours.demoaut.com/";
		public   WebDriver driver;
		
		public String expected = null;
		public String actual = null;

		@BeforeTest
		public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver","/Users/sushmaallamraju/software/sel1/selenium-2.53.1/chromedriver");
	        driver = new ChromeDriver();  
			driver.get(baseUrl);
		}

		@BeforeMethod
		public void verifyHomePageTitle() {
			expected = "Welcome: Mercury Tours";
			actual = driver.getTitle();
			Assert.assertEquals(actual, expected);
		}

		@Test(priority=0)
		public void register() {
			driver.findElement(By.linkText("REGISTER")).click();
			expected = "Register: Mercury Tours";
			actual = driver.getTitle();
			Assert.assertEquals(actual, expected);
		}

		@Test(priority=1)
		public void support() {
			driver.findElement(By.linkText("SUPPORT")).click();
			expected = "Under Construction: Mercury Tours";
			actual = driver.getTitle();
			Assert.assertEquals(actual, expected);
		}

		@AfterMethod
		public void goBackToHomepage() {
			driver.findElement(By.linkText("Home")).click();

		}

		@AfterTest
		public void terminateBrowser() {
			driver.quit();
		}

	}
