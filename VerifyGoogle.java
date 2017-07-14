package JenkinsMavenTest.JenkinsMavenTest;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class VerifyGoogle {
	public WebDriver driver;


	@BeforeTest
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver","/Users/sushmaallamraju/software/sel1/selenium-2.53.1/chromedriver");
	     driver = new ChromeDriver();   
	}
	@AfterTest
	public void closeBrowser(){
	driver.close();
	}
	@Test(priority=1)
	public void verifyGmailpage(){
	driver.get("https://www.gmail.com");
	Assert.assertEquals("Gmail", driver.getTitle());
	}
	
	}


