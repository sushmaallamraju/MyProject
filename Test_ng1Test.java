package MTestProj.MavenTestProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;			

public class Test_ngTest {
	 WebDriver driver;
	    
	    @BeforeTest
	    public void setup() throws Exception {
	    	 System.setProperty("webdriver.chrome.driver","/Users/sushmaallamraju/software/sel1/selenium-2.53.1/chromedriver"); 
	 		driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	         driver.get("https://www.yahoo.com/"); 
	    } 
	   
	   /* 
	   @Test
	   public void loginMethod() throws InterruptedException{
		 driver.findElement (By.id("email")).sendKeys("sushma.allamraju@gmail.com");
		  //driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")) .click();
		  driver.findElement(By.id("pass")).sendKeys("Harish09");
		  Thread.sleep(2000);
		  driver.findElement(By.id("loginbutton")).submit();
	   }
	   
	   */
	    @AfterTest
	         public void tearDown() throws Exception { 
	    	Thread.sleep(3000);
	         driver.quit(); 
	    } 
	}	